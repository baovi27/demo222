package lab2;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			System.out.printf("Moi ban nhap a: ");
			float a=s.nextFloat();
			System.out.printf("Moi ban nhap b ");
			float b=s.nextFloat();
			System.out.printf("Moi ban nhap c ");
			float c=s.nextFloat();
			if(a==0) {
				
			}
			else {
				double delta = Math.pow(b,2)-4*a*c;
				System.out.printf("Delta = "+ delta);
				if(delta<0) {
					System.out.printf("Phuong trinh vo nghiem");
				}
				else if(delta==0) {
					float y=-b/(2*a);
					System.out.printf("Phuong trinh co nghiem kep ");
				}
				else {
					double x1=(-b+Math.sqrt(delta)/(2*a));
					double x2=(-b-Math.sqrt(delta)/(2*a));
					System.out.printf("Phuong trinh 2 nghiem phan biet\n");
					System.out.printf("x1= "+ x1);
					System.out.printf("\nx2= "+ x2);
				}
				
			}
	}
}