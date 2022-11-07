import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Menu 
{
	static ArrayList<NhanVien> ListNv = new ArrayList<>();
	static Scanner nhap = new Scanner(System.in);
	static ArrayList<NhanVienHanhChinh> ListNv1 = new ArrayList<>();
	static ArrayList<NhanVienTiepThi> ListNv2 = new ArrayList<>();
	static ArrayList<TruongPhong> ListNv3 = new ArrayList<>();

	public static void main(String[] args)
	{
		int chon;
		do
		{
			System.out.println("+--------------------------------------------+");
			System.out.println("|           (¯´•._.• MENU •._.•´¯)           |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|   1.NHẬP DANH SÁCH NHÂN VIÊN               |");
			System.out.println("|   2.XUẤT DANH SÁCH NHÂN VIÊN               |");
			System.out.println("|   3.TÌM KIẾM NHÂN VIÊN THEO MÃ NHÂN VIÊN   |");
			System.out.println("|   4.XÓA NHÂN VIÊN THEO MÃ NHÂN VIÊN        |");
			System.out.println("|   5.CẬP NHẬT THÔNG TIN NHÂN VIÊN           |");
			System.out.println("|   6.TÌM KIẾM NHÂN VIÊN THEO LƯƠNG          |");
			System.out.println("|   7.SẮP XẾP NHÂN VIÊN THEO HỌ TÊN          |");
			System.out.println("|   8.SẮP XẾP NHÂN VIÊN THEO THU NHẬP        |");
			System.out.println("|   9.XUẤT 5 NHÂN VIÊN CÓ THU NHẬP CAO       |");
			System.out.println("|   0.Thoat                                  |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|                   Kết thúc                 |");
			System.out.println("+--------------------------------------------+");
			System.out.println("Mời bạn chọn chức năng (0-9): ");
			chon = nhap.nextInt();
			switch (chon)
			{
			case 0:
				System.exit(0);
			case 1:
				System.out.println("=====NHẬP DANH SÁCH NHÂN VIÊN=====");
				nhap();
			case 2:
				System.out.println("=====DANH SÁCH NHÂN VIÊN=====");
				xuat();
				break;
			case 3:
				System.out.println("=====TÌM KIẾM NHÂN VIÊN THEO MÃ NHÂN VIÊN=====");
				TimNhanVienTheoMa();
				break;
			case 4:
				System.out.println("=====XÓA NHÂN VIÊN THEO MÃ NHÂN VIÊN=====");
				XuatNhanVienTheoMa();
				break;
			case 5:
				System.out.println("=====CẬP NHẬT THÔNG TIN NHÂN VIÊN=====");
				CapNhatThongTinNhanVien();
				break;
			case 6:
				System.out.println("=====TÌM KIẾM NHÂN VIÊN THEO LƯƠNG=====");
				TimKiemNhanVienTheoLuong();
				break;
			case 7:
				System.out.println("=====SẮP XẾP NHÂN VIÊN THEO HỌ TÊN=====");
				SapXepNhanVienTheoHoTen();
				break;
			case 8:
				System.out.println("=====SẮP XẾP NHÂN VIÊN THEO THU NHẬP=====");
				SapXepNhanVienTheoLuong();
				break;
			case 9:
				System.out.println("=====XUẤT 5 NHÂN VIÊN CÓ THU NHẬP CAO NHẤT=====");
				Xuat5NhanVienTheoLuongCaoNhat();
				break;
			default:
				System.out.println("Vui Lòng Nhập Lại!!");

			}

		} while (chon != 0);
	}

	public static void nhap() 
	{
		Scanner chon = new Scanner(System.in);
		int x;
		System.out.println("Nhập số lượng nhân viên: ");
		x = chon.nextInt();
		nhap.nextLine();
		int sum = 1;
		for (int i = 0; i < x; i++) 
		{
			System.out.println("Nhân viên thứ: " + sum);
			System.out.println("CHỨC VỤ:\n-Hành chính(HC): \n-Tiếp thị(TT): \n-Trưởng Phòng(TP):\n");
			String ChucVu = nhap.nextLine();
			if (ChucVu.equalsIgnoreCase("HC"))
			{
				ChucVu = "Hành chính";
				NhanVienHanhChinh nv = new NhanVienHanhChinh();
				nv.Nhap();
				ListNv.add(nv);
				nv.setChucVu(ChucVu);
				sum++;

			} else if (ChucVu.equalsIgnoreCase("TT")) 
			{
				ChucVu = "Tiếp thị";
				NhanVienTiepThi nv = new NhanVienTiepThi();
				nv.Nhap();
				ListNv.add(nv);
				nv.setChucVu(ChucVu);
				sum++;
			} else if (ChucVu.equalsIgnoreCase("TP")) 
			{
				ChucVu = "Trưởng phòng";
				TruongPhong nv = new TruongPhong();
				nv.Nhap();
				ListNv.add(nv);
				nv.setChucVu(ChucVu);
				sum++;
			} else 
			{
				System.out.println("Nhập lại!!");
			}
		}
	}

	public static void xuat() 
	{
		for (NhanVien nv : ListNv)
		{
			nv.Xuat();
		}
	}

	public static void TimNhanVienTheoMa() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã nhân viên: ");
		String maNv = scanner.nextLine();
		for (NhanVien x : ListNv) {
			if (x.getMaNhanVien().equalsIgnoreCase(maNv))
			{
				x.Xuat();
			} else 
			{
				System.out.println("Mã nhân viên không tồn tại!!");
			}
		}
	}

	public static void XuatNhanVienTheoMa()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên muốn xóa: ");
		String maNv = scanner.nextLine();
		for (NhanVien x : ListNv) {
			if (x.getMaNhanVien().equalsIgnoreCase(maNv)) 
			{
				ListNv.remove(x);
				System.out.println("Nhân viên đã được xóa thành công!");
			}
		}
	}

	public static void CapNhatThongTinNhanVien() 
	{
		Scanner scanner = new Scanner(System.in);
		int chon;
		System.out.println("Thông tin nhân viên");
		for (NhanVien y : ListNv) 
		{
			y.Xuat();
		}
		System.out.println("Nhập mã nhân viên cần thay đổi thông tin: ");
		String maNv = scanner.nextLine();
		for (NhanVien x : ListNv) 
		{
			if (x.getMaNhanVien().equalsIgnoreCase(maNv)) 
			{
				do 
				{
					System.out.println("Thông tin cần thay đổi");
					System.out.println("0. Menu chức năng");
					System.out.println("1.Tên nhân viên");
					System.out.println("2.Mã nhân viên");
					System.out.println("3.Chức vụ nhân viên");
					System.out.println("Mời bạn chọn chức năng: ");
					chon = scanner.nextInt();
					switch (chon)
					{
					case 0:
						break;
					case 1:
						System.out.println("Thay đổi thông tin tên nhân viên!");
						System.out.println("Tên cần thay đổi: ");
						scanner.nextLine();
						x.setHoTen(scanner.nextLine());
						System.out.println("Thay đổi thông tin thành công!");
						x.Xuat();
						break;
					case 2:
						System.out.println("Thay đổi thông tin mã nhân viên");
						System.out.println("Nhập mã nhân viên cần thay đổi: ");
						scanner.nextInt();
						x.setMaNhanVien(scanner.nextLine());
						System.out.println("Thay đổi thông tin thành công!");
						x.Xuat();
						break;
					case 3:
						System.out.println("Thay đổi chức vụ nhân viên!");
						System.out.println("Nhập chức vụ cần thay đổi: ");
						scanner.nextLine();
						x.setChucVu(scanner.nextLine());
						System.out.println("Thay đổi thông tin thành công!!");
						x.Xuat();
						break;
					default:
						System.out.println("Không có chức năng này!! Nhập sai, vui lòng nhập lại!");
					}
				} while (chon != 0);
			} else 
			{
				System.out.println("Mã nhân viên không tồn tại!");

			}
		}
	}

	public static void TimKiemNhanVienTheoLuong() 
	{
		Scanner scanner = new Scanner(System.in);
		int min, max;
		System.out.println("Nhập khoản lương cần tìm");
		do
		{
			System.out.println("Nhập min: ");
			min = scanner.nextInt();
			if (min < 0) 
			{
				System.out.println("Khoảng lương không đúng vui lòng nhập lại!");
			} else 
			{
				break;
			}
		} while (true);
		do
		{
			System.out.println("Nhập max: ");
			max = scanner.nextInt();
			if (max < 0 || max < min)
			{
				System.out.println("Khoảng lương không đúng vui lòng nhập lại!");

			} else
			{
				break;
			}
		} while (true);
		for (NhanVien x : ListNv) {
			if (x.getThuNhap() >= min && x.getThuNhap() <= max)
			{
				x.Xuat();
			}
		}
	}

	public static void SapXepNhanVienTheoHoTen() 
	{
		Comparator<NhanVien> comp = new Comparator<NhanVien>()
		{
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				return o1.getHoTen().compareTo(o2.getHoTen());
			}
		};
		Collections.sort(ListNv, comp);
		System.out.println("Sắp xếp tên nhân viên");
		xuat();
	}

	public static void SapXepNhanVienTheoLuong() 
	{
		Comparator<NhanVien> comp = new Comparator<NhanVien>() 
		{
			@Override
			public int compare(NhanVien o1, NhanVien o2)
			{
				return Double.compare(o1.getThuNhap(), o2.getThuNhap());

			}
		};
		Collections.sort(ListNv, comp);
		System.out.println("Sắp xếp lương nhân viên tăng dần");
		xuat();

	}

	public static void Xuat5NhanVienTheoLuongCaoNhat()
	{
		Comparator<NhanVien> comp = new Comparator<NhanVien>()
		{
			@Override
			public int compare(NhanVien o1, NhanVien o2) 
			{
				return Double.compare(o1.getThuNhap(), o2.getThuNhap());
			}
		};
		Collections.sort(ListNv, comp);
		Collections.reverse(ListNv);
		int z = 5;
		for (int i = 0; i < 5 && i < ListNv.size(); i++)
		{
			ListNv.get(i).Xuat();
		}
	}

}
