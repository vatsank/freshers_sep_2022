package com.training;

public class HousingLoan extends Loan {

	private int  propsAge;
	
	
	public HousingLoan(String applicantName, double loanAmount, double tenure, int propsAge) {
		super(applicantName, loanAmount, tenure);
		this.propsAge = propsAge;
	}


	@Override
	public double calculateInterest() {

		double rateOfInterest = 0.10;
		
		if(propsAge>5) {
			rateOfInterest=0.12;
		}
		
		return getLoanAmount()*getTenure()*rateOfInterest;
	}

}
