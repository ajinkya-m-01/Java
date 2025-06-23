package ArraysProgram;

import java.util.Arrays;

public class RotationArray {

	public static void main(String[] args) {
		int []a= {3,5,1,6,2,4,8,9};
		int rt=3;
		for(int i=1;i<=rt;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));	
	}
}