import java.util.Arrays;
public class ZigZagMerging {
    public static void main(String[] args) 
    {
        int [] a = {1,2,3};
        int [] b = {4,5,6,7};

        // creating new array using both arrays length

        int [] narr = new int [(a.length)+(b.length)];

        // creatig a loop which will iterate till largest arrays  length 

        for(int i = 0, j = 0;i < b.length;i++)
        {
            // check if index is less than i or else AIOOBE

            if ( i < a.length)
                narr[j++] = a[i];

                //storing elements directly form bigger length arrays 
                
            narr[j++] = b[i];
        }
       System.out.println(Arrays.toString(narr)); 
    }    
}