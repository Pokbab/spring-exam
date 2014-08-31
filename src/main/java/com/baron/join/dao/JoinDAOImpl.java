package com.baron.join.dao;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Repository;

import com.baron.login.model.LoginModel;

@Repository
public class JoinDAOImpl implements JoinDAO {

	@Override
	public void insertJoinData(LoginModel model) {
		FileWriter writer = null;
		try {
//			writer = new FileWriter("src\\main\\resources\\data.txt");
			
			String resourcesPath = this.getClass().getResource("../../../../").getPath();
			
			writer = new FileWriter(resourcesPath + "data.txt");
			writer.write(model.getId() + "=" + model.getPassword());
			writer.flush();
		} catch (IOException e) {
			IOUtils.closeQuietly(writer);
		}
	}

}
