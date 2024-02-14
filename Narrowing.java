public class Narrowing {
    public static void main(String args[]){
        double a=13.8;
        int b=(int) a;
        System.out.println(b);
        long c=12565454353453l;
        int d=(int)c;
        System.out.println(d);
    }
}

        /*
        1)Compile time Success
        2)Run time Success:
        Output:
            13
            -1619954643
        */
