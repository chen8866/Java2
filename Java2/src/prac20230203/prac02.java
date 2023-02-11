package prac20230203;

public class prac02 {
    public static void main(String[] args) throws Exception{
        char[] cs={'a','中','国'};
        byte[] bs={-28,-72,-83,-27,-101,-67};

        String s = new String(cs);
        String s1 =new String(bs,"utf-8");

        System.out.println(s1);
    }
}
