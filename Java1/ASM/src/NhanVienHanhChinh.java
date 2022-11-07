
public class NhanVienHanhChinh extends NhanVien
{

	@Override
	public double getThuNhap() 
	{
		return getLuong() - getTN();
	}

	public void Xuat() 
	{
		super.Xuat();
		System.out.println("Thuế thu nhập: " + getThuNhap());
		System.out.println("");
	}

}
