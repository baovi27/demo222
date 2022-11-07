package lab3;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) 
	{
		Scanner tv=new Scanner(System.in);
		int n;
		System.out.print("Moi ban nhap so sinh vien: ");
		n=tv.nextInt();
		String hoten[]= new String[n];
		double diem[]= new double[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Moi ban nhap Ho va ten: ");
			hoten[i]=tv.next();
			tv.nextLine();
			System.out.print("Moi ban nhap vao Diem: ");
			diem[i]=tv.nextDouble();
		}
		xuat(hoten,diem,n);
		hoandoi(hoten,diem,n);
	}
		public static void xuat(String hoten[], double diem[], int n ) 
		{
		for(int i=0; i<n; i++)
			{
			System.out.print("\nHo va ten: "+hoten[i]);
			System.out.printf("\nDiem: %.1f\n",diem[i]);
			if(diem[i]>=9)
			{
				System.out.println("Hoc luc: Xuat sac");
			}
			else if(diem[i]>=7.5)
			{
				System.out.println("Hoc luc: Gioi");
			}
			else if(diem[i]>=6.5)
			{
				System.out.println("Hoc luc: Kha");
			}
			else if(diem[i]>=5)
			{
				System.out.println("Hoc luc: Trung binh");
			}
			else
			{
				System.out.println("Hoc luc: Yeu");
			}
				
			}
		}
public static void hoandoi(String hoten[], double diem[], int n )
		{
			 for(int i=0; i<n; i++)
			{
				for(int j=i; j<n; j++)
				{
					if(diem[i]>diem[j])
					{
						double tam=diem[i];
						diem[i]=diem[j];
						diem[j]=tam;
						
						String tentam=hoten[i];
						hoten[i]=hoten[j];
						hoten[j]=tentam;
					}
				}
			}
		}

}
