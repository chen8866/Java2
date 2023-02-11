package prac20230206;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) {
        //input
        File srcFile = new File("C:\\Users\\ASK\\Documents\\mycode\\Java2\\data\\word.txt");

        //output(auto create)
        File destFile = new File("C:\\Users\\ASK\\Documents\\mycode\\Java2\\data\\word.txt.copy");
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);
            //open in switch
            int data = -1;
            //open out switch
            //out.write(data);

            /*data = in.read();
            out.write(data);

            data = in.read();
            out.write(data);

            data = in.read();
            out.write(data);

            data = in.read();
            out.write(data);

            data = in.read();
            if (data != -1){
                out.write(data);
            }*/
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
