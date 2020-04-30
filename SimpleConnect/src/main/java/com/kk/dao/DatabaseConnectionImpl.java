package com.kk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kk.dto.SampleObject;
import com.kk.util.DbUtil;

@Component
public class DatabaseConnectionImpl implements IDatabaseConnection {

	@Autowired
	private DbUtil dbUtil;

	public List<SampleObject> fetchData(String tableName) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = dbUtil.getConnection();
		List<SampleObject> resultData = new ArrayList<SampleObject>();

		if (conn == null) {
			// If Database Connection fails, it will return an empty list.
			System.err.println("The Connection is returned null, Some error has Occured");
			return resultData;

		}
		String query = "Select * from " + tableName;

		PreparedStatement pStatement = conn.prepareStatement(query);

		ResultSet resultSet = pStatement.executeQuery();
		while (resultSet.next()) {

			// Here using out Object
			SampleObject tempObj = new SampleObject();

			// Fetching data according to our data types in Object
			tempObj.setStudent_id(resultSet.getString("student_id"));
			tempObj.setStudent_name(resultSet.getString("student_name"));
			tempObj.setHostelFee(resultSet.getInt("hostelFee"));
			tempObj.setFoodType(resultSet.getBoolean("foodType"));

			resultData.add(tempObj);

		}

		dbUtil.CloseConnection(conn);
		return resultData;
	}

}
