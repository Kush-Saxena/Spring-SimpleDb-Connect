package com.kk.service;

import java.util.List;

import com.kk.dto.SampleObject;

public interface IDatabaseService {

	public List<SampleObject> fetchData(String tableName);

}
