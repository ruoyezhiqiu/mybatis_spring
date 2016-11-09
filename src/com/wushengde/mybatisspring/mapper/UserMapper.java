package com.wushengde.mybatisspring.mapper;

import java.util.List;

import com.wushengde.mybatisspring.domain.User;

/*
 * ����DAO��� �ӿ�: UserMapper����Ӧ��ɾ�Ĳ�ķ���
 */
public interface UserMapper {
	void save(User user);
	void update(User user);
	void delete(int id);
	User findById(int id);
	List<User> findAll();
}
