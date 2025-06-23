public class Example2 {
    public static void main(String[] args)throws Exception
    {
        Example2 obj = new Example2();
        obj.m1(10,0);
    }
    public static void m1(int n1,int n2)throws Exception
    {
        int op=n1/n2;
        System.out.println(op);
    }
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
 */