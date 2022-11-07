package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) 
	{
		int mang[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<mang.length;i++)
		{
			System.out.printf("So thu " +(i + 1)+" :\n");
	    	mang[i]=s.nextInt();
	    }
	    System.out.println("So vua nhap la : " + Arrays.toString(mang));  
	    Arrays.sort(mang);
	    System.out.println("Phan tu cua mang sau khi sap xep :" + Arrays.toString(mang));
	    int min = mang[0];
	    for (int i = 1; i < mang.length;i++)
	    {
	    	min = Math.min(min, mang[i]);
	    }
	    System.out.println("So nho nhat la : " +min);
	    int tong = 0; 
	    int dem = 0;
	    for(int i = 0 ; i < mang.length; i++) 
	    {
	    	if(mang[i] % 3 == 0) 
	    	{
	        tong += mang[i];
	    	dem++;
	    	}
	    	float avg = (float)tong/(float)dem;
	    	System.out.println("Gia tri trung binh la : "+avg);
        }
	}
}