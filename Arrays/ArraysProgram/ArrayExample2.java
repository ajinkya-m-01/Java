package ArraysProgram;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[30];
		for(int i=10,j=0;i<=300;i+=10,j++)
			arr[j]=i;
		System.out.println(Arrays.toString(arr));
		
	}

}
