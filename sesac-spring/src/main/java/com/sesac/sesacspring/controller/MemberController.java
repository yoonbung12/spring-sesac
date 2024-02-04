//package com.sesac.sesacspring.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class MemberController {
//
//    @RequestMapping(value = "/member", method = RequestMethod.GET)
//    public String getForm() {
//        return "member";
//    }
//
//    @RequestMapping(value = "/member", method = RequestMethod.POST)
//    public String postForm(
//            // userId, password, userName
//            @RequestParam(value = "userId") String userId,
//            @RequestParam(value = "password") String password,
//            @RequestParam(value = "userName") String userName,
//            Model model
//    ) {
//        model.addAttribute("userId", userId);
//        model.addAttribute("password", password);
//        model.addAttribute("userName", userName);
//        System.out.println(userId);
//        System.out.println(password);
//        System.out.println(userName);
//        return "member";
//
//
//    }
//}
