public class SecondLargest {
    public static void main(String [] args){
        int [] arr={34,1,2,4,5,6,3,56,89,345,2345,8956,8,9,45};
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        System.out.println(large);
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                secondLarge=large;
                large=arr[i];
            }
            else if(secondLarge<arr[i] && large !=arr[i]){
                secondLarge=arr[i];
            }
        }
        System.out.println("large "+large);
        System.out.println("secondLarge "+secondLarge);
    }
}
