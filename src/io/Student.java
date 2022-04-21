package io;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1l;
    public int id;
    public String name;//transient不参加序列化
    public int email;
    public boolean sex;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
