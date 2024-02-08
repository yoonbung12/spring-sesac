package com.sesac.sesacspring.jpa.controller;

import com.sesac.sesacspring.jpa.dto.StudentDTO;
import com.sesac.sesacspring.jpa.entity.Student;
import com.sesac.sesacspring.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    //    @GetMapping("/count")
//    public int getCount() {
//
//        return 0;
//    }
//
    // 1. 전체 검색(select * from student)
    @GetMapping("/all")
    public List<StudentDTO> getAll() {
        // student 의 목록을 전부 가져와서 보여주는 api
        List<StudentDTO> result = studentService.getStudentAll();
        return result;
        //return studentService.getStudentAll();
    }

    // 2. 삽입(insert into ~~~)
    @GetMapping("/insert") // /student/insert?name=이름
    // /student/insert?name=dsdfsdf&nickname=ddd&type=GOOGLE
    public String insertStudent(
            @RequestParam String name,
            @RequestParam String nickname,
            @RequestParam Student.LoginType type // 이거는 ENUM이어서 에서 import 해야 한디...
    ) {
        return studentService.insertStudent(name, nickname, type);
        // 이름, 닉네임, login_type

    }

    // 3. 조건에 따른 검색 (select * from student where name='')
    @GetMapping("/search/name") // /search/name?name=이름
    public String searchStudentByName(@RequestParam String name) {
        return studentService.searchStudentByName(name);

    }

    // 4. 조건에 따른 검색 2 (select * from student where id=)
    @GetMapping("/search/id")
    public String searchStudentByID(@RequestParam int id) {
        return studentService.searchStudentById(id);
    }

//
//    @GetMapping("search")
//    public ?
//
//    getSearch(@RequestBody int id) {
//
//    }
}
