import java.util.Arrays;
public class BubbleSort 
{
    public static void main(String[] args) {
        { 
         int [] a={2,4,1,3};
         System.out.println(Arrays.toString(a));
         for(int i=0;i<a.length;i++)
         {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[i];
                    a[i]=a[j+1];
                    a[j+1]=temp;
                }
            }
         }  
         System.out.println(Arrays.toString(a)); 
        }
    }
}
