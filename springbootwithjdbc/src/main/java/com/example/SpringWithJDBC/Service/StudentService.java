package com.example.SpringWithJDBC.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringWithJDBC.Model.Student;
import com.example.SpringWithJDBC.Repository.StudentRepo;

@Service
public class StudentService {


    private StudentRepo repo;

    public void addStudent(Student student) {
        repo.save(student);
        System.out.println("Added");
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getstudents() {
      return repo.findall();
    }

   
    
}
