package com.training;

public class PersonalLoan extends Loan {

	private String profession;
	
	
	
	public PersonalLoan(String applicantName, double loanAmount, double tenure, String profession) {
		super(applicantName, loanAmount, tenure);
		this.profession = profession;
	}



	@Override
	public double calculateInterest() {
	double rateOfInterest = 0.20;
		
		if(profession.equals("business")) {
			rateOfInterest=0.22;
		}
		
		return getLoanAmount()*getTenure()*rateOfInterest;
	}

}
