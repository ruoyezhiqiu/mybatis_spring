package com.wushengde.mybatisspring.mapper;

import java.util.List;

import com.wushengde.mybatisspring.domain.User;

/*
 * 定义DAO层的 接口: UserMapper：对应增删改查的方法
 */
public interface UserMapper {
	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();
}
