package com.sesac.sesacspring.jpa.controller;

import com.sesac.sesacspring.jpa.dto.StudentDTO;
import com.sesac.sesacspring.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired StudentService studentService;

//    @GetMapping("/count")
//    public int getCount() {
//
//        return 0;
//    }
//
    @GetMapping("/all")
    public List<StudentDTO> getAll() {
        // student 의 목록을 전부 가져와서 보여주는 api
        List<StudentDTO> result = studentService.getStudentAll();
        return result;
        //return studentService.getStudentAll();
    }
//
//    @GetMapping("search")
//    public ?
//
//    getSearch(@RequestBody int id) {
//
//    }
}
