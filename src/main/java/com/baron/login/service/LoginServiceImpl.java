package com.baron.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baron.login.dao.LoginDAO;
import com.baron.login.model.LoginModel;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	public boolean login(String id, String password) {
		
		LoginModel model = new LoginModel();
		model.setId(id);
		model.setPassword(password);
		
		return loginDAO.selectLoginData(model);
	}

}
