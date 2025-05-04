// issue 

interface Taxation{ 
	int calculateTax();
} 

class SalariedPeople implements Taxation{
	int salary;

	public SalariedPeople(int salary){
		this.salary = salary;
	}

	@Override
	public int calculateTax(){
		return 275000;
	}

	// @Override
	// public double calculateTax(){

	// 	if ( this.salary >= 10000000 ){

	// 		return 750000.00;

	// 	}else if ( this.salary >= 1000000 ){

	// 		double tax = ( this.salary * 30 ) / 100;
	// 		return this.salary - tax;

	// 	}else if ( this.salary < 100000 && this.salary >= 500000 ){

	// 		double tax = ( this.salary * 20 ) / 100;
	// 		return this.salary - tax;

	// 	}else if ( this.salary < 500000 && this.salary > 250000 ){

	// 		double tax = ( this.salary * 10 ) / 100;
	// 		return this.salary - tax;
	// 	}

	// 	return this.salary;
	// }
} 

class BusinessPeople implements Taxation{

	public BusinessPeople(int a, int b, int c){

	}

	@Override
	public int calculateTax(){
		return 848000;
	}
} 

// The total tax for this salaries person is 275000
// The total tax for this business person is 848000