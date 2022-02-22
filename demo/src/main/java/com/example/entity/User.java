package com.example.entity;
 
import java.io.Serializable;
 
/**
 * SpringBootDemo1
 *
 * @author zhenhai.zheng
 * @date 2018年1月25日 11:25:38
 */
public class User implements Serializable{
 
    private static final long serialVersionUID = 934073895746700367L;
    private int id;
    private String name;
    private Integer age;
 
    public User() {
    }
 
    public User(int age, int id, String name) {
        super();
        this.age = age;
        this.id = id;
        this.name = name;
    }
 
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
 
    public Integer getId() {
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
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}