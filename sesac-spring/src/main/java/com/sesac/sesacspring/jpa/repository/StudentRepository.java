package com.sesac.sesacspring.jpa.repository;

import com.sesac.sesacspring.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// JpaRepository<대상으로 지정할 엔티티, 해당 엔티티의 pk 타입>
public interface StudentRepository  extends JpaRepository<Student, Integer> {

    // 1. jpa의 기본 규칙을 따르는 방법
    // findBy 컬럼명
    // Student findByName(String name);
    List<Student> findByName(String name); // primary key, unique key

    // 이름과 닉네임이 모두 일치하는 경우
    List<Student> findByNameAndNickname(String name, String nickname);
    // 이름이 일치하거나 닉네임이 일치하는 경우
    List<Student> findByNameOrNickname(String name, String nickname);
    // findByAgeGreaterThanEqual(int age) // age가 값도가 크거나 같은 경우

    // 2. 직접 쿼리를 작성해서 연결
    // @Query("select s from Student s where s.name = :name")
    @Query(nativeQuery = true, value = "select * from student where name= :a") // a는 parameter다..
    List<Student> findTest(String a);

}
