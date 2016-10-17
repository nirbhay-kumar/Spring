import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	
	
	@Autowired
	private Address addressA;
	
	public Address getAddressA() {
		return addressA;
	}
	
	public void setAddressA(Address addressA) {
		this.addressA = addressA;
	}
	
	@Override
	public String toString() {
		return "Employee addressA=" + addressA;
	}
	
	

}
