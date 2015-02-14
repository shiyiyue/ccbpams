package pams.tools.sms;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by suntengfei on 15-1-15.
 */
public class MessageTools {

    /**
     * Created by suntengfei on 15-1-15.
     * 生成单笔短信发送报文
     * <p/>
     * 传入参数按照以下格式（各参数间以"|"分割，且必须按照如下顺序）：
     * 请求系统编号|消息服务帐号|部门（分行）ID|客户渠道终端地址|消息类型|接入系统号码|短信类型编码|付费号码|手机号码|短消息的内容|客户号（证件号）|客户姓名|
     * 账户信息（帐号）|账户变动通知标志|签约客户所在的网点机构编码|营销短信提交人的9位操作员编码|营销短信审核人的9位操作员编码
     * <p/>
     * 返回参数即为要发送的报文
     */
    public String getSingleMessage(String messageArry) {
        String[] messages = messageArry.split("\\|");
        String messageBody = "";
        for (int i = 4; i < messages.length; i++) {
            String checkNessage = checkSingleMessageBody(messages[i], i);
            if (checkNessage.indexOf("false") >= 0) {
                return checkNessage;
            } else {
                messageBody = messageBody + checkNessage;
            }
        }
        return getMessage(messages[0], messages[1], messages[2], messages[3], messageBody, "001");
    }


    /**
     * Created by suntengfei on 15-1-15.
     * 生成批量短信发送报文
     * <p/>
     * 传入参数为以下顺序的数组：
     * 操作员号|请求系统编号|消息服务帐号|部门（分行）ID|客户渠道终端地址|消息类型|优先级|业务系统编号|文件名称|文件大小|短信数量
     * <p/>
     * 返回参数即为要发送的报文
     */
    public String getBatchOfMessage(String[] messages) {
        // String[] messages = messageArry.split("\\|");
        String messageBody = "";
        for (int i = 5; i < messages.length; i++) {
            String checkNessage = checkBatchBody(messages[i], i);
            if (checkNessage.indexOf("false") >= 0) {
                return checkNessage;
            } else {
                messageBody = messageBody + checkNessage;
            }
        }
        return getMessage(messages[1], messages[2], messages[3], messages[4], messageBody, "002");
    }

    /**
     * Created by suntengfei on 15-1-15.
     * 解析返回报文（单笔，批量通用）
     * <p/>
     * 传入参数为返回的报文（不包括报文开头的报文长度字段）和想到得到的返回报文的具体字段的序号
     * <p/>
     * 返回参数即为返回报文的相应字段信息，各字段之间已"|"分割，顺序为传入的字段序号的顺序
     * <p/>
     * 以下为返回报文的字段和序号对应表：
     * <p/>
     * 消息服务帐号           1
     * 部门（分行）ID         2
     * 系统请求日期           3
     * 系统请求时间           4
     * 请求系统流水号         5
     * 处理完成时间           6
     * 客户渠道终端地址       7
     * 交易代码               8
     * 交易状态               9
     * 响应 码                10
     * 响应信息               11
     */
    public String getResponse(String message, int... responseNo) {
        return getResponseProduct(message, responseNo);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Created by suntengfei on 15-1-15.
     * 检查单笔短信报文体每个字段长度是否符合要求
     */
    private String checkSingleMessageBody(String message, int i) {
        switch (i) {
            case 4:
                if (message.length() != 3) {
                    return "\"消息类型\"长度不符合要求false" + message;
                } else {
                    return message;
                }
            case 5:
                if (message.length() != 6) {
                    return "\"接入系统号码\"长度不符合要求false";
                } else {
                    return message;
                }
            case 6:
                if (message.length() > 20) {
                    return "\"短信类型编码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 20);
                }
            case 7:
                if (message.length() > 15) {
                    return "\"付费号码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 15);
                }
            case 8:
                if (message.length() > 13) {
                    return "\"手机号码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 13);
                }
            case 9:
                return String.format("%04d", message.getBytes().length) + message;
            case 10:
                if (message.length() > 32) {
                    return "\"客户号（证件号）\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 32);
                }
            case 11:
                if (message.length() > 20) {
                    return "\"客户姓名\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 20);
                }
            case 12:
                if (message.length() > 40) {
                    return "\"账户信息（帐号）\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 40);
                }
            case 13:
                if (message.length() > 6) {
                    return "\"账户变动通知标志\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 14:
                if (message.length() > 9) {
                    return "\"签约客户所在的网点机构编码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 9);
                }
            case 15:
                if (message.length() > 9) {
                    return "\"营销短信提交人的9位操作员编码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 9);
                }
            case 16:
                if (message.length() > 9) {
                    return "\"营销短信审核人的9位操作员编码\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 9);
                }

        }
        return null;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * 检查批量短信报文体每个字段长度是否符合要求
     */
    private String checkBatchBody(String message, int i) {
        switch (i) {
            case 5:
                if (message.length() != 3) {
                    return "\"消息类型\"长度不符合要求false";
                } else {
                    return message;
                }
            case 6:
                if (message.length() > 2) {
                    return "\"优先级\"长度不符合要求false";
                } else {
                    return stringFormatR(message, 2);
                }
            case 7:
                if (message.length() > 6) {
                    return "\"业务系统编号\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 8:
                if (message.length() > 64) {
                    return "\"文件名称\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 64);
                }
            case 9:
                if (message.length() > 6) {
                    return "\"文件大小\"长度超出系统要求false";
                } else {
                    return stringFormatR(message, 6);
                }
            case 10:
                if (message.length() > 5) {
                    return "\"短信数量\"长度超出系统要求false";
                } else {
                    return stringFormatL(message, 5);
                }

        }
        return null;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * 得到最终报文
     */
    private String getMessage(String ReqSysNoString, String svrNo, String branch_id, String ip, String messageBody, String flag) {
        ReqSysNoString = stringFormatR(ReqSysNoString, 4);

        if (svrNo.length() > 15) {
            return "\"消息服务帐号\"长度不符合要求";
        } else {
            svrNo = stringFormatR(svrNo, 15);
        }
        if (branch_id.length() > 11) {
            return "\"部门（分行）ID\"长度不符合要求";
        } else {
            branch_id = stringFormatR(branch_id, 11);
        }
        if (ip.length() > 16) {
            return "\"客户渠道终端地址\"长度不符合要求";
        } else {
            ip = stringFormatR(ip, 16);
        }
        /*message=message + svrNo + branch_id + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +
                flag + GenerateSequenceUtil.generateSequenceNo() + ip + "M00" + flag + messageBody;*/
        String message = "M00" + flag + ReqSysNoString + svrNo + branch_id + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) +
                flag + GenerateSequenceUtil.generateSequenceNo() + ip + messageBody;
        return String.format("%04d", message.getBytes().length) + message;
    }

    /**
     * Created by suntengfei on 15-1-15.
     * 解析返回报文
     */
    private String getResponseProduct(String message, int[] responseNo) {
        int messageL = message.length();
        if (messageL < 150) {
            return message;
        }
        String messageResponses = "";
        for (int i = 0; i < responseNo.length; i++) {
            switch (responseNo[i]) {
                case 1:
                    messageResponses = messageResponses + message.substring(0, 15).trim() + "|";
                    break;
                case 2:
                    messageResponses = messageResponses + message.substring(15, 26).trim() + "|";
                    break;
                case 3:
                    messageResponses = messageResponses + message.substring(26, 34).trim() + "|";
                    break;
                case 4:
                    messageResponses = messageResponses + message.substring(34, 40).trim() + "|";
                    break;
                case 5:
                    messageResponses = messageResponses + message.substring(40, 60).trim() + "|";
                    break;
                case 6:
                    messageResponses = messageResponses + message.substring(60, 94).trim() + "|";
                    break;
                case 7:
                    messageResponses = messageResponses + message.substring(94, 126).trim() + "|";
                    break;
                case 8:
                    messageResponses = messageResponses + message.substring(126, 132).trim() + "|";
                    break;
                case 9:
                    messageResponses = messageResponses + message.substring(132, 142).trim() + "|";
                    break;
                case 10:
                    messageResponses = messageResponses + message.substring(142, 154).trim() + "|";
                    break;
                case 11:
                    messageResponses = messageResponses + message.substring(154, messageL).trim() + "|";
                    break;
            }
        }

        return messageResponses.substring(0, messageResponses.length() - 1);
    }

    private String stringFormatR(String str, int lenth) {
        int strL = str.getBytes().length;
        for (int i = 0; i < lenth - strL; i++) {
            str = str + " ";
        }
        return str;
    }

    private String stringFormatL(String str, int lenth) {
        int strL = str.getBytes().length;
        for (int i = 0; i < lenth - strL; i++) {
            str = " " + str;
        }
        return str;
    }
   /* public static void main(String[] args){
        // 消息服务帐号|部门（分行）ID|客户渠道终端地址|消息类型|接入系统号码|短信类型编码|付费号码|手机号码|短消息的内容|客户号（证件号）|客户姓名|
        // 账户信息（帐号）|账户变动通知标志|签约客户所在的网点机构编码|营销短信提交人的9位操作员编码|营销短信审核人的9位操作员编码
        String fasongdanbicanshu = "15wxiaoxifuwuzh|11bumenfhid|16kehuqudaodizhi|3lx|6wjrhm|20duanxinleixingbama|15weifufeihaoma|" +
                "13shoujihaoma|xinxineirongduochangdouxing|32wei11111111kehuhaozhengjianhao|20wei111kehuxingming|40zhanghuxinxizhanghao|" +
                "6zhbdb|9wwangdbm|9cazuoybm|9sczybnma";

        // 消息服务帐号|部门（分行）ID|客户渠道终端地址|消息类型|优先级|业务系统编号|文件名称|文件大小|短信数量
        String fasongpiliangcanshu = "15wxiaoxifuwuzh|11bumenfhid|16kehuqudaodizhi|3lx|2b|6ywxtb|64wenjianmingchenghenchangde|" +
                "6wejdx|5dxsl";

        // 消息服务帐号15部门（分行）ID11 系统请求日期8系统请求时间6请求系统流水号20客户渠道终端地址16 交易代码6消息服务帐号15
        //部门（分行）ID11 系统请求日期8 系统请求时间6 请求系统流水号20处理完成时间34客户渠道终端地址32 交易代码6交易状态10 响应 码12响应信息
        String fanhuibaowen = "15xiaoxifuwuzh,11bumenfhi,201501191550502012345678987654321,16kehuqudaodizh,6jyda," +
                "15xiaoxifuwuzh,11bumenfhi,201501191550502012345678987654321,34chuliwanchengshijianzenmezhemec," +
                "32kehuqudaozhongduandizhiyechan,6jyda,10jiaoyzt,12xiangying,xiangyingxinxi,,,,,,,,";*/


    //System.out.println("单笔短信发送报文：" + getSingleMessage(fasongdanbicanshu));
        /*
        单笔短信发送报文：0295
        15wxiaoxifuwuzh
        11bumenfhid
        20150119
        162140
        00101191621405930000
        16kehuqudaodizhi
        M00001
        3lx
        6wjrhm
        20duanxinleixingbama
        15weifufeihaoma
        13shoujihaoma
          27
        xinxineirongduochangdouxing
        32wei11111111kehuhaozhengjianhao
        20wei111kehuxingming
        40zhanghuxinxizhanghao
        6zhbdb
        9wwangdbm
        9cazuoybm
        9sczybnma
        */

    //System.out.println("批量短信发送报文：" + getBatchOfMessage(fasongpiliangcanshu));
        /*
        0168
        15wxiaoxifuwuzh
        11bumenfhid
        20150119
        162659
        00201191626599530000
        16kehuqudaodizhi
        M00002
        3lx
        2b
        6ywxtb
        64wenjianmingchenghenchangde
        6wejdx
        5dxsl
        */
    //System.out.println("得到解析结果：" + getResponse(fanhuibaowen,2,16,17,18));
    //}

}
