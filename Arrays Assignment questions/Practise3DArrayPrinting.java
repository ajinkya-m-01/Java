import java.util.Arrays;
public class Practise3DArrayPrinting 
{
    public static void main(String[]args)
    {
        int [][][]a={{{1,2,3},{5,6},{7,8,9}}};
         
        System.out.println("------------Using For loop------------");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+"\t");
                }
                System.out.println();
            }
        }

        System.out.println("------------Using While loop------------");

        int i=0;
        while( i<a.length)
        {
            int j=0;
            while(j<a[i].length)
            {
                int k=0;
                while(k<a[i][j].length)
                {
                    System.out.print(a[i][j][k]+"\t");
                    k++; 
                }
                System.out.println();
                j++;
            }
            i++;
        }

        System.out.println("----------Using Do-While loop-----------");

        int p=0;
        do
        {
            int q=0;
            do
            {
                int r=0;
                do
                {
                    System.out.print(a[p][q][r]+"\t");
                    r++;
                }while (r<a[p][q].length) ;
                q++;    
                System.out.println();
            }while (q<a[p].length); 
            p++;
            System.out.println();
        }while(p<a.length);
    }
}
