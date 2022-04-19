package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    /*int read(byte[] b)
        一次读取b.length个字节。
        减少硬盘和内存的交互，提高效率
     */
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/io/temp2");
            byte[] bytes =new byte[4];
            int readcount=0;
            while((readcount=fis.read(bytes))!=-1){
                System.out.print(new String(bytes,0,readcount));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
