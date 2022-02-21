package com.example.demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.TestInterFace;

@Service
@Repository
public class TestInterFaceImpl implements TestInterFace {
	@Autowired(required = true)
	private UserDao userdao;
//	@Override
//	public int testInterFace() {
//		return 0;	
//		
//	}
//	@Override
//	public User testUser() {
//		
//		return userdao.testUser();
//		
//	}

	@Override
	public User findByName(String name) {
		return userdao.findByName(name);
	}

	@Override
	public Integer insertInfo(String name, String pwd, String sex, String home, String info) {
		return userdao.insertInfo(name, pwd, sex, home, info);
	}

	@Override
	public Integer delByName(String name) {
		return userdao.delByName(name);
	}

	@Override
	public Integer updByName(String name, String pwd) {
		return userdao.updByName(name, pwd);
	}
}
