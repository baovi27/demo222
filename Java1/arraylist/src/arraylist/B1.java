package arraylist;

import java.util.ArrayList;

public class B1 
{

	public static void main(String[] args) 
	{
		//qui dinh kieu muon them vao
		ArrayList<Integer> ds=new ArrayList<Integer>();
		//int-Interger
		//float-Float
		//ArrayList ds=new ArrayList();
		ds.add(5);
		//ds.add("hello");
		//ds.add(3.5);
		//add cai gi cung duoc
		ds.add(1,7);//5 7 3 4
		ds.set(2, 6);//5 7 6 4
		ds.remove(1);
		int x=ds.get(1);//xem
		int m=ds.size();
		boolean b=ds.isEmpty();
		for(int i=0;i<ds.size();i++)
		{
			System.out.printf(ds.get(i)+" ");
		}
		for(Integer item : ds)
		{
			System.out.printf(item+ " ");
		}
	}

}
