import java.util.Arrays;
public class ReverseArray 
{
    public static void main(String[]args)
    {
        int []a={10,30,60,20,40,50};
        System.out.println(Arrays.toString(a));
        System.out.println("Reverse Array : ");
        for(int i=a.length-1;i>=0;i--)
        {
            
            System.out.println(a[i]+" ");
        }
    }
}
