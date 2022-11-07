package lab4;

import java.util.Scanner;

public class Sanpham 
{
	String tenSP;
	double donGia;
	double giamGia;
	public double getThue() 
	{
		return donGia*0.1;
	}
	public void nhap() 
	{
		Scanner s=new Scanner(System.in);
		tenSP=s.nextLine();
		donGia=s.nextDouble();
		giamGia=s.nextDouble();
	}
	public void xuat()
	{
		System.out.printf("ten: "+tenSP+ "donGia: "+donGia+"giamgia: "+giamGia+"Thue: "+getThue());
	}
}
