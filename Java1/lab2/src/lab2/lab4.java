package lab2;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
			System.out.printf("Nguyenthibaovi++++++++++++++++++MENU+++++++++++++++");
			System.out.printf("\n++++    Chuc nang 1: Phuong trinh bat 1       +++++");
			System.out.printf("\n++++    Chuc nang 2: Phuong trinh bat 2       +++++");
			System.out.printf("\n++++    Chuc nang 3: Tinh tien dien           +++++");
			System.out.printf("\n++++    Chuc nang 4: KET THUC                 +++++");
			System.out.printf("\n+++++++++++++++++++++++++++++++++++++++++++++++++++");
			Scanner s = new Scanner(System.in);
			System.out.printf("\nMoi ban nhap Chuc nang: ");
			int chon=s.nextInt();
			switch(chon) {
			case 1 : {System.out.printf("Chuc nang 1: Phuong trinh bat 1\n");
			System.out.printf("Moi ban nhap a: ");
			float a=s.nextFloat();
			System.out.printf("Moi ban nhap b: ");
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
			}break;
			}
			case 2 : {System.out.printf("Chuc nang 2: Phuong trinh bat 2");
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
				break;}
			case 3 : {System.out.printf("Chuc nang 3: Tinh tien dien");
			System.out.printf("Moi nhap so dien");
			float sodien=s.nextFloat();
			if(sodien<=50){
				System.out.printf("So tien phai tra la "+(sodien*1000));
			}
			else System.out.printf("So tien phai tra la"+ ((50*1000)+(sodien-50)*1200));
		break;}
	
			}
			}
}