//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		
System.out.println("~");
}
		
	}

// } Driver Code Ends

// User function Template for Java

// Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) {
    // Your code here
    String Result ="";
    char[] a = s.toCharArray();
    for(int i=0;i<a.length;i++){
        if(a[i]=='a'){
            Result += 2;
        }else if(a[i]=='b'){
            Result += 2;
        }else if(a[i]=='c'){
            Result += 2;
        }else if(a[i]=='d'){
            Result += 3;
        }else if(a[i]=='e'){
            Result += 3;
        }else if(a[i]=='f'){
            Result += 3;
        }else if(a[i]=='g'){
            Result += 4;
        }else if(a[i]=='h'){
            Result += 4;
        }else if(a[i]=='i'){
            Result += 4;
        }else if(a[i]=='j'){
            Result += 5;
        }else if(a[i]=='k'){
            Result += 5;
        }else if(a[i]=='l'){
            Result += 5;
        }else if(a[i]=='m'){
            Result += 6;
        }else if(a[i]=='n'){
            Result += 6;
        }else if(a[i]=='o'){
            Result += 6;
        }else if(a[i]=='p'){
            Result += 7;
        }else if(a[i]=='q'){
            Result += 7;
        }else if(a[i]=='r'){
            Result += 7;
        }else if(a[i]=='s'){
            Result += 7;
        }else if(a[i]=='t'){
            Result += 8;
        }else if(a[i]=='u'){
            Result += 8;
        }else if(a[i]=='v'){
            Result += 8;
        }else if(a[i]=='w'){
            Result += 9;
        }else if(a[i]=='x'){
            Result += 9;
        }else if(a[i]=='y'){
            Result += 9;
        }else if(a[i]=='z'){
            Result += 9;
        }
    }
        return Result;
}


//{ Driver Code Starts.

}

// } Driver Code Ends