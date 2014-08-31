package com.baron.join.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baron.join.dao.JoinDAO;
import com.baron.login.model.LoginModel;

@Service
public class JoinServiceImpl implements JoinService {

	@Autowired
	private JoinDAO joinDAO;
	
	@Override
	public void join(String id, String password) {
		LoginModel model = new LoginModel();
		model.setId(id);
		model.setPassword(password);
		
		joinDAO.insertJoinData(model);
	}

}
