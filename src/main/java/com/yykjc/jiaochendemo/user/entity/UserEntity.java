package com.yykjc.jiaochendemo.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private Integer stauts;
//    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createtime;

    /*构造方法*/
    public UserEntity() {

    }

    /*有参构造*/
    public UserEntity(Integer id, String username, String password, Integer stauts, Date createtime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.stauts = stauts;
        this.createtime = createtime;
    }

    /*  Getter 和 Setter方法*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /* toString() 方法*/
    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", stauts=" + stauts +
                ", createtime=" + createtime +
                '}';
    }
}
