package io;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\b\\c");
        System.out.println(file.exists());
        /*if (!file.exists()) {
            file.createNewFile();
        }*/
        if (!file.exists()) {
            //多重目录
            file.mkdirs();
        }
        String path = file.getAbsolutePath();
        System.out.println(path);

        System.out.println(file.getParent());

        file.isFile();//判断是文件吗
        file.isDirectory();//判断是目录吗

        //修改时间
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//设置日期格式
        String strTime = sdf.format(time);//转换
        System.out.println(strTime);

        //获取文件大小
        file.length();
    }
}
