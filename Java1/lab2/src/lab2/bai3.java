package lab2;

import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.printf("Moi nhap so dien");
		float sodien=s.nextFloat();
		if(sodien<=50){
			System.out.printf("So tien phai tra la "+(sodien*1000));
		}
		else System.out.printf("So tien phai tra la"+ ((50*1000)+(sodien-50)*1200));
	}
	
}