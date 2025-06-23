import java.util.Arrays;
public class Selection {

	public static void main(String[] args) 
	{
		int []a={9,2,4,6,1,3};
		int min;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}

	}

}
