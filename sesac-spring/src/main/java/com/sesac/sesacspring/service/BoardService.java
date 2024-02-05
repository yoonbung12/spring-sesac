package com.sesac.sesacspring.service;

import com.sesac.sesacspring.domain.Board;
import com.sesac.sesacspring.dto.BoardDTO;
import com.sesac.sesacspring.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    // 검색 부분
    public List<Board> searchBoard(String word) {
        List<Board> result = boardMapper.searchBoard();
        return result;
    }

    // 조회부분
    public List<BoardDTO> getAll() {
        // controller에서 호출하는 메서드
        // BoardMapper 의 getAll()을 실행후 받아온 List<Board>
        // List<BoardDTO>에 담아서 반환

        List<Board> boards = boardMapper.getAll();
        List<BoardDTO> result = new ArrayList<>();

        // List<Board> -> List<BOardDTO> 에 담는다.
        for(Board board : boards) {
            BoardDTO boardDTO = new BoardDTO();
            boardDTO.setNo(board.getNo());
            boardDTO.setTitle(board.getTitle());
            boardDTO.setContent(board.getContent());
            boardDTO.setWriter(board.getWriter());
            boardDTO.setRegistered(board.getRegistered());

            result.add(boardDTO);
        }
        return result;
    }

    // board 작성
    public void createBoard(String title, String content, String writer) {
        boardMapper.createBoard(title, content, writer);
    }

    // board 수정
    public void updateBoard(int no, String title, String content, String writer) {
        boardMapper.updateBoard(no, title, content, writer);
    }

    // board 삭제
    public void deleteBoard(int no) {
        boardMapper.deleteBoard(no);
    }

}
