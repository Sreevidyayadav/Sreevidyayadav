/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Happystr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    String s=sc.next();
	        int count=0;
	        for(int i=0;i<s.length();i++)
	        {
	        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
	        {     count++;
	             if(count==3) 
	             {
	                System.out.println("Happy");
	                break;
	            }
	            
	        }
	        else
	        { count=0;
	            
	        }
	        
	        }
	            
	            if(count!=3){
	                System.out.println("Sad");
	            }
	             
		   
		    t--;
		
		}
	}
}

