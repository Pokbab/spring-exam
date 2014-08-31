package com.baron.join.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.baron.login.model.LoginModel;


public class JoinDAOImplTest {
	private JoinDAOImpl dao;
	
	@Before
	public void setup() throws Exception {
		dao = new JoinDAOImpl();
	}
	
	@Test
	public void testInsertJoinData() throws Exception {
		LoginModel model = new LoginModel();
		model.setId("test");
		model.setPassword("1234");
		
		dao.insertJoinData(model);
		
	}
}
