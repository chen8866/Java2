package prac20230206;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Set<String> keys = map.keySet();

       /* for (String key : keys) {
            if ("b".equals(key)){
                map.remove(key);
            }
            System.out.println(map.get(key));
        }*/
        //TODO 迭代器
        Iterator<String> iterator = keys.iterator();
        //
        while (iterator.hasNext()){
          //
            String key = iterator.next();
            if("b".equals(key)){
                iterator.remove();
            }
            System.out.println(map.get(key));
        }

    }
}
