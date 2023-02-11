package prac20230206;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class prac01 {
    public static void main(String[] args) {
        //TODO -MAP
        HashMap<String, String> map= new HashMap();

        map.put("zhangsan","1");
        map.put("lisi","2");
        map.put("wangwu","3");

        /*Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }*/

        //map.remove("zhangsan");
        map.remove("zhangsan","1");

        System.out.println(map);
    }
}
