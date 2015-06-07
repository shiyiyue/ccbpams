<%@ page import="pub.platform.db.ConnectionManager" %>
<%@ page import="pub.platform.db.DatabaseConnection" %>
<%@ page import="pub.platform.db.RecordSet" %>
<%@ page import="pub.tools.PlatformHelper" %>
<%@ page contentType="text/html; charset=GBK" %>
<%@ include file="/pages/security/loginassistor.jsp" %>
<%
    response.setContentType("text/html; charset=GBK");
    String contextPath = request.getContextPath();

    /*2011-4-7 Cookie������ӵ�loginassistor.jsp��*/
    String jsonDefaultMenu = null;
    String jsonSystemMenu = null;
    try {
        jsonDefaultMenu = om.getJsonString("default");
        jsonSystemMenu = om.getJsonString("system");
    } catch (Exception e) {
        System.out.println("jsp" + e + "\n");
    }
    String deptname = "";
    String operid = "";

    String rolesall = null;

    if (om != null) {
        if (om.getOperator() != null) {
            username = om.getOperatorName();
            operid = om.getOperator().getOperid();
            if (om.getOperator().getPtDeptBean() != null)
                deptname = om.getOperator().getPtDeptBean().getDeptname();

            //��ɫ
            List roles = new ArrayList();
            DatabaseConnection conn = ConnectionManager.getInstance().get();
            RecordSet rs = conn.executeQuery("select a.roledesc from ptoperrole b right join ptrole a on b.roleid = a.roleid  where b.operid='" + operid + "'");
            while (rs.next()) {
                roles.add(rs.getString("roledesc"));
            }
            ConnectionManager.getInstance().release();
            rolesall = " ";
            for (int i = 0; i < roles.size(); i++) {
                rolesall += roles.get(i) + " ";
            }
        }
    }

%>

<%--<!DOCTYPE html>--%>
<html>
<head>
    <title>��׼Ӫ�����ݲֿ�ϵͳ</title>
    <meta http-equiv="X-UA-Compatible" content="IE=5"/>

    <script src="../../dhtmlx/dhtmlxTabbar/codebase/dhtmlxcommon.js" type="text/javascript"></script>
    <script src="../../dhtmlx/dhtmlxTabbar/codebase/dhtmlxcontainer.js" type="text/javascript"></script>

    <link rel="stylesheet" type="text/css" href="../../dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.css"/>
    <link rel="stylesheet" type="text/css"
          href="../../dhtmlx/dhtmlxLayout/codebase/skins/dhtmlxlayout_dhx_skyblue.css"/>
    <script src="../../dhtmlx/dhtmlxLayout/codebase/dhtmlxlayout.js" type="text/javascript"></script>

    <link rel="stylesheet" type="text/css"
          href="../../dhtmlx/dhtmlxAccordion/codebase/skins/dhtmlxaccordion_dhx_skyblue.css"/>
    <script src="../../dhtmlx/dhtmlxAccordion/codebase/dhtmlxaccordion.js" type="text/javascript"></script>

    <link rel="stylesheet" type="text/css" href="../../dhtmlx/dhtmlxTree/codebase/dhtmlxtree.css"/>
    <script src="../../dhtmlx/dhtmlxTree/codebase/dhtmlxtree.js" type="text/javascript"></script>
    <script src="../../dhtmlx/dhtmlxTree/codebase/ext/dhtmlxtree_json.js" type="text/javascript"></script>

    <link rel="stylesheet" type="text/css" href="../../dhtmlx/dhtmlxTabbar/codebase/dhtmlxtabbar.css"/>
    <script src="../../dhtmlx/dhtmlxTabbar/codebase/dhtmlxtabbar.js" type="text/javascript"></script>


    <script type="text/javascript" src="homePage_layout.js"></script>
    <script type="text/javascript" src="homePage_tab.js"></script>
    <LINK href="<%=contextPath%>/css/diytabbar.css" type="text/css" rel="stylesheet">
    <style type="text/css">
        html, body {
            margin: 0px;
            width: 100%;
            height: 100%;
            padding: 0px;
            overflow: hidden;
        }

        .divlayout {
            position: relative;
            top: 0px;
            left: 0px;
            width: 100%;
            height: 100%;
            margin: 0px;
            padding: 0px;
            overflow: hidden;
        }

        .headfont {
            font-size: 12px;
            font-family: SimSun;
            color: #7387A0;
        }

        .skin-top-right {
            background-position: top right;
            background-repeat: no-repeat;
            background-image: url(../../images/top_right.jpg)
        }
    </style>

    <script type="text/javascript">
        var contextPath = '<%=contextPath%>';
        var defaultMenuStr = '<%=jsonDefaultMenu%>';
        var systemMenuStr = '<%=jsonSystemMenu%>';
        function doOnLoad() {
            bizdhxLayout = new dhtmlXLayoutObject("bizlayout", "2U", "dhx_skyblue");
            doBizLoad();
            sysdhxLayout = new dhtmlXLayoutObject("syslayout", "2U", "dhx_skyblue");
            doSysLoad();
            tabbarhide("bizlayout");
            document.getElementById("biz").setAttribute("active", "true");
            document.getElementById("biz").className = "tabs-item-active";
        }

        function Relogin() {
            parent.window.reload = "true";
            parent.window.location.replace("<%=contextPath%>/pages/security/logout.jsp");
        }
    </script>
</head>

<body onload="doOnLoad()" onResize="doOnResize();">

<%--�ر�tabʱ������һ�������tab--%>
<input type="hidden" id="lasttabdivid">

<div class="skin-top-right">
    <table width="100%" cellpadding="0" cellspacing="0" style="margin:0px;padding:0px;height:100%;">
        <tr style="width:100%; height:45px">
            <td width="5%" rowspan="2">
                &nbsp;
                <img src="../../images/ccb.jpg" height="60px">
            </td>
            <td colspan="2">
                <img src="../../images/pamstitle1.jpg" height="40px" style="margin-left: 5px">
            </td>
            <td style="text-align:right" class="headfont">
                <span>����,<%=username%>! </span>
                <span><%= " | [" + rolesall + "] |" %></span>
                <span onclick="changepwd()" onMouseOver="this.style.cursor='hand'">�޸�����</span>
                <span onclick="Relogin()" onMouseOver="this.style.cursor='hand'">| �˳�&nbsp;&nbsp;</span>
            </td>
        </tr>
        <tr style="width:100%; height:25px">
            <td colspan="3" style="height:25px;">
                <div onclick="tabbarclk(this);" active="true" id="biz" class="tabs-item-active"
                     style="float:left;width:80px;margin-left:12px;">
                    <span style="width:100%;">ҵ�����</span>
                </div>
                <div style="float:left;width:2px;"></div>
                <div onclick="tabbarclk(this);" active="false" id="sys" class="tabs-item"
                     style="float:left;width:80px;">
                    <span style="width:100%;">ϵͳ����</span>
                </div>
                <div style="float:left;width:2px;"></div>
                <div onclick="tabbarclk(this);" active="false" id="help" class="tabs-item"
                     style="float:left;width:80px;">
                    <span style="width:100%;">��������</span>
                </div>
                <div style="float:left;width:2px;"></div>
                <div onclick="tabbarclk(this);" active="false" id="ver" class="tabs-item"
                     style="float:left;width:80px;">
                    <span style="width:100%;">�汾��ʷ</span>
                </div>
            </td>
        </tr>
        <tr style="width:100%; height:4px">
            <td width="100%" style="height:4px;background-color: #3169AD;" colspan="4"></td>
        </tr>
        <tr style="width:100%">
            <td width="100%" colspan="4">
                <div class="divlayout" id="bizlayout"></div>
                <div class="divlayout" id="syslayout"></div>
                <div class="divlayout" id="helplayout">
                    <br/>ϵͳ������Ϣ...
                </div>
                <div class="divlayout" id="verlayout">
                    <br/>�汾������ʷ...
                </div>
            </td>
        </tr>
    </table>
</div>
</body>

</html>