package com.example.helloword;

import java.util.Date;

public class User {
    //定义变量
    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private Date birthday;
    private Date created;
    private Date updated;
    private String remarks;
    //构造器
    public User(){

    }
    //初始化
    public User(Integer id,String userName,String password,Integer age,Date birthday,Date created,Date updated,String remarks){
      this.id = id;
      this.userName = userName;
      this.password = password;
      this.age = age;
      this.birthday = birthday;
      this.created = created;
      this.updated = updated;
      this.remarks = remarks;
    }

    //创建私有变量set和get方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
