package ArraysProgram;
public class Duplicate 
{
	public static void main(String[] args) 
	{
		int []a= {1,3,1,1,5,6,4,8,9,7,9};		
		for(int i=0;i<a.length;i++)
		{
			int cnt=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[i]!=0)
				{
					a[j]=0;
					cnt++;
				}
			}
			if(cnt>1)
			{
				System.out.println(a[i]);
			}
		}
	}
}
