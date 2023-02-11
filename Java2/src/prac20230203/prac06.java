package prac20230203;

import java.util.Calendar;

public class prac06 {
    public static void main(String[] args) {
        System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
        Calendar firstDate = Calendar.getInstance();
        firstDate.set(Calendar.DAY_OF_MONTH, 1);
        int maxDay = firstDate.getMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < maxDay; i++) {
            int weekX = firstDate.get(Calendar.DAY_OF_WEEK);
            int monthY = firstDate.get(Calendar.DAY_OF_MONTH);
            if (i == 0) {
                if (weekX == Calendar.SUNDAY) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("\t");
                    }
                    System.out.println(monthY);
                } else {
                    for (int j = 0; j < weekX - 2; j++) {
                        System.out.print("\t");
                    }
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            } else {
                if (weekX == Calendar.SUNDAY) {
                    System.out.println(monthY);
                } else {
                    System.out.print(monthY);
                    System.out.print("\t");
                }
            }
            firstDate.add(Calendar.DATE, 1);
        }
    }
}
