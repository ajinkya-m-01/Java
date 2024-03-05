public class BuzzNumberUsingLoop {
    public static void main(String args[]){
        int a=10;
        do{
            if(a%7==0 || a%10==7){
                System.out.println(a);
            }
            a++;
        }while(a<=100);
    }
}