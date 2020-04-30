package com.kk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kk.dao.IDatabaseConnection;
import com.kk.dto.SampleObject;

@Component(value = "serviceBean")
public class DatabaseServiceImpl implements IDatabaseService {

	@Autowired
	IDatabaseConnection databaseConnectionDao;

	public List<SampleObject> fetchData(String tableName) {
		
		List<SampleObject> resultData = new ArrayList<SampleObject>();
		// TODO Auto-generated method stub
		try {
			resultData = databaseConnectionDao.fetchData(tableName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Some Error Has Occured in fetching Data");
			e.printStackTrace();
		}
		
		return resultData;
	}



}
