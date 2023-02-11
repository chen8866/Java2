package prac20230203;

import java.util.Calendar;
import java.util.Date;

public class prac05 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));

        instance.setTime(new Date());
        instance.add(Calendar.YEAR,-1);
    }
}
