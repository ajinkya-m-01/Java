// smallest element in array
class SmallestElement{
    public static void main(String args[]){
        int [] arr={20,4,5,2,6,7,56,22};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("The smallest element in array is "+min);
    }
}