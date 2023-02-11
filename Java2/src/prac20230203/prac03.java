package prac20230203;

public class prac03 {
    public static void main(String[] args) {
        String s = "Hello,World,zhangsan,lisi";

        String[] s1 = s.split(",");
        System.out.println(s1.length);
        for (String s2 : s1) {
            System.out.println(s2);
        }
    }
}
