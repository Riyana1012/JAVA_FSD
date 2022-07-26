package project2.emailvalidation;
import java.util.Scanner;

public class Validation {
public static void main(String args[])
			{
				Scanner scanner=new Scanner(System.in);
		
				 String Arr[]= {"riya@gmail.com",
						          "rose17@gmail.com",
						          "anu1999@gmail.com",
						           "kanish@gmail.com",
						           "lachu@gmail.com",
						           "surai2007@gmail.com",
						            "reji@gmail.com",
						           "susmi@gmail.com",
						           "sara@gmail.com",
						           "marwa54@gmail.com",
						           "merji@gmail.com"};
						
				 System.out.println("Enter the EmailId to search");
				
			   String s=scanner.next();
			  
			      
			      for(int  i=0;i<Arr.length;i++)
			       {
			    	  
			       if(Arr[i].equals(s))
			       {
			       
			    	   System.out.println("EmailId validated");
			       
			       }
			      else {
			    	  System.out.println("Invalid email");
			      }
			       }
			    
			         }
}


