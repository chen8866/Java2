package prac20230206;

import java.util.ArrayList;
import java.util.HashMap;

public class Util2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(10);
        list.add("a");
        list.add("b");
        list.add("c");
        //System.out.println(list.get(2));

        /*LinkedList list1 = new LinkedList();
        list1.add("d");
        System.out.println(list1.getFirst());*/

        HashMap map = new HashMap();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        for (Object o : map.keySet()) {
            if ("b".equals(o)) {
                map.put("d", 4);
            }
            System.out.println(map.get(o));
        }
    }
}
