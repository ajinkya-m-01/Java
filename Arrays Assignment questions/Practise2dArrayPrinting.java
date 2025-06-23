import java.util.Arrays;
public class Practise2dArrayPrinting 
{
    public static void main(String[] args) {
        {
            int[][]a={{10,20,30},{40,50,60,70}};// Array Declaration 

            System.out.println("||||********Using For Loop********||||");

            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[i].length;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }

            System.out.println("||||********Using while loop********||||");

            int i=0;
            while(i<a.length)
            {
                int j=0;
                while (j<a[i].length) 
                {
                    System.out.print(a[i][j]+"\t");
                    j++;
                }
                System.out.println();
                i++;
            }

            System.out.println("||||********Using do while loop********||||");

            int l=0;
            do
            {
                int m=0;
                do
                {
                    System.out.print(a[l][m]+"\t");
                    m++;
                }while(m<a[l].length);
                l++;
                System.out.println();
            }while (l<a.length);

            System.out.println("||||********Using For each loop********||||");           
            
            for(int [] k:a){
                for(int j:k){
                    System.out.print(j+"\t");
                }
                System.out.println();
            }
            
            System.out.println("--------------Using deepToString()---------------");
            System.out.println(Arrays.deepToString(a));

            System.out.println("--------------Using for Each toString()---------------");
            for(int[]j:a){
                System.out.println(Arrays.toString(j));
            }
        }
    }
}