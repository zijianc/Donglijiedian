package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileOutputStream fos2 = null;
        try {
            fos = new FileOutputStream("myfile");
            byte[] bytes = {97, 98, 99, 100};
            fos.write(bytes);

            fos2 = new FileOutputStream("src/io/temp2", true);
            String a = "我是中国人";
            byte[] bytes1 = a.getBytes();
            fos2.write(bytes1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
