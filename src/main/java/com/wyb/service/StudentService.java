package com.wyb.service;

import com.wyb.domain.Student;
import com.wyb.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by wyb on 2019.8.9
 */
@Service
public class StudentService {
    @Resource
    private StudentRepository studentRepository;


    @Transactional
    public void saveAll(List<Student> students) {

        studentRepository.saveAll(students);
    }


    public Student getByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getByNameAndAddress(String name, String address) {
        return studentRepository.findByNameAndAddress(name,address);
    }

    public List<Student> getByNameLike(String name) {
        return studentRepository.findByNameLike("%"+name+"%");
    }


}
