import java.util.Arrays;
public class MergeArray 
{
    public static void main(String[] args) {
        {
            int []a={10,20,30};
            int []b={40,60,70};
            int[]c=new int[(a.length)+(b.length)];//merging to array a and b
            int index=0;
            for(int i:a)//for each loop
                c[index++]=i;

            for(int i:b)//for each loop
                c[index++]=i;
            System.out.println(Arrays.toString(c));
        }
    }
}
