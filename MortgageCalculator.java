import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {
   public static void main(String[] args){
      //principal ammount
      byte PERCENTAGE = 100; 
      byte ANNUAL_PERCENTAGE = 12;

      //principal ammount 
      System.out.println("Principal(£): ");
      Scanner amountscanner = new Scanner(System.in);
      int PrincipalAmount = amountscanner.nextInt();
      
      //Monthly Interest rate
      System.out.println("Monthly interest rate(%): ");
      Scanner percentages = new Scanner(System.in);
      float InterestRate = percentages.nextFloat();
      float InterestValue = InterestRate/PERCENTAGE/ANNUAL_PERCENTAGE;
      

      //no. of months
      System.out.println("Number of Years: ");
      Scanner Monthsss = new Scanner(System.in);
      byte years = Monthsss.nextByte();
      int noOfMonths = years * ANNUAL_PERCENTAGE;
  
      //calculation of Mortage
      double Mortage = PrincipalAmount*(InterestValue*Math.pow(1 + InterestValue,noOfMonths)*Math.pow(1 + InterestValue, noOfMonths)-1);
      //format mortgage value to currency value 
      String MortageFormatted = NumberFormat.getCurrencyInstance().format(Mortage); 
      System.out.println("Your Mortage is: "+ MortageFormatted);
    }
}
