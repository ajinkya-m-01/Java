package ArraysProgram;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		
		int [] arr =new int[size];
		System.out.print(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elemnts	"+(i+1)+"	:	");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
