
package inherit;

import inherit.Base;


public class VIPMember extends Base {
  
  public VIPMember(String name, int id, int year) {
    super(name, id, year);
    System.out.println("VIPChild Constructor with 3 parameters");
  }
  
  @Override
  public void calculateAnnualFee() {
    annualFee = (0.01*getDiscount())*1200;
  }
}