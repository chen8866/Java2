package prac20230204;

import java.util.LinkedList;

public class prac01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("zhangsan");
        list.addFirst("lisi");
        list.add(1,"wangwu");

//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//
//        System.out.println(list.get(1));
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        for (Object obj : list){
            System.out.println(obj);
        }

        System.out.println(list.remove("zhangsan"));
        System.out.println(list);

        /*list.removeFirst();
        list.removeLast();
        list.clear();
        list.contains(1);
        list.element();
        list.indexOf("");*/
        list.push("aaa");
        list.pop();
        for (Object obj :
                list) {
            System.out.println(obj);
        }


    }
}
