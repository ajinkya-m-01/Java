import java.util.Arrays;
public class Prac2dArray 
{
    public static void main(String[] args) {
        {
            int[][]a={{10,20},{30,40,50}};

            System.out.println("---------------------For Loop------------------");

            int i=0;
            int j=0;
            for( i=0;i<a.length;i++)
            
            {
                for(j=0;j<a[i].length;j++)
                {
                    
                System.out.print(a[i][j]+"\t");
                }
            }
            System.out.println();

            System.out.println("---------------------Do-While Loop------------------");

            int l=0;
            do{
                int m=0;
                do
                {
                    System.out.print(a[l][m]+"\t");
                    m++;
                }while(m<a[l].length);
                System.out.println();
                l++;
            }while (l<a.length);

            System.out.println("---------------------While Loop------------------");

            int p=0;
            while(p<a.length)
            {
                int q=0;
                while (q<a[p].length)
                {
                    System.out.print(a[p][q]+"\t");
                    q++;
                }
                p++;
                System.out.println();
            }

            System.out.println("---------------------For-Each Loop------------------");
            //int x=0;
            for(int [] x:a)
            for(int y:x)
            {
                System.out.print(y+"\t");
            }
            System.out.println();

            System.out.println("---------------------For-Each toString------------------");

            for(int [] q:a)
            {
                System.out.print(Arrays.toString(q));
            }
            System.out.println();

            System.out.println("---------------------deepToString------------------");
            System.out.print(Arrays.deepToString(a));

        }
    }   
}
