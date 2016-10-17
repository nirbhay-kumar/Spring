import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee {
	
	
	
	
	@Autowired
	@Qualifier("addressABC")
	private Address addressA;
	private Address addressB;
	public Address getAddressA() {
		return addressA;
	}
	
	public void setAddressA(Address addressA) {
		this.addressA = addressA;
	}
	public Address getAddressB() {
		return addressB;
	}
	public void setAddressB(Address addressB) {
		this.addressB = addressB;
	}
	@Override
	public String toString() {
		//return "Employee [addressA=" + addressA + ", addressB=" + addressB 				+ "]";
		return ""+addressA;
	}
	
	

}
