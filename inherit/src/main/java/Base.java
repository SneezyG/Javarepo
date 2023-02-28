
package inherit;

import java.util.Scanner;

public class Base {
  
  public String welcome = "welcome to 123CLUB";
  protected double annualFee;
  private String memberName;
  private int memberID;
  private int joined;
  private int discount;
  
  public Base() {
    System.out.println("Parent Constructor with no parameter");
  }
  
  public Base(String name, int id, int year) {
     System.out.println("Parent Constructor with 3 parameters");
     memberName = name;
     memberID = id;
     joined = year;
  }
  
  public int getDiscount() {
    return discount;
  }
  
  public void setDiscount() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the admin password: ");
    String password = input.nextLine();
    
    if (!password.equals("123")) {
      System.out.println("Invalid password. You do not have authority to edit the discount.");
    }
    else {
      System.out.print("password ok \n");
      System.out.print("Please enter discount: ");
      discount = input.nextInt();
      System.out.print("discount updated successfully: \n");
    }
  }
  
  public void displayInfo() {
    System.out.println("Member Name: " + memberName);
    System.out.println("Member ID: " + memberID);
    System.out.println("Member Since " + joined);
    System.out.println("Annual Fee: " + annualFee);
  }
  
  public void calculateAnnualFee() {
    annualFee = 0;
  }
}