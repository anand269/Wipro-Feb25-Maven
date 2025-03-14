package Java;

import java.util.Scanner;

public class Password_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Password: ");
		String password=sc.next();
		boolean digits=false;
		boolean lower=false;
		boolean upper=false;
		int len=password.length();
		if(len>=8)
		{
			for(int i=0;i<len;i++)
			{
				char ch=password.charAt(i);
				if(ch>='0' && ch<='9')
					digits=true;
				else if(ch>='a' && ch<='z')
					lower=true;
				else if(ch>='A' && ch<='Z')
					upper=true; 
			}
		  	 if(digits==true && lower==true && upper==true)
				   System.out.println("Password is valid");
		   	else
				   System.out.println("Password is Invalid");
		}
		else
		         System.out.println("Password is Invalid");

	}

}
