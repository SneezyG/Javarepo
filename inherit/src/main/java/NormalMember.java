
package inherit;

import inherit.Base;



public class NormalMember extends Base{
  
  public NormalMember() {
    System.out.println("Child constructor with no parameter");
  }
  
  public NormalMember(String name, int id, int year) {
    super(name, id, year);
    System.out.println("Child Constructor with 3 parameters");
  }
  
  @Override
  public void calculateAnnualFee() {
    annualFee = (0.01*getDiscount())*(100 + 12*30);
  }
}


