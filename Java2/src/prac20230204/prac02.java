package prac20230204;

import java.util.ArrayList;

public class prac02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Person6 user = new User6();
        //user.testUser();
        user.testPerson();
    }
}

class Person6 {
    public void testPerson() {
        System.out.println("person...");
    }
}

class User6 extends Person6 {
    public void testUser() {
        System.out.println("user...");
    }
}
