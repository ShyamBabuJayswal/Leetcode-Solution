//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            double avg = sc.nextDouble ();
            int[] roll = new int[n];
            int[] marks = new int[n];
            
            for (int i = 0; i < n; ++i)
                roll[i] = sc.nextInt ();
                
            for (int i = 0; i < n; ++i)
                marks[i] = sc.nextInt ();

    		System.out.println (new Solution().shouldPunish (roll, marks, n, avg));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int shouldPunish (int roll[], int marks[], int n, double avg)
    {
    int swap=0;
    for(int itr=1;itr<roll.length-1;itr++){
        for(int i=0;i<roll.length-itr;i++){
            if(roll[i]>roll[i+1]){
                swap+=2;
                int temp=roll[i];
                roll[i]=roll[i+1];
                roll[i+1]=temp;
            }
        }
    }
    
    int sum=0;
    for(int i=0;i<marks.length;i++){
        sum+=marks[i];
    }
    int nsum=sum-swap;
    double nav=nsum*(1.0)/roll.length;

        return (nav>=avg)?1:0;
}
}