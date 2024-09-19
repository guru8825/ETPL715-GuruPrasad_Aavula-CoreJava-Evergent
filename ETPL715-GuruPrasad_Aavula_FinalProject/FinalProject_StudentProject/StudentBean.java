package com.evergent.corejava.FinalProject.StudentProject;

public class StudentBean {

	private int StudentId;
	private String StudentName;
	private long studentMobileNumber;
	private double studentTotalFee;
	private double studentTotalPaidFee;
	private double studentTotalFeeToBePaid=studentTotalFee-studentTotalPaidFee;
	
	public double getStudentTotalFeeToBePaid() {
		return studentTotalFeeToBePaid;
	}
	public void setStudentTotalFeeToBePaid(double studentTotalFeeToBePaid) {
		this.studentTotalFeeToBePaid = studentTotalFeeToBePaid;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public long getStudentMobileNumber() {
		return studentMobileNumber;
	}
	public void setStudentMobileNumber(long studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}
	public double getStudentTotalFee() {
		return studentTotalFee;
	}
	public void setStudentTotalFee(double studentTotalFee) {
		this.studentTotalFee = studentTotalFee;
	}
	public double getStudentTotalPaidFee() {
		return studentTotalPaidFee;
	}
	public void setStudentTotalPaidFee(double studentTotalPaidFee) {
		this.studentTotalPaidFee = studentTotalPaidFee;
	}
}
