public class FinallyEx4 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println("try");
                System.out.println(arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) { // Corrected exception type name
                System.out.println("Array Index Out of Bound");
                break;
            } finally {
                System.out.println("Hello From Finally");
            }
        }
        System.out.println("Bye");
    }
}
/*
Hello
try
1
Hello From Finally
try
2
Hello From Finally
try
3
Hello From Finally
Bye
 */