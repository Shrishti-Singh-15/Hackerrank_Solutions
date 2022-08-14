import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int arr[] = new int[26];
        for(int i=0;i<a.length();i++)
        {
            int index = a.charAt(i) - 'a';
            arr[index]++;
        }
        for(int i=0;i<b.length();i++)
        {
            int index = b.charAt(i) - 'a';
            arr[index]--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {