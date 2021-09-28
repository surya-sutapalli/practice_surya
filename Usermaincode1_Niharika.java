package assignment;

public class sample2 {

	public static void main(String[] args) {
	int[] a= {10,15,20,25,30,100};
	int b=15;
	int i,sum=0,r=0;
	for(i=0;i<a.length;i++)
	{
		if(a[i]>b)
		{
			sum=sum+a[i];
		}
	}
	//System.out.println(sum);
	while(sum!=0)
	{
		r=(r*10)+(sum%10);
		sum=sum/10;
	}
	System.out.println(r);
	}

	}

