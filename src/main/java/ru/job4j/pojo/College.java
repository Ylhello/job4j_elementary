package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Yulya");
        student.setGroup("321");
        student.setCreated(new Date());

        System.out.println(student.getName() + " was enrolled. " + student.getGroup() + " is the number of her group. " + student.getCreated());

    }
}
