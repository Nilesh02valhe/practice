package com.Nil.practice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Nil.practice.Controller.StudentController;
import com.Nil.practice.model.Student;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PracticeApplication.class, args);
		StudentController controller = context.getBean(StudentController.class);
//		Student stu= new Student();
//		stu.setSid(67);
//		stu.setName("Denmark");
//		stu.setSadd("Leonard the Vinche");
//		stu.setSrank(67);
//		
//		Student stu1= new Student();
//		
//		stu1.setSid(78);
//		stu1.setName("Bjorn");
//		stu1.setSadd("katakkat");
//		stu1.setSrank(34);
//		
//		List <Student> stu2= new ArrayList();
//		stu2.add(stu1);
//		stu2.add(stu);
//		
//		List<Student> saveStudentStu = controller.SaveStudentStu(stu2);
//		System.out.println(saveStudentStu);
		
//		Student stu= new Student();
//		stu.setSid(123);
//		stu.setName("ivar");
//		stu.setSadd("katigat");
//		stu.setSrank(3456);
//		
//		Student st1= new Student();
//		st1.setSid(125);
//		st1.setName("hvitsar");
//		st1.setSadd("Europ");
//		st1.setSrank(34598);
//		
//		List<Student> st= new ArrayList();
//		st.add(st1);
//		st.add(stu);
//		
//		List<Student> saveAllStu = controller.SaveAllStu(st);
//		System.out.println(saveAllStu);
		
//		List<Student> allReport = controller.getAllReport();
//		System.out.println(allReport);
		
//		Student stuQP = controller.getStuQP(125);
//		System.out.println(stuQP);
//		
//		Student stuPP = controller.getStuPP(78);
//		System.out.println(stuPP);
		
		List<Integer> ids = new ArrayList();
		ids.add(44);
		ids.add(67);
		ids.add(33);
		
		List<Student> allRecordPNR = controller.getAllRecordPNR(ids);
		System.out.println(allRecordPNR);
	}
}
