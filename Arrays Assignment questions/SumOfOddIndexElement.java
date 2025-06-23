// sum of odd index elements
class SumOfOddIndexElement{
    public static void main(String args[]){
        int [] arr={10,20,30,40,50,60};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0)
                sum+=arr[i];
        }
        System.out.println("The sum of odd index elements are : "+sum);
    }
}

