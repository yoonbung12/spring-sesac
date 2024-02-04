package com.sesac.sesacspring.mapper;

import com.sesac.sesacspring.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    // sql문을 정의 or xml 파일을 읽거나

    // xml 파일을 읽어서 실행하겠다.http://localhost:8080/user/user?name=%ED%99%8D%EA%B8%B8%EB%8F%99&nickname=sesac
    List<User> retreiveAll();

    // sql문 정의
    @Insert("insert into user(name, nickname) values(#{name}, #{nickname})")
    void createUser( String name,  String nickname);

}
