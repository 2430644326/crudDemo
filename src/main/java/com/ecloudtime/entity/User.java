package com.ecloudtime.entity;



/*

@Table(name="user")
@Entity
*/

public class User {

    private int id;

    private String name;

    private String sex;
    private Integer num;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", num=" + num +
                '}';
    }

    public long getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public User setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public User setNum(Integer num) {
        this.num = num;
        return this;
    }

    public User(int id, String name, String sex, Integer num) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.num = num;
    }

    public User() {
    }
}
