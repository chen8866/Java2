package prac20230203;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class prac07 {
    public static void main(String[] args) {
        StringUtill.isEmpty(null);

        System.out.println(StringUtill.makeString());
        System.out.println(StringUtill.makeString("abcdef123456", 6));
    }
}

class StringUtill {
    public static boolean isEmpty(String str) {
    /*    if (str == null) {
            return true;
        }
        if("".equals(str)){
            return true;
        }
        if("".equals(str.trim())){
            return true;
        }*/
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String makeString() {
        return UUID.randomUUID().toString();
    }

    public static String makeString(String from, int len) {
        if (len < 1) {
            return "";
        } else {
            char[] chars = from.toCharArray();
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < len; i++) {
                Random random = new Random();
                int j = random.nextInt(chars.length);
                char c = chars[i];
                str.append(c);
            }
            return str.toString();
        }
    }

    public static String transform(String source, String encodeForm, String encodeTo) throws Exception {
        byte[] bytes = source.getBytes(encodeForm);
        return new String(bytes, encodeTo);
    }

}