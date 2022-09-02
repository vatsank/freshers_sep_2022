package com.training;

public abstract class Loan {

	private String applicantName;
	private double loanAmount;
	private double tenure;
	
	
	public abstract double calculateInterest();

	

	public Loan(String applicantName, double loanAmount, double tenure) {
		super();
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}



	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}


	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	/**
	 * @return the loanAmount
	 */
	public double getLoanAmount() {
		return loanAmount;
	}


	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	/**
	 * @return the tenure
	 */
	public double getTenure() {
		return tenure;
	}


	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	
	
	
}
