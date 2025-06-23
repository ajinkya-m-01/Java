public class SecondSmallest {
    public static void main(String [] args){
        int[] arr={3,7,55,4,1,8,4,7,24,78,244};
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        System.out.println(small);
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                secondSmall=small;
                small=arr[i];
            }
            if(secondSmall>arr[i] && small!=arr[i]){
                secondSmall=arr[i];
            }
        }
        System.out.println("small "+small);
        System.out.println("secondsmall "+secondSmall);
    }
}
