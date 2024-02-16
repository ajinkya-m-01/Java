import java.util.Scanner;
class UserInput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int a =sc.nextInt();
        System.out.println("The number is "+a);
        sc.close();
    }
}

        /* 
        Compile time Success 
        Run time Success
        Output :
        Enter number : 12
        The number is 12
         */