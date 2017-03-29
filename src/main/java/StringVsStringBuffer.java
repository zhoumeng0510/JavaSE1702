import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by 周猛on.
 * 2017/3/29.10:52.
 */
public class StringVsStringBuffer {
    private static final java.lang.String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]

    public static void main(String[] args) {
        java.lang.String s = "";
        StringBuffer stringBuffer = new StringBuffer("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;
            stringBuffer.append(ALPHABET);
        }
        System.out.println("time: " + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }


}
