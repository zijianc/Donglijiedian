package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//available()
//不适合大文件，byte数组不能太大
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/io/temp2");
            // System.out.println(fis.available());

            //fis.skip(3);
           byte[] bytes=new byte[fis.available()];
           int radcount=fis.read(bytes);
            System.out.println(new String(bytes));

           /* byte[] bytes = new byte[4];
            int readcount = 0;
            while ((readcount = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readcount));
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
