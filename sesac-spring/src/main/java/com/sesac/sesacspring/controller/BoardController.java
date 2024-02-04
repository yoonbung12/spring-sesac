package com.sesac.sesacspring.controller;

import com.sesac.sesacspring.dto.BoardDTO;
import com.sesac.sesacspring.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    // 게시물 조회
    @GetMapping("")
    public String listAll(Model model) {
        model.addAttribute("boards", boardService.getAll());
        return "board";
    }

    // 게시물 작성





}
