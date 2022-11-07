package lab6;

import java.util.Scanner;

public class Danhsach 
{
	String hoten;
	String sdt;
	String email;
	String cmdd;
	
	public void nhap()
	{
		Scanner s=new Scanner(System.in);
		System.out.printf("Nhap ho ten: ");
		hoten=s.nextLine();
		System.out.printf("Nhap email: ");
		email=s.nextLine();
		System.out.printf("Nhap so dien thoai: ");
		sdt=s.nextLine();
		System.out.printf("Nhap chung minh nhan dan: ");
		cmdd=s.nextLine();
		
	}
	public void kiemtra()
	{
		String ktemail="\\w+@\\w+\\.+\\w+";
		if(!email.matches(ktemail))
		{
			System.out.print("Email"+email);
		}
		else
		{
			System.out.print("NO");
		}
		String ktsdt="0\\d{10}";
		if(!sdt.matches(ktsdt))
		{
			System.out.print("Sdt"+sdt);
		}
		else
		{
			System.out.print("No");
		}
		
		String ktCmdd="[0-9]{9}";
		if(!cmdd.matches(ktCmdd))
		{
			System.out.print("chung minh nhan dan ");
		}
		else
		{
			System.out.print("NO");
		}
		
	}
}