// Taylor Pierson
// COP3503
// This program is used to calculate the cost of a trip, by asking for the price of gas, distance,and efficiency.
import java.util.Scanner;
public class cost
{
   public static void main(String[]args)
   {
      Scanner input= new Scanner(System.in);
      System.out.print("Enter the driving distance: ");
      double distance = input.nextDouble();
      
      System.out.print("Enter miles per gallon: ");
      double efficiency = input.nextDouble(); 
   
      System.out.print("Enter price per gallon: ");
      double price = input.nextDouble();
            
      double amount = (distance/efficiency);
      double cost = (amount*price);
      System.out.println("The cost is: " + cost);
    }
}