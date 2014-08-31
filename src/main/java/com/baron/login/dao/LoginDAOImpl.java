package com.baron.login.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;

import com.baron.login.model.LoginModel;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Override
	public boolean selectLoginData(LoginModel model) {

		String id = model.getId();
		String password = model.getPassword();

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("src\\main\\resources\\data.txt"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				if (StringUtils.equals(id, line.split("=")[0]) && StringUtils.equals(password, line.split("=")[1])) {
					return true;
				}
			}
			
		} catch (IOException e) {
			IOUtils.closeQuietly(reader);
		}

		return false;
	}

}
