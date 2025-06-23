package ArraysProgram;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
//		int []a= {5,8,1,7,9,3,4};iy86
		int[]a= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(a);
		int target=5;
		
		int index=binarySearch(a,target);
		if(index==-1)
		{
			System.out.println("ELEMENT NOT FOUND ");
		}
		else
		{
			System.out.println("ELEMENT FOUND AT INDEX : "+index);
		}

	}

	private static int binarySearch(int[] a, int target) {
		int min=0;
		int max=a.length-1;
		while(min<=max)
		{
			int mid=min+(max-min)/2;
			int midEle=a[mid];
			if(midEle>target)max=mid-1;
			else if(midEle<target)min=mid+1;
			else return mid;
		}
		return -1;
	}

}
