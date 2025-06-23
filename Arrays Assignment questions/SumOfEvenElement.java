public class SumOfEvenElement {
    public static void main(String args[]){
        int [] arr={1,2,3,4,5,6,7,8,9};
        int sum=0;
        for(int i:arr){
            if(i%2==0)
                sum=sum+i;
        }
        System.out.println("The sum of all even elements is "+sum);
    }
}
