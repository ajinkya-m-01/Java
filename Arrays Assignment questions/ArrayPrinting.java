import java.util.Arrays;

public class ArrayPrinting {
    public static void main(String args[]){
        int [] arr={10,20,30,40,50,60};
        int l=arr.length;
        System.out.println("***************USING FOR LOOP****************");
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("***************USING WHILE LOOP***************");
        int j=0;
        while (j<l) {
            System.out.print(arr[j]+"\t");
            j++;
        }
        System.out.println();
        System.out.println("**************USING DO WHILE LOOP***************");
        int k=0;
        do{
            System.out.print(arr[k]+"\t");
            k++;
        }while(k<l);
        System.out.println();
        System.out.println("****************USING FOR EACH LOOP**************");

        for(int x:arr)
            System.out.print(x+"\t");
        System.out.println();
        System.out.println("*******************USING toString()**************");

        System.out.println(Arrays.toString(arr));


    }
}
