package com.baron.login.dao;

import com.baron.login.model.LoginModel;

public interface LoginDAO {

	boolean selectLoginData(LoginModel model);

}
