public class WideningTypeCast {
    public static void main(String args[]){
        float a=13f;
        double b=a;
        System.out.println(b);
        int c=12;
        double d=c;
        System.out.println(d);
    }
}

        /*
        1)Compile time Success
        2)Run time Success:
        Output:
            13.0
            12.0
        */
