import java.util.Scanner;

public class TableEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a=sc.nextInt();
        int b=1;
        System.out.printf("The odd element  table of %d is : \n",a);
        do{
            if(a*b%2==0){
                System.out.println(a*b);
            }
            b++;
        }while(b<=10);
        sc.close();
    }
}
