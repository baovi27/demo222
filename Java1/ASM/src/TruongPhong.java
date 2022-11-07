import java.util.Scanner;

public class TruongPhong extends NhanVien 
{
	private Scanner Nhap = new Scanner(System.in);
	private double LuongTN;

	public TruongPhong(double luongTN) 
	{
//		super();
		this.LuongTN = luongTN;
	}

	public TruongPhong()
	{

	}

	public double getLuongTN()
	{
		return LuongTN;
	}

	public void setLuongTN(double luongTN)
	{
		this.LuongTN = luongTN;
	}

	@Override
	public double getThuNhap() 
	{
		return (getLuong() + getLuongTN() - getTN());
	}

	@Override
	public void Nhap() 
	{
		super.Nhap();
		System.out.println("Luong Trach Nhiem");
		this.LuongTN = Nhap.nextDouble();
		Nhap.nextLine();

	}

	@Override
	public void Xuat()
	{
		super.Xuat();
		System.out.println("Lương" + getLuongTN());
		System.out.println("Thuế thu nhập: " + getTN());
		System.out.println("Tổng: " + getThuNhap());
	}
}
