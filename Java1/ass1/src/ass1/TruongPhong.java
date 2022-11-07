package ass1;

public class TruongPhong extends Nhanvien
{
	double trachnhiem;
	public TruongPhong(String manv,String hoten,double luong,double trachnhiem) 
	{
		super(manv,hoten,luong);
		this.trachnhiem=trachnhiem;
	}
	public double getThuNhap() 
	{
		return luong+trachnhiem;
	}
}
