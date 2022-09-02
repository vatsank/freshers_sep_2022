package example.demo;

public class HealthInsurance extends Insurance {
	
	private boolean preExisitingDisease;
	private int age;
	
	
	public HealthInsurance() {
	}


	public HealthInsurance(long policyNumber, String policyHolderName, double policyAmount, boolean preExisitingDisease,
			int age) {
		super(policyNumber, policyHolderName, policyAmount);
		this.preExisitingDisease = preExisitingDisease;
		this.age = age;
	}


	@Override
	protected double calculatePremiumm() {

		double premium = 6000;
		
		if(preExisitingDisease && age>60) {
			premium =7000;
		}
		
		System.out.println("Inside Sub class");
		
		return premium;
	}
	
	
	
	

}
