
import inherit.NormalMember;
import inherit.VIPMember;

public class Main {
  
	public static void main(String[] args) {
	  //Instantiate the classes 
		NormalMember mem1 = new NormalMember("ahmad", 105, 2007);
		VIPMember mem2 = new VIPMember("sneezy", 10, 1990);
		
		// set member discount
    mem1.setDiscount();
    mem2.setDiscount();

    // calculate member Annual Fee
		mem1.calculateAnnualFee();
		mem2.calculateAnnualFee();
		
		// display member info
    mem1.displayInfo();
    mem2.displayInfo();
	}
}