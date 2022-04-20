package io;

import java.io.*;


public class CopyContent {
    public static void main(String[] args) {
        File srcfile = new File("D:\\Huawei Share");
        File destfile = new File("C:\\");
        copyTo(srcfile, destfile);
    }

    public static void copyTo(File srcfile, File destfile) {
        //如果是文件
        if (srcfile.isFile()) {
            FileInputStream in=null;
            FileOutputStream out=null;
            try {
                in=new FileInputStream(srcfile);
                String path=(destfile.getAbsolutePath().endsWith("\\") ? destfile.getAbsolutePath() : destfile.getAbsolutePath() + "\\") + srcfile.getAbsolutePath().substring(3);
                out=new FileOutputStream(path);
                byte[] bytes=new byte[1024*1024];
                int readCount=0;
                while((readCount=in.read(bytes))!=-1){
                    out.write(bytes,0,readCount);
                }

                out.flush();;
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return;
        }
        //如果是目录
        File[] files = srcfile.listFiles();
        for (File file : files) {
            //System.out.println(file.getName());
            if (file.isDirectory()) {
                String srcDir = file.getAbsolutePath();//源目录
                String destDir = (destfile.getAbsolutePath().endsWith("\\") ? destfile.getAbsolutePath() : destfile.getAbsolutePath() + "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
//                System.out.println(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            copyTo(file, destfile);
        }
    }
}
