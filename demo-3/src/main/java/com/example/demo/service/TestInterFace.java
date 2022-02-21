package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;


public interface TestInterFace {

//	public int testInterFace();
//	public User testUser();
	public User findByName(String name);
	public Integer insertInfo(String name,String pwd,String sex,String home,String info);
	public Integer delByName(String name);
    public Integer updByName(String name,String pwd);
}
