package com.Nil.practice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nil.practice.Repository.StudentRepository;
import com.Nil.practice.model.Student;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student Savestu(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}

	@Override
	public List<Student> SaveAllStu(List<Student> lists) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(lists);		
		return saveAll;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> all = (List<Student>) studentRepository.findAll();
		return all;
	}

	@Override
	public Student getStudentQP(int sid) {
		Student byId = studentRepository.findById(sid).get();
		return byId;
	}

	@Override
	public Student getStudentPP(int sid) {
		Student byId1 = studentRepository.findById(sid).get();
		return byId1;
	}

	@Override
	public List<Student> getAllRecordMPS(List<Integer> ids) {
		List<Student> allById = (List<Student>) studentRepository.findAllById(ids);
		return allById;
	}
	
	
	
	
}
