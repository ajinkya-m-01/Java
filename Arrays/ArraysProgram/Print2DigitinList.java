package ArraysProgram;

import java.util.Arrays;

public class Print2DigitinList {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr=new int[10];
			for (int i=10; i<arr.length;i++)
			{
				arr[i] =(int)(Math.random()*100);
			System.out.println(Arrays.toString(arr));
		}
		}

}
