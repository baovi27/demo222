package lab4;

import java.util.Scanner;

public class Sanpham2 
{
	String tenSp;
	double donGia;
	double giamGia;
	public double getThueNhapKhau()
	{
		return this.donGia*0.1;
	}
	public void nhap()
	{
		Scanner s= new Scanner(System.in);
		System.out.printf("Ten san pham la");
		this.tenSp= s.nextLine();
		System.out.printf("Gia san pham la");
		this.donGia= s.nextDouble();
		System.out.printf("Giam gia");
		this.giamGia= s.nextDouble();
	}
	public void xuat()
	{
		System.out.printf("Ten : "+ tenSp);
		System.out.printf("Don gia : "+ donGia);
		System.out.printf("Giam gia : "+ giamGia);
		System.out.printf("Thue : "+ getThueNhapKhau());
	}
}
