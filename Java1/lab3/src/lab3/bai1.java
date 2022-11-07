package lab3;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Moi ban nhap so ");
		int so=s.nextInt();
		for(int i=2;i<so-1;i++)
		{
			if(so%i==0)
			{
				System.out.printf("So nay la so nguyen to");
			}
		}
	}

}