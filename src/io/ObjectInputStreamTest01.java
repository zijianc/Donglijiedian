package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//反序列化
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students"));
        /*Object o=ois.readObject();
        System.out.println(o instanceof List);*/

        //集合，强转，然后遍历
        List<Student> lists = (List<Student>) ois.readObject();
        for (Student student : lists) {
            System.out.println(student);
        }
        ois.close();
    }
}
