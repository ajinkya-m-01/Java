public class LastDigitOfNumber {
    public static void main(String[] ldon){
        int number=1258697;
        int LastDigit=number % 10;
        System.out.println(LastDigit);
        int ThirdLastDigit=number%1000;
        System.out.println(ThirdLastDigit);
    }
}
/*
        1)Compile time Success
        2)Run time Success:
        Output:
            7
            697
        */