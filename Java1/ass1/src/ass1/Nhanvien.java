package ass1;

public class Nhanvien 
{
	String manv;
	String hoten;
	double luong;
	public Nhanvien()
	{
		
	}
	public Nhanvien(String manv,String hoten, double luong)
	{
		this.manv=manv;
		this.hoten=hoten;
		this.luong=luong;
	}
	public double getThuNhap()
	{
		return luong;
	}
	public double getThueTN()
	{
		if(luong<9)
			return 0;
		else if(luong<15)
			return luong*0.1;
		else
			return luong*0.12;
	}
	public String xuatThongTin()
	{
		return "Ma nha vien:"+ manv+
				" hoten:"+hoten+
				" luong:"+luong+
				" thunhap:"+getThuNhap()+
				" thue:"+getThueTN()+"\n";
	}
}
