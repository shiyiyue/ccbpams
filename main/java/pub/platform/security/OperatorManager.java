package pub.platform.security;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pub.auth.MD5Helper;
import pub.platform.advance.utils.PropertyManager;
import pub.platform.db.ConnectionManager;
import pub.platform.db.DatabaseConnection;
import pub.platform.system.manage.dao.PtDeptBean;
import pub.platform.system.manage.dao.PtOperBean;
import pub.platform.utils.BusinessDate;
import pub.platform.utils.ImgSign;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * Title: OperatorManager.java
 * </p>
 * <p>
 * Description: This class includes the basic behaviors of operator.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 *
 * @author WangHaiLei
 * @version 1.6 $ UpdateDate: Y-M-D-H-M: 2003-12-02-09-50 2004-03-01-20-35 $
 */
public class OperatorManager implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(OperatorManager.class);
    /**
     * operatorid�Ǵ�login(operatorid, password)�еõ��ġ�
     */
    private String fimgSign = "";

    private String operatorname = null;

    private String operatorid = null;

    //��ǰȨ���µĲ˵���������Ӳ˵���
    private String xmlString = null;

    //��ǰȨ���µ�ȫ���˵�
    private String jsonString = null;

    /*
    20100820 zhanrui
    ��ǰȨ���µİ���targetmachine����Ĳ˵���
    Ŀǰֻ��Ϊ������
    1��default����Ҫ��ҵ��˵���targetmachine Ϊ�ջ� Ϊdefault��
    2��system����Ҫ��ϵͳ������ز˵�
     */
    private Map jsonMap = new HashMap();

    private Resources resources;

    private String[] roles = new String[]{};

    private MenuBean mb;

    private List jsplist = null;

    private PtOperBean operator;

    private String remoteAddr = null;

    private String remoteHost = null;

    private String loginTime = BusinessDate.getTodaytime();

    private boolean isLogin = false;

    private String filePath = "";

    private String safySign = "";

    private String clientInfo = "";
    private String userAgent = "";

    public OperatorManager() {

        // //����ͼƬ��ʾ
        createImgSign();
    }

    /**
     * @return
     */
    public String getXmlString() {
        return (this.xmlString);
    }

    // ////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * ����һ��Operator Object�����Ojbect�а����ò���Ա�Ļ�����Ϣ��������operid, email, enabled, sex,
     * status, opername��
     *
     * @return Operator Ojbect.
     */
    public PtOperBean getOperator() {
        return operator;
    }

    public String filePath() {
        return filePath;
    }

    /**
     * �õ���ǰ����Ա��operatorname��
     *
     * @return
     */
    public String getOperatorName() {
        return operator.getOpername();
    }

    /**
     * @return
     */
    public String getOperatorId() {
        return operatorid;
    }

    /**
     * ����Աǩ������֤operid+passwd�Ƿ���ȷ ǩ���ɹ��� 1.isLogin=true 2.ȡ�øò���Ա��ص����н�ɫ 3.��ʼ����Դ�б�
     * 4.ȡ�ò���Ա�Ĳ˵�
     *
     * @param operid
     * @param password
     * @return boolean
     * @roseuid 3F80B6360281
     */
    public boolean login(String operid, String password) {

        ConnectionManager cm = ConnectionManager.getInstance();
        DatabaseConnection dc = cm.get();
        //SqlSession session = IbatisFactory.ORACLE.getInstance().openSession();
        try {
            String loginWhere;
            String development = PropertyManager.getProperty("development");
            if (StringUtils.isNotEmpty(development) && "1".equals(development)) {
                loginWhere = "where operid='" + operid + "' and operenabled='1'";
                System.out.println("�ѽ��뿪��ģʽ...");
            } else {
                loginWhere = "where operid='" + operid
                        + "' and operpasswd ='" + MD5Helper.getMD5String(password) + "'and operenabled='1'";
            }

            this.operatorid = operid;
            operator = new PtOperBean();
            operator = (PtOperBean) operator.findFirstByWhere(loginWhere);
            if (operator == null) {
                isLogin = false;
                saveLoginFailLog(operid);
                return false;
            }

            String sss = "��¼ʱ�� :" + loginTime + " IP: " + remoteAddr
                    + " �������� : " + remoteHost + " ClientInfo : " + clientInfo;

            operator.setFillstr600(sss);

            PtDeptBean ptpdet = new PtDeptBean();

            operator.setPtDeptBean((PtDeptBean) ptpdet
                    .findFirstByWhere("where deptid='" + operator.getDeptid()
                            + "'"));

            this.operatorname = operator.getOpername();
            isLogin = true;
            // ȡ�øò���Ա�����н�ɫ��dep
            // PtOperRoleBean porb = new PtOperRoleBean();
            // List porbs = porb.findByWhere("where operid='"+operid+"'");
            // roles = new String[porbs.size()];
            // for ( int i = 0 ; i < porbs.size() ; i++ ) {
            // roles[i] = ((PtOperRoleBean)porbs.get(i)).getRoleid();
            // }
            // ��ʼ����Դ�б�
            resources = new Resources(operid);
            // ��ʼ���˵���
            try {
                mb = new MenuBean();

                //this.xmlString = mb.generateStream(operid);
                //this.jsonString = mb.generateJsonStream(operid);
                this.jsonMap.put("default", mb.generateJsonStream(operid, "default"));
                this.jsonMap.put("system", mb.generateJsonStream(operid, "system"));

            } catch (Exception ex3) {
                ex3.printStackTrace();
                System.err.println("Wrong when getting menus of operator: [ "
                        + ex3 + "]");
            }

            //�����¼�ɹ���־
            saveLoginSuccessLog();
            return isLogin;
        } catch (Exception e) {
            logger.error("��ȡ��¼��Ϣ����", e);
            return false;
        } finally {
            cm.release();
            //session.close();
        }
    }

    private void saveLoginSuccessLog() {
        if (StringUtils.isBlank(userAgent)) {
            userAgent = "";
        } else {
            if (userAgent.length() > 40) {
                userAgent = userAgent.substring(0, 40);
            }
        }
        String sSql = "insert into ptoplog" +
                "  (guid," +
                "   action_id," +
                "   action_name," +
                "   oper_id," +
                "   oper_name," +
                "   oper_branchid," +
                "   oper_branchname," +
                "   op_date,host_ip," +
                "   op_log)" +
                "values" +
                "  (sys_guid(), " +
                "  'login_success', " +
                "  '��¼ϵͳ�ɹ�'," +
                "  '" + operator.getOperid() + "'," +
                "  '" + operator.getOpername() + "'," +
                "  '" + operator.getPtDeptBean().getDeptid() + "'," +
                "  '" + operator.getPtDeptBean().getDeptname() + "'," +
                "   sysdate," +
                "  '" + remoteAddr + "'," +
                "  '" + clientInfo  + "-" + userAgent + "')";

        ConnectionManager cm = ConnectionManager.getInstance();
        DatabaseConnection dc = cm.get();
        try {
            dc.executeUpdate(sSql);
        } finally {
            cm.release();
        }
    }

    private void saveLoginFailLog(String operid) {
        String sSql = "insert into ptoplog" +
                "  (guid," +
                "   action_id," +
                "   action_name," +
                "   oper_id," +
                "   op_date,host_ip," +
                "   op_log)" +
                "values" +
                "  (sys_guid(), " +
                "  'login_fail', " +
                "  '��¼ϵͳʧ��'," +
                "  '" + operid + "'," +
                "   sysdate," +
                "  '" + remoteAddr + "'," +
                "  '��¼ϵͳʧ��')";

        ConnectionManager cm = ConnectionManager.getInstance();
        DatabaseConnection dc = cm.get();
        try {
            dc.executeUpdate(sSql);
        } finally {
            cm.release();
        }
    }

    /**
     * @return ArrayList
     * @roseuid 3F80B71A01BC
     */
    public List getJspList() {
        return jsplist;
    }

    /**
     * @return boolean
     * @roseuid 3F80B71A00BC
     */
    public boolean isLogin() {
        return isLogin;
    }

    /**
     * ����Ȩ�� 1��ȡ���Ϸ���Դ��ʶ 2��ʹ��Resources��checkPermission����У��
     *
     * @param resource
     * @return boolean
     * @roseuid 3F80B8590151
     */
    public boolean checkPermission(String resource, int type, String url) {
        boolean permit = resources.checkPermission(resource, type, url);
        return permit;
    }

    /**
     * ǩ��
     */
    public void logout() {

        isLogin = false;
        resources = null;
        operator = null;
        operatorname = null;
        operatorid = null;
        roles = null;
        mb = null;
        xmlString = null;
        jsonString = null;
        remoteHost = null;
        remoteAddr = null;
        loginTime = null;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public void setRemoteHost(String remoteHost) {
        this.remoteHost = remoteHost;
    }

    public void createImgSign2() {

        try {
            String deptfillstr100 = PropertyManager.getProperty("cims");
            deptfillstr100 = new String(deptfillstr100.getBytes(), "GBK");
            String lastFile = System.currentTimeMillis() + "";

            ImgSign imgSign = new ImgSign();
            filePath = "/images/" + lastFile + ".jpg";
            safySign = imgSign.creatImgSign(deptfillstr100 + filePath);

        } catch (Exception e) {
        }

		/*
         * try { String deptfillstr100 = PropertyManager.getProperty("cims");
		 * deptfillstr100 = new String(deptfillstr100.getBytes(), "GBK"); String
		 * lastFile = System.currentTimeMillis() + "";
		 * 
		 * File file = new File(deptfillstr100 + "/images"); if (!file.exists()) {
		 * file.mkdir(); }
		 * 
		 * File f = new File(deptfillstr100 + "/images"); File[] files =
		 * f.listFiles(); for (int i = 0; i < files.length; i++) { if
		 * (files[i].isFile() && files[i].exists()) {
		 * 
		 * if (Integer.parseInt((System.currentTimeMillis() + "") .substring(0,
		 * 5)) - Integer.parseInt(Util.strtoint(files[i].getName() .substring(0,
		 * 5))) > 0) files[i].delete();
		 *  } }
		 * 
		 * ImgSign imgSign = new ImgSign(); filePath = "/images/" + lastFile +
		 * ".jpg"; safySign = imgSign.creatImgSign(deptfillstr100 + filePath);
		 *  } catch (Exception e) {
		 *  }
		 */

    }

    public boolean ImgSign(String sign) {
        boolean retbool = false;

        try {
            ImgSignDel();

            if (sign.equals(safySign))
                retbool = true;

            return retbool;
        } catch (Exception e) {
            return retbool;
        }

    }

    public void ImgSignDel() {
        try {
            String deptfillstr100 = PropertyManager.getProperty("cims");
            deptfillstr100 = new String(deptfillstr100.getBytes(), "GBK");
            File f = new File(deptfillstr100 + filePath);
            if (f.exists())
                f.delete();

        } catch (Exception e) {

        }
    }

    private void createImgSign() {
        fimgSign = "";

        try {

            int rad = (int) Math.round(Math.random() * 10);
            if (rad == 10)
                rad = 9;
            fimgSign += rad;

            rad = (int) Math.round(Math.random() * 10);
            if (rad == 10)
                rad = 9;
            fimgSign += rad;

            rad = (int) Math.round(Math.random() * 10);
            if (rad == 10)
                rad = 9;
            fimgSign += rad;

            rad = (int) Math.round(Math.random() * 10);
            if (rad == 10)
                rad = 9;
            fimgSign += rad;

        } catch (Exception e) {

        }
    }

    public String getImgSign() {

        return fimgSign;
    }

    public String getJsonString() {
        return jsonString;
    }

    public String getJsonString(String target) {
        return (String) this.jsonMap.get(target);
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public String getRemoteHost() {
        return remoteHost;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
