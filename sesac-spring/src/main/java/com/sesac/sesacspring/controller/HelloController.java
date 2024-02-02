package com.sesac.sesacspring.controller;

import com.sesac.sesacspring.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

// @Controller : 해당 클래스가 Controller 의 역할을 하는 클래스라는 것을 알려준다
//@Controller
public class HelloController {

//    @GetMapping("/hi")
//    // URL을 매핑시켜주는 친구
//    // 클라이언트가 /hi라는 경로로 get Method로
//    // 접근한다면 아래 메소드를 실행 시켜라.
//    public String getHi(Model model) {
//        // Model : Controller 안의 메서드가 파라미터로 받을 수 있는 객체 중 하나
//        // Model안에 정보를 담아서 view로 전달..
//        // IoC : 개발자가 직접 model을 생성 X
//        model.addAttribute("name", "봉구");
//        model.addAttribute("name2", "<strong>봉구</strong>");
//        model.addAttribute("key", "키밸류");
//
//        //        ArrayList<String> items =
//        String[] x = {"a", "b", "c", "d", "e"};
//        model.addAttribute("item1", x);
//        char[] alpha = new char[26];
//        char alphabet = 'A';
//
//        for (int i = 0; i < 26; i++) {
//            alpha[i] = alphabet;
//            alphabet++;
//        }
//        model.addAttribute("item2", alpha);
//
//        return "hi"; // 템플릿 파일의 이름.
//        // res.render("hi")
//        // res.render("hi", {name: '홍길동'})
//
//    }
//
//    @GetMapping("/age")
//    public String getAge(Model model) {
////        model.addAttribute("age", 10);
////        model.addAttribute("age1", 21);
//
//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("kim", 10));
//        people.add(new Person("bong", 20));
//        people.add(new Person("gu", 110));
//        people.add(new Person("dada", 10));
//
//        model.addAttribute("people", people);
//
//        return "age";
//
//    }

}
