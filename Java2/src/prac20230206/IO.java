package prac20230206;

import java.io.File;

public class IO {
    public static void main(String[] args) {
        String filePath= "C:\\Users\\ASK\\Documents\\mycode\\Java2\\data";
        File file = new File(filePath);
        /*System.out.println(file);
        //操作
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
*/
        if (file.exists()){
            //
            System.out.println("found");
            if (file.isFile()){
                System.out.println("is file");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
            }else if (file.isDirectory()){
                System.out.println("is file folder");
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                String[] list = file.list();
                System.out.println("file in folder");
                for (String s : list) {
                    System.out.println(s);
                }
                File[] files = file.listFiles();
                for (File s : files) {
                    System.out.println(s);
                }
            }
        }else {
            //
            System.out.println("no found");
            //file.mkdirs();
            //file.createNewFile();
        }
    }
}
