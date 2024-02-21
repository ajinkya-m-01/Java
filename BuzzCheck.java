import java.util.Scanner;
class BuzzCheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        String ans=(a>99 || a<9)?("Invalid Number"):((a%10==7 || a%7==0)?("Buzz Number"):("Not Buzz Number"));
        System.out.println(ans);
        sc.close();
    }
}