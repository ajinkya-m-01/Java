public class Sum_Only_Even_Number 
{
    
        public static void main(String[] args)
        {
        int []arr={1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i : arr)
        {
            if (i%2==0)
            {
                sum=sum+arr[i];    
            }    
        }
        System.out.println(sum);
    }
}

