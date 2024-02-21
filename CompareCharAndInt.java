import java.util.Scanner;
public class CompareCharAndInt {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a='A';
        System.out.println("Enter Number");
        int b=sc.nextInt();
        boolean ans=(a==b)?true:false;
        System.out.println(ans);
        sc.close();
    }
}
