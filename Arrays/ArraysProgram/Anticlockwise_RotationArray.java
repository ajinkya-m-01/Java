package ArraysProgram;

import java.util.Arrays;

public class Anticlockwise_RotationArray {

    public static void main(String[] args) {
        int []a= {3,5,1,6,2,4,8,9};
        int rt=3;
        for(int i=1;i<=rt;i++) {
            int temp = a[a.length-1];
            for(int j=a.length-1;j>0;j--) {
                a[j] = a[j-1];
            }
            a[0] = temp;
        }
        System.out.println(Arrays.toString(a));    
    }

}
