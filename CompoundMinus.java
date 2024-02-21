public class CompoundMinus {
    public static void main(String args[]){
        int Fees=1000;
        float paid=505.78f;
        Fees-=paid;
        System.out.println(Fees);
        /*
        1)Compile time Success
        2)Run time Success:
        Output:
            494
        */
    }
}
