package com.example.MySpringFrameWork.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.MySpringFrameWork.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
