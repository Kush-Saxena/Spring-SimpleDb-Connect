package com.kk.dao;

import java.util.List;

import com.kk.dto.SampleObject;

public interface IDatabaseConnection {

	public List<SampleObject> fetchData(String tableName) throws Exception;

}
