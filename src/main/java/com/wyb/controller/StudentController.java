package com.wyb.controller;

import com.wyb.domain.Student;
import com.wyb.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * created by wyb on 2019
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/save")
    public String save(){
        Student s = new Student();
        s.setAddress("江西");
        s.setName("孙悟空");
        s.setAge(700);
        s.setSex('男');

        Student s1 = new Student();
        s1.setAddress("江西");
        s1.setName("蜘蛛精");
        s1.setAge(700);
        s1.setSex('女');

        Student s2 = new Student();
        s2.setAddress("江西");
        s2.setName("牛魔王");
        s2.setAge(500);
        s2.setSex('男');

        List<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);

        studentService.saveAll(students);
        return "保存学生对象成功";
    }

    @RequestMapping("/name")
    public Student getByName(String name){
        return studentService.getByName(name);
    }

    @RequestMapping("/nameAndAddress")
    public List<Student> getByNameAndAddress(String name,String address){
        return studentService.getByNameAndAddress(name,address);
    }


    @RequestMapping("/nameLike")
    public List<Student> getByNameLike(String name){
        return studentService.getByNameLike(name);
    }





}
