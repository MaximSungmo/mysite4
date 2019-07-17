package com.cafe24.mysite.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cafe24.mysite.config.AppConfig;
import com.cafe24.mysite.vo.UserVo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class UserDaoTest {
//	@Autowired // 스프링 테스트 컨텍스트에 의해 자동으로 값이 주입
//    private ApplicationContext context;
	
	@Autowired
	private UserDao userDao;
	
	@Before
	public void setUp() {
//		this.userDao = this.context.getBean("userDao", UserDao.class);
		userDao = new UserDao();
	}
	
	@Test
	public void userInsertTest() {		
		// 유저 삽입
		UserVo user1= new UserVo(null, "ksmksm" ,"김성모1234", "1234", "M");
		userDao.insert(user1);
		
		// 삽입된 유저 가져오기
		UserVo user1_get = userDao.get(user1.getNo());
		System.out.println(user1.getName());
		System.out.println(user1_get.getName());
		assertEquals(user1.getName(), user1_get.getName());
		
		
		
	}
}
