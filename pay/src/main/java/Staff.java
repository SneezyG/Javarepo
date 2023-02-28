
package staff;

public class Staff {
  
  private String staffName;
  private final int hourlyRate = 30;
  private int hoursWorked = 0;
  
  public Staff(String name) {
    staffName = name;
    System.out.println("\n" + "Echo staff name: " + staffName);
    System.out.println("-------------------");
  }
  
  public Staff(String firstName, String lastName) {
    staffName = firstName + " " + lastName;
    System.out.println("\n" + "Echo staff name: " + staffName);
    System.out.println("-------------------");
  }
  
  public void processing() {
    System.out.println("processing pay...");
  }
  
  public int payCalculator() {
    processing();
    int pay = hourlyRate * hoursWorked;
    if (hoursWorked > 0)
      return pay;
    else
      return -1;
  }
  
  public int payCalculator(int bonus, int alawee) {
    processing();
    int pay = hoursWorked * hourlyRate;
    int extra = bonus + alawee;
    if (hoursWorked > 0)
      return pay + extra;
    else
      return -1;
  }
  
  public void setHoursWorked(int hours) {
    if (hours > 0) {
      hoursWorked = hours;
    }
    else {
      System.out.println("Error: hours cannot be smaller than zero");
      System.out.println("Error: hoursWorked is not updated");
    }
  }
      
  public int getHoursWorked() {
    return hoursWorked;
  }
    
}