package com.Nil.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.Nil.practice.Service.StudentServiceI;
import com.Nil.practice.model.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	
	public Student Savestu(Student stu) {
		Student savestu = studentServiceI.Savestu(stu);
		return savestu;
		
	}
	
//	public List<Student> SaveStudentStu(List<Student> lists){
//		List<Student> saveStudentStu = studentServiceI.SaveStudentStu(lists);
//		return saveStudentStu;
//		
//	}
	
	public List<Student> SaveAllStu(List<Student> lists){
		List<Student> saveAllStu = studentServiceI.SaveAllStu(lists);
		return saveAllStu;
		
	}
	
	public List<Student> getAllReport() {
		List<Student> allStudent = studentServiceI.getAllStudent();
		return allStudent;
		
	}
	
	public Student getStuQP(@RequestParam int sid) {
		Student studentQP = studentServiceI.getStudentQP(sid);
		return studentQP;
		
	}
	
	public Student getStuPP(@PathVariable int sid) {
		Student studentPP = studentServiceI.getStudentPP(sid);
		return studentPP;
		
	}
	
	public List<Student> getAllRecordPNR(List<Integer> ids){
		List<Student> allRecordMPS = studentServiceI.getAllRecordMPS(ids);
		return allRecordMPS;
		
	}

}
