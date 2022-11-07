package lab6;

import java.util.Scanner;

public class B1 
{

		public static void main(String[] args) 
		{
			String ten;
			Scanner s=new Scanner(System.in);
			System.out.printf("Moi ban nhap ten ");
			ten=s.nextLine();
			System.out.println("Ho cua ban la :  "+ten.substring(0,ten.indexOf(" ")).toUpperCase());
			System.out.println("Ten dem cua ban la : "+ten.substring(ten.indexOf(" "),ten.lastIndexOf(" ")));
			System.out.println("Ten cua ban la : "+ten.substring(ten.lastIndexOf(" ")).toUpperCase());
		}
	
}
