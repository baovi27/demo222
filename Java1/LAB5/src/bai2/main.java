
package bai2;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhsach ds = new danhsach();
        int luachon=0;
        do {            
            System.out.println("===menu======");
            System.out.println(""
                    + "1. Nhap danh sach ho va ten\n " +
                      "2. Xuat danh sach vua nhap\n"
                    + "3. Xuat danh sach ngay nhien\n" +
                      "4. Sap xep giam dam va xuat danh sach\n" +
                      "5. Tim va xoa ho te nhap tu ban phim\n" +
                      "0. Ket thuc");
            System.out.print("Moi ban chon : ");
            luachon=sc.nextInt();
            sc.nextLine();
            switch(luachon){ 
                case 0: System.exit(luachon);
                case 1:{ 
                    do {                        
                       hoten ht = new hoten();
                       ht.nhap();
                       ds.them(ht);
                       System.out.println("ban muon tiep tuc nua khong (C/K)");
                    } while (!sc.nextLine().equalsIgnoreCase("K"));
                    break;
                }
                 case 2:{ 
                    ds.xuatdanhsach();
                    break;
                }
                case 3:{ 
                    ds.xuatdanhsachngaunhien();
                    break;
                }
                case 4:{ 
                    ds.sapxep();
                    ds.xuatdanhsach();
                    break;
                }
                case 5:{
                    System.out.println("Nhap ho va ten muon tim xoa : ");
                    String xoaten = sc.nextLine();
                    hoten ht = new hoten(xoaten);
                    System.out.println("Xoa ho va ten : "+ds.xoahovaten(ht));
                   break;
                }
                default: System.out.println(" Ban chon sai chon lai : ");
                break;
            }
        } while (luachon!=0);
    }
    
}
