
package Bai3;
import java.util.Scanner;


public class main {
    static danhsachsanpham dssp = new danhsachsanpham();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int chon=0;
        do {       
            System.out.println(""
                    + "=========================MENU=========================="
                    +"\n0. Ket thuc \n"
                    + "1. Nhap danh sach san pham tu ban phim\n" +
                      "2. Sap xep giam dan theo gia va xuat ra man hinh\n" +
                      "3. Tim va xoa san pham theo ten nhap tu ban phim\n"
                    + "4. Xuat gia trung binh cua cac san pham \n"
                    + "=======================================================");
            System.out.print("Moi ban chon : ");
            chon = sc.nextInt();
            sc.nextLine();
            switch(chon){ 
                case 1 :{ 
                    do {                        
                         SanPham sp = new SanPham();
                        sp.themsanpham();
                        dssp.themdanhsach(sp);
                        System.out.println("ban muon tiep tuc nua khong (C/K)");
                    } while (!sc.nextLine().equalsIgnoreCase("K"));
                    break;
                }
                case 2 :{ 
                    dssp.sapxepdanhsach();
                    dssp.xuatdanhsach();                   
                    break;
                }
                case 3 :{
                    System.out.println("Trang thai : "+trangthai());
                    break;
                }
                case 4 :{ 
                    dssp.xuatgiatrunhbinh();
                    break;
                }
                default:
            }
            
        } while (chon!=0);
        
    }
    static  String trangthai(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham muon xoa : ");
                    String tensp = sc.nextLine();
                    SanPham sp1 = new SanPham(tensp);
            if(dssp.xoa(sp1)){ 
                return "thanh cong";
        }
            else{ return "that bai";
            
            }
    }
}
