package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//序列化
/*序列化版本号的作用：
java语言如何区别类的：
1，根据类名区分
2，根据序列化版本号区分*/
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> lists = new ArrayList<>();
        lists.add(new Student(1, "陈子健"));
        lists.add(new Student(2, "张三"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Students"));

        oos.writeObject(lists);
        oos.flush();
        oos.close();
    }
}
