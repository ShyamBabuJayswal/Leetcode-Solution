//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
       int omax=0;
       int r=-1;
       for(int i=0;i<arr.length;i++){
           int count=binary(arr,i);
       
       if(omax<count){
           omax=count;
           r=i;
           
       }}
       
           return r;
       
       
     
    }
    public static int binary(int arr[][],int i){
        int low=0;
        int high=arr[0].length-1;
        int fid1=arr[0].length;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[i][mid]==1){
            fid1=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    int count=arr[0].length-fid1;
    return count;
        
    }
    
}