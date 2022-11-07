package ass1;

public class Tiepthi extends Nhanvien
{
	double doanhso;
	double huehong;
	public Tiepthi(String manv,String hoten,double luong,double doanhso,double huehong)
	{
		super(manv,hoten,luong);
		this.doanhso=doanhso;
		this.huehong=huehong;
	}
	public double getThuNhap() 
	{
		return luong+doanhso+huehong;
	}
	
}
