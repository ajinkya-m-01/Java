
public class explicitExc2 {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        int op=0;
        if(num2 !=0)
        {
            op=num1/num2;
        }
        else{
            System.out.println("else");
            throw new ArithmeticException("/0");
        }
        System.out.println(op);
    }
}
