package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.TestInterFace;
@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.demo.service"})
@RequestMapping("/user")
public class UserController {

	@Autowired
	private TestInterFace testInterFace;

	@RequestMapping("/num")
	@ResponseBody
	public int home() {
		return 123;
	}

//	@RequestMapping("/get")
//	@ResponseBody
//	public User getUser() {
//		return testInterFace.testUser();
//	}

//	@RequestMapping("/findbyname/{name}")
	@RequestMapping("/findbyname")
	@ResponseBody
//	@GetMapping("/findbyname/{name}")
	public User fingByName(String name) {
//	public User fingByName(@PathVariable(name="name") String name) {
		return testInterFace.findByName(name);
	}

	@RequestMapping("/insertInfo")
	@ResponseBody
	public Integer insertInfo(String name,String pwd,String sex,String home,String info) {
//	public Integer insertInfo(@RequestParam(name="name") String name,@RequestParam(name="pwd") String pwd,@RequestParam(name="sex") String sex,@RequestParam(name="home") String home,@RequestParam(name="info  ") String info) {
		return testInterFace.insertInfo(name, pwd, sex, home, info);
//		return testInterFace.insertInfo("james", "123", "男", "洛杉矶", "啥也不是");
	}
	@RequestMapping("/delbyname")
	@ResponseBody
	public Integer delByName(String name) {
		return testInterFace.delByName("james");
	}
	
	@RequestMapping("/updbyname")
	@ResponseBody
	public Integer updByName(String name, String pwd){
		return testInterFace.updByName("james", "james123");
	}
}
