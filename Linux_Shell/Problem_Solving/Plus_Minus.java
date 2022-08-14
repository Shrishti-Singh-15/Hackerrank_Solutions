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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i] = sc.nextInt();
        }
        int pos = 0, neg = 0, zero = 0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]>0)
            {
                pos++;
            }
            else if(ar[i]<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
        }
        double a = (double)pos / (double)n;
        double b = (double)neg / (double)n;
        double c = (double)zero / (double)n;
        System.out.println(String.format("%.6f", a));
        System.out.println(String.format("%.6f", b));
        System.out.println(String.format("%.6f", c));
    }
}
