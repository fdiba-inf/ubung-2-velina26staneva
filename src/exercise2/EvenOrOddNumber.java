package exercise2;
import java.util.Scanner;

public class EvenOrOddNumber {
  public static void main (String [] args) {
    System.out.print("Geben Sie eine Zahl: ");
    Scanner input = new Scanner (System.in);

    int a = input.nextInt();

    if(a%2==0) {
    System.out.print("even");
    }
    else if (a%2==1) {
      System.out.print("odd");
    }
  }
}
