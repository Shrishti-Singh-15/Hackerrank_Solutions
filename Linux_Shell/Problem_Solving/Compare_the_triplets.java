import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

// class Result {

//     /*
//      * Complete the 'compareTriplets' function below.
//      *
//      * The function is expected to return an INTEGER_ARRAY.
//      * The function accepts following parameters:
//      *  1. INTEGER_ARRAY a
//      *  2. INTEGER_ARRAY b
//      */

//     public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
//     // Write your code here

//     }

// }

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            b[i] = sc.nextInt();
        }
        int c = 0, c1 = 0;
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                c= c+1;
            }
            if(a[i]<b[i])
            {
                c1 = c1+1;
            }
        }
        System.out.print(c + " "+ c1);
    }
}
