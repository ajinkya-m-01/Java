public class PrimeInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 1, 4, 7, 9, 23, 56, 78, 34, 32, 53, 87, 54, 12, 9, 45, 76,17 ,19};
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]))
                System.out.print(arr[i]+"\t");
        }

    }
    public static boolean isPrime(int element){
        if(element==0||element==1)
            return false;
        for(int p=2;p<element;p++){
            if(element%p==0)
                return false;
        }
        return true;
    }
}