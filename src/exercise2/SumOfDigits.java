package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main (String[] args) {
    System.out.println("SumOfDigits:");
    Scanner input = new Scanner (System.in);

    int a = input.nextInt();
    int d1 = a%10;
    int a1 = a/10;
    int d2 = a1%10;
    int a2 = a1/10;
    int d3 = a1/10;
    int sum = d1+d2+d3; 
    System.out.println("sum is"+ sum);



  }
}