public class ProgramOddEven {
    public static void main(String args[]){
        int a=17;
        int b=16;
        int c=a+b;
        int digit1=c%10;
        int digit2=c/10;
        int ans=digit1+digit2;
        String result=(ans%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}

        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            Even
        */