import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        // NumberFormat localPayment = NumberFormat.getCurrencyInstance();
        // //NumberFormat localPayment; 
        // localPayment = NumberFormat.getCurrencyInstance(Locale.US);
        // System.out.println("US: " + localPayment.format(payment));         
        // localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        // System.out.println("India: " + localPayment.format(payment));
        // localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
        // System.out.println("China: " + localPayment.format(payment));
        // localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // System.out.println("France: " + localPayment.format(payment));
        NumberFormat localPayment = NumberFormat.getCurrencyInstance();
        localPayment = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        System.out.println("India: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + localPayment.format(payment));
        localPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + localPayment.format(payment));
    }
}
