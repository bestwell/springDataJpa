package com.wyb.repository;

import com.wyb.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by wyb on
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    /**
     * 通过学生姓名来查询学生对象
     * 此方法相当于JPQL语句代码：Select s from Student s where s.name=?1
     * @param name
     * @return
     */
    Student findByName(String name);

    /**
     * 通过名字和地址查询学生信息
     * \此方法相当于JPQL语句代码：select s from Student s where s.name=?1 and s.address=?2
     * @param name
     * @param address
     * @return
     */
    List<Student> findByNameAndAddress(String name, String address);

    /**
     * 通过学生姓名模糊查询学生信息
     * 此方法相当愉悦JPQL语句代码：select s from Student s where s.name like ?1
     * @param name
     * @return
     */
    List<Student> findByNameLike(String name);



}


