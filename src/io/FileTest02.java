package io;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File f = new File("D:\\");
        //获取子文件
        File[] files = f.listFiles();
        for (File file : files) {
            // System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
        }
    }
}
