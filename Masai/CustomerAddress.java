
class Customer {

	String name;
	Address address;

	public Customer( String name, Address address){
		this.name = name;
		this.address = address;
	}
}


class Address {

	String city;
	String state;
	String zip;

	public Address (String city, String state, String zip){
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}