
public class AaCalculateJava {
	AaResult[] CalJava(AaStudent[] s,int len)
	{
		AaResult[] r=new AaResult[len];
		for(int i=0;i<len;i++)
		{
		int id=s[i].getId();
		float avg=(s[i].getSub1()+s[i].getSub2()+s[i].getSub3()+s[i].getSub4()+s[i].getSub5())/5;
		char grade=this.gradeCal(avg);
		r[i]=new AaResult();
		r[i].setId(id);
		r[i].setAvg_marks(avg);
		r[i].setGrade(grade);
		
		
		}
		return r;
	}
	
	char gradeCal(float avg)
	{
		if(avg<=50)
		{
			return 'C';
		}
		else if(avg>50 && avg<80)
		{
			return 'B';
		}
		else 
			return 'A';
		
	}
	

	public static void main(String[] args) {
		
	
	}

}
