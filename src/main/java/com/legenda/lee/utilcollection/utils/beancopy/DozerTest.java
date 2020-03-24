package com.legenda.lee.utilcollection.utils.beancopy;

import org.springframework.beans.BeanUtils;

/**
 * @author Legenda-Lee
 * @date 2020-03-24 17:50
 * @description
 * @since 1.0.0
 */
public class DozerTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Legenda-Lee");
        student.setAge(30);
        student.setSex("male");

        Teacher teacher = DozerUtil.cover(student, Teacher.class);
        System.out.println(teacher);
        System.out.println(student);

        student.setName("xiaoli");
        System.out.println(teacher);
        System.out.println(student);

        Teacher teacher1 = new Teacher();
        BeanUtils.copyProperties(student, teacher1);
        System.out.println(teacher1);
        System.out.println(student);

        student.setName("xiaowang");
        System.out.println(teacher1);
        System.out.println(student);
    }

}
