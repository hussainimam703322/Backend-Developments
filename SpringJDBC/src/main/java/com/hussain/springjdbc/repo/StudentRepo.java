package com.hussain.springjdbc.repo;

import com.hussain.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public void save(Student s) {
        String sql ="insert into Student (rollno, name, marks) values (?, ?, ?)";
        int rows=jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows +" " +"effected");
    }
    public List<Student> findAll() {
        //RowMapper is used to fetch all data from the result set

        String sql = "select * from Student";
            return jdbc.query(sql,(rs,rowNum) -> {
               Student s = new Student();
               s.setRollNo(rs.getInt("rollno"));
               s.setName(rs.getString("name"));
               s.setMarks(rs.getInt("marks"));
               return s;
        });

//        RowMapper<Student> mapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("name"));
//                s.setMarks(rs.getInt("marks"));
//                return s;
//            }
//        };
//        return jdbc.query(sql,mapper);
    }
}
