package com.sesac.sesacspring.controller;

import com.sesac.sesacspring.dto.UserDTO;
import com.sesac.sesacspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Mybatis 수업 controller
@RestController // responsebody + controller
@RequestMapping("/user") // url 정의 가능
public class UserController {
    // C , R
    // 1, Table 생성 완료(user)
    // 2. domain만들기 ( domain/ service)
    // 3. mapper 만들기
    // 4. service 만들기
    // 5. controller 만들기

    @Autowired
    UserService userService;

    @GetMapping("/all") // /user/all
    public List<UserDTO> getUser() {
        List<UserDTO> result = userService.retrieveAll();
        return result;
    } // []

    @GetMapping("/user") // /user/user 로 받겠다~~~
    public String getUserInsert(@RequestParam String name, @RequestParam String nickname) {
        userService.createUser(name, nickname);
        return "success";
    }

//    @GetMapping("/update")
//    public
}
