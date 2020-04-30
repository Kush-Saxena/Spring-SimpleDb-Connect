package com.kk.dto;

/*
 * Provide the field names as same as the column name in database.
 * Only then it would work
 * */

public class SampleObject {

	private String student_id;
	private String student_name;
	private int hostelFee;
	private boolean foodType;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(int hostelFee) {
		this.hostelFee = hostelFee;
	}

	public boolean isFoodType() {
		return foodType;
	}

	public void setFoodType(boolean foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "SampleObject [student_id=" + student_id + ", student_name=" + student_name + ", hostelFee=" + hostelFee
				+ ", foodType=" + foodType + "]";
	}

}
