package slide3;

public class cau1 {
	int sum=0;
	int dem=0;
	for(int i=27;i<=250;i++)
	{
		if(i%3==0)
		{
			sum=sum+i;
			dem++;
		}
	}
	float f=(float)sum/dem;

}

