package com.Nil.practice.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Nil.practice.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student , Integer>  {

}
