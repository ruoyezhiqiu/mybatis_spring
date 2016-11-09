package com.wushengde.mybatisspring.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wushengde.mybatisspring.domain.User;
import com.wushengde.mybatisspring.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)//使用spring的JUnit4测试框架
@ContextConfiguration("/beans.xml")//加载spring的配置文件beans.xml
public class TestMybatisSpring {
	
	@Autowired
	private UserMapper userMapper;
	
	 @Test
	 public void testAdd(){
		 User user=new User(-1, "tom", new Date(), 10000);
		 userMapper.save(user);
	 }
	 
	 @Test
	 public void testAdd2(){
		 User user=new User(-1, "jack", new Date(), 20000);
		 userMapper.save(user);
	 }
	 
	 @Test
	 public void testAdd3(){
		 User user=new User(-1, "郭嘉", new Date(), 20000);
		 userMapper.save(user);
	 }
	 
	 @Test
	 public void testAdd4(){
		 User user=new User(-1, "赵云", new Date(), 20000);
		 userMapper.save(user);
	 }
	 
	 @Test
	 public void testUpdate(){
		 User user=new User(1, "helloKit", new Date(), 20000);
		 userMapper.update(user);
	 }
	 
	 @Test
	 public void testFindById(){
		 User user=userMapper.findById(1);
		 System.out.println(user);
	 }
	 
	 @Test
	 public void testFindAll(){
		 List<User> list=userMapper.findAll();
		 System.out.println(list);
	 }
}
