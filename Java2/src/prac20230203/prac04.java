package prac20230203;

import java.text.SimpleDateFormat;
import java.util.Date;

public class prac04 {
    public static void main(String[] args) {

        //System.out.println(System.currentTimeMillis());
        Date d = new Date();
        //System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFormatSting = sdf.format(d);
        System.out.println(dateFormatSting);

        /*String dateString = "2023-02-03";
        Date parseDate = sdf.parse(dateString);
        System.out.println(parseDate);*/


    }
}
