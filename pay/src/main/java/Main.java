import staff.Staff;

public class Main {
  public static void main(String[] args) {
    // testing my staff class --- part 1
    Staff staffA = new Staff("sule");
    staffA.setHoursWorked(200);
    int pay = staffA.payCalculator(500, 200);
    System.out.println("pay = " + pay);
    
    // testing the staff class ---- part 2
    Staff staffB = new Staff("banga", "Lee");
    staffB.setHoursWorked(160);
    pay = staffB.payCalculator(); 
    System.out.println("Pay = " + pay);

 }

}