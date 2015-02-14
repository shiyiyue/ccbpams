package pams.tools.sms;

import org.apache.log4j.Logger;

import java.text.*;
import java.util.Calendar;

/**
 * Created by Administrator on 15-1-19.
 */
public class GenerateSequenceUtil {

    /**
     * .log
     */
    private static final Logger logger = Logger.getLogger(GenerateSequenceUtil.class);

    /**
     * The FieldPosition.
     */
    private static final FieldPosition HELPER_POSITION = new FieldPosition(0);

    /**
     * This Format for format the data to special format.
     */
//    private final static Format dateFormat = new SimpleDateFormat("MMddHHmmssS");

    /**
     * This int is the sequence number to special format.
     */
    private final static NumberFormat numberFormat = new DecimalFormat("0000");

    /**
     * This int is the sequence number ,the default value is 0.
     */
    private static int seq = 0;

    private static final int MAX = 9999;

    /**
     * 时间格式生成序列
     *
     * @return String
     */

    public static synchronized String generateSequenceNo() {
        Calendar rightNow = Calendar.getInstance();
        StringBuffer sb = new StringBuffer();
        Format dateFormat = new SimpleDateFormat("MMddHHmmssS");
        dateFormat.format(rightNow.getTime(), sb, HELPER_POSITION);
        numberFormat.format(seq, sb, HELPER_POSITION);

        if (seq == MAX) {
            seq = 0;
        } else {
            seq++;
        }
        logger.info("THE SQUENCE IS:" + sb.toString());
        return stringFormat(sb.toString());
    }

    /*public static void main(String[] args){
        String str = "111111111111111111";
        System.out.println(stringFormat(str));
    }*/
    private static String stringFormat(String str) {
        int strL = str.length();
        if (strL > 16) {
            return str.substring(0, 17);
        }
        for (int i = 0; i < 17 - strL; i++) {
            str = "0" + str;
        }
        return str;
    }

}
