package com.example.service;
 
import com.example.entity.User;
 
/**
 * Created by Hai on 2018/1/18.
 */
 
public interface UserService {
    void save(User user);
    User getUser(int id);
    boolean updateByPrimaryKey(User user);
    boolean deleteByPrimaryKey(int id);
}