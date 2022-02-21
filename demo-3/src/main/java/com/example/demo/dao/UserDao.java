package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Mapper
//@Repository
public interface UserDao {

	public User testUser();
	
//	@Select("SELECT * FROM USER WHERE name=#{name}") 
//	public User findByName(@Param("name") String name);
	public User findByName(String name);
	
	
//	@Insert("INSERT INTO USER (name,pwd,sex,home,info) VALUES(#{name},#{pwd},#{sex},#{home},#{info})")
//	public int 	insertInfo(@Param("name") String name,@Param("pwd") String pwd,@Param("sex") String sex,@Param("home") String home,@Param("info") String info);
	public Integer insertInfo(String name,String pwd,String sex,String home,String info);

//	@Delete("DELETE  FROM USER WHERE name=#{name}") 
//	public int delByName(@Param("name") String name);
	public Integer delByName(String name);
//	@Update("UPDATE USER SET pwd=#{pwd} WHERE name=#{name}")
//	public int updByName(@Param("name") String name,@Param("pwd") String pwd);
	public Integer updByName(String name,String pwd);
	
}
