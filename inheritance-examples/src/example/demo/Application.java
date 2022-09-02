package example.demo;

public class Application {

	public static void print(Insurance insurance) {
		System.out.println(insurance.calculatePremiumm());
		
	}
	public static void main(String[] args) {

		Insurance policy=new Insurance(1010203, "Ramesh", 70000);
		
		System.out.println(policy);
		
		print(policy);
		
		// superclass = subclass   =>valid
	   // anyclass = anyotherclass		 => invalid	
		Insurance healthPolicy = 
				
				new HealthInsurance(2020, "Siva", 50000, false, 45);
		
		print(healthPolicy);
		
		//HealthInsurance healPolicy= new HealthInsurance();
		
		//System.out.println(healthPolicy.calculatePremiumm());
		
		
		
	}

}
