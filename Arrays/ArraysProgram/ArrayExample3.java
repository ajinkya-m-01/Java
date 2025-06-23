package ArraysProgram;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[]a= {5,3,1,4,2,6};
		int target=3;
		
		int index=getIndex(a,target);
		if(index==-1)
		{
			System.out.println("ELEMENT NOT FOUND");
			
		}else
		{
			System.out.println("ELEMENT FOUND AT : "+index);
		}

	}

	private static int getIndex(int[] a, int target) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				return i;
			}
		}
		return -1;
	}

}
