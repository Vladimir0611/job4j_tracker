package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Vladimir Alexandrovich");
        student.setGroup("first");
        student.setIncoming(new Date());

        System.out.println(student.getFullName() + " study in the " + student.getGroup() + " group");
    }

}
