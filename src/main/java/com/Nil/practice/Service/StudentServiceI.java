package com.Nil.practice.Service;

import java.util.List;

import com.Nil.practice.model.Student;

public interface StudentServiceI {
	
	public Student Savestu (Student stu);

	public List<Student> SaveAllStu (List<Student>lists);
	
	public List<Student> getAllStudent();
	
	public Student getStudentQP(int sid);
	
	public Student getStudentPP(int sid);
	
	public List<Student> getAllRecordMPS(List<Integer>pi);
	
}
