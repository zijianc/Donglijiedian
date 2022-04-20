package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("D:\\eclipse set\\donglijiedian\\src\\io\\Copy02.java");
            writer = new FileWriter("Copy03.java");
            char[] chars = new char[1024 * 512];//1Mb
            int readCount=0;
            while((readCount=reader.read(chars))!=-1){
                writer.write(new String(chars,0,readCount));
            }


            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
