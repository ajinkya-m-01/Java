package ArraysProgram;

import java.util.Arrays;

public class ArraysEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[10];
		for (int i=0; i<arr.length;i++)
			arr[i] =(int)(Math.random()*9);
		System.out.println(Arrays.toString(arr));
	}

}
