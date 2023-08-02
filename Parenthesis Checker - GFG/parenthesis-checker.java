//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    public static boolean isopening(char ch){
        return ch=='('||ch=='{'||ch=='[';
        }
    public static boolean ismatching(char a,char b){
        return ((a=='('&& b==')')||(a=='{'&& b=='}')||(a=='['&& b==']'));
    }        
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++){
          char ch=x.charAt(i);
          if(isopening(ch)){
              st.push(ch);
          }
          else{
              if(st.empty()){
                  return false;
                 }
                 else if(!ismatching(st.peek(),ch)){
                     return false;
                 }
                 else{
                     st.pop();
                 }
          }
        }
        return st.empty();
    }
}
