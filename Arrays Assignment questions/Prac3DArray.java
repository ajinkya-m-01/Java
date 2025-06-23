import java.util.Arrays;
public class Prac3DArray 
{
    public static void main(String[] args) 
        {
            int[][][]a={{{10,20},{30,40,50},{60,70,80,90}}};

            System.out.println("---------------------For Loop------------------");

            int i=0;
            int j=0;
            int k=0;

            for( i=0;i<a.length;i++)
            
            {
                for(j=0;j<a[i].length;j++)
                {
                    for(k=0;k<a[i][j].length;k++)
                    {   
                    System.out.print(a[i][j][k]+"\t");
                    }
                }
            System.out.println();

            System.out.println("---------------------Do-While Loop------------------");

            int l=0;
            do{
                int m=0;
                do
                {
                    int n=0;
                    {
                    System.out.print(a[l][m][n]+"\t");
                    n++;
                    }while(n<a[l][m].length);
                    System.out.println();
                m++;
            }while (m<a[l].length);
            System.out.println();
            l++;
        }while(l<a.length);

        System.out.println("---------------------While Loop------------------");

            int p=0;
            while(p<a.length)
            {
                int q=0;
                while (q<a[p].length)
                {
                    int r=0;
                    while(r<a[p][q].length)
                    {
                    System.out.print(a[p][q][r]+"   ");
                    r++;
                }
                q++;
                System.out.println();
            }
            p++;
            System.out.println();
            }
        }
    }
}  