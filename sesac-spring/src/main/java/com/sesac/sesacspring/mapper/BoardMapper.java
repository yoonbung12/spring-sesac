package com.sesac.sesacspring.mapper;

import com.sesac.sesacspring.domain.Board;
import org.apache.ibatis.annotations.*;


import java.util.Date;
import java.util.List;

@Mapper
public interface BoardMapper {

    // 전체 조회
    @Select("select * from board")
    List<Board> getAll();

    // 검색 구현
    @Select("select * from board where title LIKE '%{words}' ")
    List<Board> searchBoard();

    // 게시물 작성
    @Insert("insert into board(content, title, writer) values(#{content}, #{title}, #{writer})")
    void createBoard(String content, String title, String writer);

    // 게시물 수정
    @Update("update board set title=#{title}, content=#{content}, writer=#{writer} where no=#{no}")
    void updateBoard(int no, String title, String content, String writer);

    // 게시물 삭제
    @Delete("delete from board where no = #{no}")
    void deleteBoard(int no);







}
