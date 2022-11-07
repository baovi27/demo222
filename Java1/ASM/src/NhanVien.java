import java.util.Scanner;

public abstract class NhanVien 
{
	private String MaNhanVien;
	private String HoTen;
	private double Luong;
	private String ChucVu;
	private Scanner Nhap = new Scanner(System.in);

	public NhanVien() 
	{

	}

	public String getMaNhanVien() 
	{
		return MaNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) 
	{
		this.MaNhanVien = maNhanVien;
	}

	public String getHoTen()
	{
		return HoTen;
	}

	public void setHoTen(String hoTen)
	{
		this.HoTen = hoTen;
	}

	public double getLuong() 
	{
		return Luong;
	}

	public void setLuong(double luong) 
	{
		this.Luong = luong;
	}

	public String getChucVu() 
	{
		return ChucVu;
	}

	public void setChucVu(String chucVu) 
	{
		this.ChucVu = chucVu;
	}

	public Scanner getNhap() 
	{
		return Nhap;
	}

	public void setNhap(Scanner nhap) 
	{
		this.Nhap = nhap;
	}

	public abstract double getThuNhap();

	public void Nhap()
	{
		System.out.println("Nhập họ tên: ");
		this.HoTen = Nhap.nextLine();
		System.out.println("Nhập mã nhân viên: ");
		this.MaNhanVien = Nhap.nextLine();
		System.out.println("Nhập luong: ");
		this.Luong = Nhap.nextDouble();
		Nhap.nextLine();
	}

	public void Xuat()
	{
		System.out.println("Mã nhân viên: " + this.MaNhanVien);
		System.out.println("Tên: " + this.HoTen);
		System.out.println("Chức vụ: " + this.ChucVu);
		System.out.println("Lương: " + this.Luong);

	}

	public double getTN() 
	{
		if (this.Luong < 9000000) 
		{
			return 0;
		} else if (this.Luong <= 15000000) 
		{
			return this.Luong * 0.1;
		} else 
		{
			return this.Luong * 0.12;
		}
	}
}
