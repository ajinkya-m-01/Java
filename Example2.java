public class Example2 {
    public static void main(String args[]){
        int a=1;
        do{
            System.out.print(a+"\t");
            if(a%10==0){
                System.out.println();
            }
            a++;
        }while(a<=100);
    }    
}
