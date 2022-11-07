package lab2;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.printf("Moi ban nhap a: ");
			float a=s.nextFloat();
			System.out.printf("Moi ban nhap b ");
			float b=s.nextFloat();
			if(a==0) {
				if(b==0) {
					System.out.printf("Phuong trinh vo so nghiem");
				}
				else {
					System.out.printf("Phuong trinh vo nghiem");
				}
			}
			else {
				float x=-b/a;
				System.out.printf("Nghiem phuong trinh la x= "+x);
			}
	
	}
}