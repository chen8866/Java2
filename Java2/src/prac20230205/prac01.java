package prac20230205;

import java.util.HashSet;

public class prac01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        User9 user1 = new User9();
        user1.id =1001;
        user1.name="zhangsan";
        System.out.println(user1.hashCode());
        User9 user2 = new User9();
        user2.id =1001;
        user2.name="zhangsan";
        System.out.println(user2.hashCode());
        User9 user3 = new User9();
        user3.id =1002;
        user3.name="zlisi";

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);
    }
}

class User9 {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "User["+id+","+name+"]";
    }
}
