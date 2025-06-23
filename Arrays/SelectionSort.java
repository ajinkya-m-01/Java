public class SelectionSort 
{
    public static void main(String args[])
    {
       int[] a={3,2443,5454,46,7,6,8,97,80,0,8657,657456,4353,45234};
       int min;
       int temp;
       for(int i=0;i<a.length;i++)
       {
        min=i;
        for(int j=i+1;j<a.length;j++)
        {
            if(a[j] < a[min])
            {
                min=j;
            }
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
       }
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
    }
}