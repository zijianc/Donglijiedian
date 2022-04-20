package io;

import java.io.*;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {

        /*FileInputStream fis = new FileInputStream("src/io/Copy03");//字节流
        InputStreamReader reader = new InputStreamReader(fis);//转换流，fis是节点流，reader是包装流
        BufferedReader br = new BufferedReader(reader);//包装流，reader是节点流，br是包装流*/


        BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream("src/io/Copy03")));
        //System.out.println(br.readLine());
        String line =null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
