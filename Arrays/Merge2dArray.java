import java.util.Arrays;
public class Merge2dArray 
{
    public static void main(String[] args) 
    {
        int [][]a={{10,20,330},{40,50,60},{90,70}};

        // to get length of an Array

        int len=0;
        for(int[] i : a)
            len=len+i.length;

        // new array created using len

        int [] narr = new int[len];
        int index=0;

        // iterating 2d array using for each and inti the element

        for(int [] i : a)
            for(int j:i)
            narr[index++]=j;

        // printing using toString
            System.out.println(Arrays.toString(narr));
    }    
}
