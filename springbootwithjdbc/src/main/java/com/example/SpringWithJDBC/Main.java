package com.example.SpringWithJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.SpringWithJDBC.Model.Student;
import com.example.SpringWithJDBC.Service.StudentService;

@SpringBootApplication
public class Main {
    
    public static void main(String[] args) {
         ApplicationContext context = SpringApplication.run(Main.class, args);

         Student student = context.getBean(Student.class);

         StudentService service = context.getBean(StudentService.class);

         student.setMarks(90);
         student.setName("Radha");
         student.setRollNo(5);

         service.addStudent(student);
         
         List<Student> list = service.getstudents();
         System.out.println(list);
    }
}
