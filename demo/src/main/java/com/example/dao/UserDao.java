package com.example.dao;
 
import com.example.entity.User;
import org.springframework.stereotype.Repository;
 
/**
 * @author Hai
 */
@Repository
public interface UserDao {
    int deleteByPrimaryKey(int id);
 
    int insert(User record);
 
    int insertSelective(User record);
 
    User selectByPrimaryKey(int id);
 
    int updateByPrimaryKeySelective(User record);
 
    int updateByPrimaryKey(User record);
}