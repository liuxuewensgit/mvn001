package com.lxw.model;

public class User {
    private Integer id;

    private String uName;

    private String passWord;

    public User(Integer id, String uName, String passWord) {
        this.id = id;
        this.uName = uName;
        this.passWord = passWord;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }
}