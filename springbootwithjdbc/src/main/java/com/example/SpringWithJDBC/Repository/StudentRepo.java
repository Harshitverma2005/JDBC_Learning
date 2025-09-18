package com.example.SpringWithJDBC.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.SpringWithJDBC.Model.Student;

@Repository
public class StudentRepo  {

    private JdbcTemplate jdbcTemplate;

    public void save(Student student) {
     
        String sql = "insert into student (name ,rollno,marks) values(?,?,?)";
       int rows = jdbcTemplate.update(sql,student.getName(),student.getRollNo(),student.getMarks());
        System.out.println(rows+" rows Affected");
    }

    public List<Student> findall() {
        
        
      
        String sql =  "select * from Student ";

    
        return jdbcTemplate.query(sql,(rs,rowNum) -> {
            Student s = new Student();
            
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            s.setRollNo(rs.getInt("rollno"));
            return   s;  
        } );
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    
}
