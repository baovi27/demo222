import java.util.Scanner;

public class NhanVienTiepThi extends NhanVien 
{
	private double DoanhSo;
	private double HoaHong;
	private Scanner Nhap = new Scanner(System.in);

	public NhanVienTiepThi()
	{

	}

	public NhanVienTiepThi(double doanhSo, double hoaHong) 
	{
//		super();
		DoanhSo = doanhSo;
		HoaHong = hoaHong;
	}

	public double getDoanhSo() 
	{
		return DoanhSo;
	}

	public void setDoanhSo(double doanhSo) 
	{
		this.DoanhSo = doanhSo;
	}

	public double getHoaHong() 
	{
		return HoaHong;
	}

	public void setHoaHong(double hoaHong) 
	{
		this.HoaHong = hoaHong;
	}

	@Override

	public double getThuNhap() 
	{
		return (getLuong() + getHoaHong() - getTN());
	}

	@Override
	public void Nhap() 
	{
		super.Nhap();
		System.out.println("Nhập doanh số: ");
		this.DoanhSo = Nhap.nextDouble();
		System.out.println("Nhập hoa hồng: ");
		this.HoaHong = Nhap.nextDouble();
		Nhap.nextLine();
	}

	@Override
	public void Xuat() 
	{
		super.Xuat();
		System.out.println("Doanh số: " + this.DoanhSo);
		System.out.println("Hoa hồng: " + this.HoaHong);
		System.out.println("Thuế thu nhập: " + getTN());
		System.out.println("Tổng: " + getThuNhap());
	}
}
