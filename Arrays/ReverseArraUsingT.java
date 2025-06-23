import java.util.Arrays;
public class ReverseArraUsingT 
{
    public static void main(String[]args)
    {
        int []a={10,30,60,20,40,50};
        for(int i=0;i<a.length/2;i++)
        {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}