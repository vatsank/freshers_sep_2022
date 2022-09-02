package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan applicant1 =
				
				new HousingLoan("Ramkumar",2000000.00,20,1);
		
Loan applicant2 =
				
				new HousingLoan("RaviKumar",2000000.00,20,10);
	

Loan applicant3 = new PersonalLoan("Rakesh", 2000000, 20, "govt");

Loan applicant4 = new PersonalLoan("Rajesh", 2000000, 20, "business");
		LoanService service = new LoanService();
				
				 service.addLoan(applicant1);
				 service.addLoan(applicant2);
				 service.addLoan(applicant3);
				 service.addLoan(applicant4);

		
		Loan[] loans = service.getAll();
		
		for(Loan eachLoan: loans) {
			System.out.println("Interest Amount:=" +eachLoan.calculateInterest());
			
		}
	}

}
