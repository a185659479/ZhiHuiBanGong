package com.domain;

/**
 * 用户实体类
 *
 */
public class User {
    private int id;
    private String name;
    private String Login_name;
    private String department;
    private String post;
    private String role;
    private String state;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin_name() {
        return Login_name;
    }

    public void setLogin_name(String login_name) {
        Login_name = login_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getRole() {
        return role;
    }



    public void setRole(String role) {
        this.role = role;
    }


    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;
    }

}
