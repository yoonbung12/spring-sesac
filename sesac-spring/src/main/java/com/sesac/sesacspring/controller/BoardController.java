package com.sesac.sesacspring.controller;

import com.sesac.sesacspring.domain.Board;
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

    // 1.게시물 조회(myBatis)
//    @GetMapping("")
//    public String listAll(Model model) {
//        model.addAttribute("boards", boardService.getAll());
//        return "board";
//    }
    // 1. 게시물 조회 jpa 버전
    @GetMapping("")
    public String listAll(Model model) {
        model.addAttribute("boards", boardService.getAll());
        return "board";
    }

    // 검색 기능 .. 여기는 좀 다시...
    @GetMapping("search")
    @ResponseBody
    public int searchAll(
            @RequestParam String word
    ) {
        List<Board> result = boardService.searchBoard(word);
        return result.size();

    }

    // 2.게시물 작성
    @PostMapping("write")
    @ResponseBody // 이 부분 이랑 RequestBody에 대하여 공부필요
    public void boardInsert(
            @RequestBody BoardDTO boardDTO
    ) {
        boardService.createBoard(boardDTO.getTitle(), boardDTO.getContent(), boardDTO.getWriter());
    }

    // 3.게시물 수정
    @PatchMapping("")
    public void boardUpdate(
            @RequestBody Board board
            ) {
        boardService.updateBoard(board.getNo(),board.getTitle(), board.getContent(), board.getWriter());
    }


    // 4.게시물 삭제
    @DeleteMapping("")
    public void boardDelete(
            @RequestParam int no
    ) {
        boardService.deleteBoard(no);
    }





}
