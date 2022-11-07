package ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ass1 
{
	static ArrayList<Nhanvien> ds=new ArrayList<Nhanvien>();
	public static void main(String[] args) 
	{
		int soluong;
			System.out.printf("--------------Nguyenthibaovi----------------MENU-----------------Ps22978--------\n");
			System.out.printf("++++             Chuc nang 1 : Nhap danh sach nhan vien                     ++++ \n");
			System.out.printf("++++             Chuc nang 2 : Xuat danh sach nhan vien                     ++++ \n");
			System.out.printf("++++             Chuc nang 3 : Tim va hien thi nhan vien                    ++++ \n");
			System.out.printf("++++             Chuc nang 4 : Xoa nhan vien theo ma nhap                   ++++ \n");
			System.out.printf("++++             Chuc nang 5 : Cap nhat thong tin                           ++++ \n");
			System.out.printf("++++             Chuc nang 6 : Tim nhan vien theo khoang luong              ++++ \n");
			System.out.printf("++++             Chuc nang 7 : Sap xep nhan vien theo ho va ten             ++++ \n");
			System.out.printf("++++             Chuc nang 8 : Sap xep nhan vien theo thu nhap              ++++ \n");
			System.out.printf("++++             Chuc nang 9 : Xuat 5 nhan vien co thu nhap cao nhat        ++++ \n");
			System.out.printf("--------------------------------------------------------------------------------\n");
			Scanner s=new Scanner(System.in);
			while(true) {
			System.out.printf("Moi ban nhap chuc nang : ");
			int chon=s.nextInt();
			switch(chon) {
			case 0 :
				chucnang0();
				System.out.printf("\nChuc nang 1");
				break;
			case 1 :
				chucnang1();
				System.out.printf("\nChuc nang 1");
				break;
			case 2:
				chucnang2();
				System.out.printf("\nChuc nang 2");
				break;
					
			case 3:
				chucnang3();
				System.out.printf("\nChuc nang 3");
				break;
					
			case 4:
				chucnang4();
				System.out.printf("\nChuc nang 4");
				break;
			
			case 5:
				chucnang5();
				System.out.printf("\nChuc nang 5");
				break;
			
			case 6:
				chucnang6();
				System.out.printf("\nChuc nang 6");
				break;
			
			case 7:
				chucnang7();
				System.out.printf("\nChuc nang 7");
				break;
			
			case 8:
				chucnang8();
				System.out.printf("\nChuc nang 8");
				break;
			
			case 9:
				chucnang9();
				System.out.printf("\nChuc nang 9");	
				break;
			default:
				break;
						}	
			if(chon==10)
				break;
						}
		System.out.printf("Ket thuc");
	}
		static public void chucnang0()
		{
			System.out.printf("Ban da chon chuc nang 1\n");
			System.out.printf("Ban da chon chuc nang 1\n");
			System.out.printf("Ban da chon chuc nang 1\n");
			
		}
	
		static public void chucnang1() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 1\n");
			System.out.printf("So luong nhan vien");
			int soluong=s.nextInt();
			s.nextLine();
			for(int i=1;i<=soluong;i++) 
			{
			System.out.printf(" Nhan vien "+i);
			System.out.printf(" \nMa nhan vien ");
			String ma=s.nextLine();
			System.out.printf("Ho ten nhan vien : ");
			String hoten=s.nextLine();
			System.out.printf("Luong nhan vien : ");
			double luong=s.nextDouble();
			s.nextLine();
			System.out.printf("Chon chuc vu 1(nhanvien) 2(truongphong) 3(tiepthi)  ");
			Scanner s=new Scanner(System.in);
			 int chucvu=s.nextLine();
			 s.hasNextLine();
			 if(chucvu==1)
			 {
				 Nhanvien nv=new Nhanvien(manv,ten,luong);
			 }
			 else if(chucvu==2)
			 {
				 System.out.printf("Nhap trach nhiem:");
				 double trachnhiem=s.nextDouble();
				 s.nextLine();
				 Nhanvien
			 }
			Nhanvien nv=new Nhanvien(ma,hoten,luong);
			ds.add(nv);
			}
		}
		public static void chucnang2() 
		{
			System.out.printf("Ban da chon chuc nang 2");
			for(int i=0;i<ds.size();i++)
			{
				System.out.printf(ds.get(i).xuatThongTin());
			}
		}
		public static void chucnang3() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 3");
			String macantim=s.nextLine();
			for(int i=0;i<ds.size();i++)
			{
				if(ds.get(i).manv.equals(macantim))
				{
					System.out.printf(ds.get(i).xuatThongTin());
				}
			}
		}
		public static void chucnang4() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 4");
			String macanxoa=s.nextLine();
			for(int i=0;i<ds.size();i++)
			{
				if(ds.get(i).manv.equals(macanxoa))
				{
					ds.remove(i);
				}
			}
		}
		public static void chucnang5() 
		{
			Scanner s=new Scanner(System.in);
			String macansua=s.nextLine();
			int vitricansua=-1;
			for(int i =0;i<ds.size();i++)
			{
				if(ds.get(i).manv.equals(macansua))
				{
					vitricansua=i;
				}
			}
			if(vitricansua==-1)
				System.out.print("Khong tim thay vi tri can sua");
			else
			{
				System.out.print("\nNhap ma nhan vien");
				String ma = s.nextLine();
				System.out.print("\nTen nhan vien");
				String ten=s.nextLine();
				System.out.print("\nLuong: ");
				double luong=s.nextDouble(); 
				
				Nhanvien nv=new Nhanvien(ma,ten,luong);
				ds.set(vitricansua, nv);
			}
		}
		public static void chucnang6() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 6");
			System.out.print("Moi nhap min");
			double min=s.nextDouble();
			System.out.print("Moi nhap max");
			double max=s.nextDouble();
			for(int i =0;i<ds.size();i++)
			{
				if(ds.get(i).luong>min && ds.get(i).luong<max)
				{
					System.out.print(ds.get(i).xuatThongTin());
				}
			}
		}
		public static void chucnang7() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 7");
			Comparator<Nhanvien> tieuchi=new Comparator<Nhanvien>()
			{
				public int compare(Nhanvien o1, Nhanvien o2) 
				{
					int so=o1.hoten.compareTo(o2.hoten);
					return 0;
				}

			};
		Collections.sort(ds,tieuchi);
		}
		public static void chucnang8() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 8");
			Comparator<Nhanvien> tieuchi=new Comparator<Nhanvien>()
			{
				public int compare(Nhanvien o1, Nhanvien o2) 
				{
					int so=(int)(o1.luong -o2.luong);
					return 0;
				}
		
			};
				Collections.sort(ds,tieuchi);
		}
		public static void chucnang9() 
		{
			Scanner s=new Scanner(System.in);
			System.out.printf("Ban da chon chuc nang 9");
			chucnang8();
			for(int i=0;i<5;i++)
			{
				System.out.printf(ds.get(i)+" ");
			}
		}
		public static void bai10()
		{
			System.exit(0);
		}
		
}