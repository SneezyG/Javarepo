
package capturedemo;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("\n I will echo whatever you Enter \n\n");
    System.out.print("Enter an integer: ");
    int newInt = input.nextInt();
    System.out.printf("%d.%n%n", newInt);
    
    System.out.print("Enter an double: ");
    double newDouble = input.nextDouble();
    System.out.printf("%.2f.%n%n", newDouble);
    
    input.nextLine();
    
    System.out.print("Enter an string: ");
    String newString = input.nextLine();
    System.out.printf("\"%s\".%n%n", newString);
    
  }
}


