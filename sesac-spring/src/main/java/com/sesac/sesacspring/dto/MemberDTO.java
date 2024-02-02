package com.sesac.sesacspring.dto;

public class MemberDTO {
    //아이디, 비번, 이름, 나이, 생년월일,
    private String userId;
    private String password;
    private String userName;
    private int age;
    private String birth;

    public MemberDTO(String userId, String password, String userName, int age, String birth, String phoneNumber) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.age = age;
        this.birth = birth;

    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public String getBirth() {
        return birth;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
