package lab6;

import java.util.Scanner;

public class Sanpham2 
{
	String tensp;
	double dongia;
	String hang;
	public void nhap()
	{
		Scanner s=new Scanner(System.in);
		System.out.printf("MOi ban nhap ten sp");
		tensp=s.nextLine();
		System.out.printf("MOi ban nhap gia sp");
		dongia=s.nextDouble();
		System.out.printf("MOi ban nhap hang sp");
		hang=s.nextLine();
		hang=s.nextLine();
	}
	public void xuat()
	{
		if(hang.equalsIgnoreCase("nokia"))
		{
			System.out.print("Ten San Pham:"+ tensp);
			System.out.print("\nDon gia: "+dongia);
			System.out.print("\nLoai: "+hang);
		}
		else {
			System.out.print("Nhap sai");
		}
	}
}