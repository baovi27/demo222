package Bai1;


import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 
{
    public static void main(String[] args) 
    {
        ArrayList<Double> danhsach = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach : ");
        for(int i=0; ;i++)
        {
            System.out.print("phan tu thu "+i+" : ");
            Double bien = sc.nextDouble();
            danhsach.add(bien);
            System.out.print ("Ban co muon tiep tuc khong (nhan 0 de dung ) : ");
           int x= sc.nextInt();
           if(x==0)
           {
               break;
           }
        }
        double tong =0;
        System.out.print("\nIn ra danh sach vua nhap : \t");
        for(Double n :danhsach)
        {
            System.out.print(n +"\t");
            tong+=n;
        }
        System.out.println("\n\nTong cac so trong danh sach la : "+tong);
    } 
}
