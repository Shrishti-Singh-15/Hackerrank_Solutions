import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int ar[][] = new int[n][n];
       for(int i =0;i<n;i++)
       {
           for(int j = 0;j<n;j++)
           {
               ar[i][j] = sc.nextInt();
           }
       } 
       int sum =0, sum1 = 0;
       for(int i=0;i<n;i++)
       {
           for(int j =0;j<n;j++)
           {
               if(i == j)
               {
                   sum = sum+ar[i][j];
               }
               if((i+j) == (n-1))
               {
                   sum1 = sum1+ar[i][j];
               }
           }
       }
       System.out.println(Math.abs(sum - sum1));
    }
}
