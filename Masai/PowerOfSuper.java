
class Vehicle{

	String model;
	String type;

	public Vehicle(String type,String model){
		this.model = model;
		this.type = type;
	}

	public void startEngine(){
		System.out.println("Engine started.");
	}
}

class Car extends Vehicle{

	int year;

	@Override
	public void startEngine(){
		super.startEngine();
		System.out.println("Car engine started.");
	}

	public Car(String type,String model, int year){
		super(type,model);
		this.year = year;
	}
}

class ElectricCar extends Car{

	String model;
	String type;
	int year;
	int batteryCapacity;

	@Override
	public void startEngine(){
		super.startEngine();
		System.out.println("Electric car engine started.");
	}

	public ElectricCar(String type, String  model,int year, int batteryCapacity){
		super(type,model,year);
		this.model = model;
		this.type = type;
		this.year = year;
		this.batteryCapacity = batteryCapacity;
	}

	public void elctricCarDetails(){
		System.out.println("Make: "+this.type);
		System.out.println("Model: "+this.model);
		System.out.println("Battery Capacity: "+this.batteryCapacity+" kWh");
		System.out.println("Year of Manufacture: "+this.year);
	}
}