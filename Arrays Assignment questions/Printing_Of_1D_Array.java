import java.util.Arrays;
public class Printing_Of_1D_Array{
    public static void main(String[]args)
    {
        //Using for loop
        int[]a ={10,20,30,40,50,60};
        int l=a.length;
        for(int i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("********************");
        //Using while loop
        int j=0;
        while(j<l) {
            System.out.println(a[j]);
            j++;
        }
        System.out.println("********************");
        //Using DoWhile Loop
        int k=0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<l);
        System.out.println("********************");
        //Using ForEach loop
        for(int i:a)
        System.out.println(i);
        System.out.println("********************");
        //Simple method
        System.out.println(Arrays.toString(a));

        for(int z:a)
        System.out.println((z));
    }
    
}
