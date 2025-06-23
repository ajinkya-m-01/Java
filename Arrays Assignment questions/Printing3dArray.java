import java.util.Arrays;

public class Printing3dArray {
    public static void main(String[] args) {
        int[][][] arr = { { { 10, 20, 30 }, { 40, 50 } }, { { 60 }, { 70 } },
                { { 80, 90 }, { 100, 110 }, { 120, 130 } } };

        System.out.println("----------------------------Using for loop---------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("----------------------------Using while loop---------------------");
        int x = 0;
        while (x < arr.length) {
            int j = 0;
            while (j < arr[x].length) {
                int k = 0;
                while (k < arr[x][j].length) {
                    System.out.print(arr[x][j][k] + "\t");
                    k++;
                }
                j++;
                System.out.println();
            }
            x++;
            System.out.println();
        }

        System.out.println("----------------------------Using do while loop---------------------");
        int y = 0;
        do {
            int j = 0;
            do {
                int k = 0;
                do {
                    System.out.print(arr[y][j][k] + "\t");
                    k++;
                } while (k < arr[y][j].length);
                j++;
                System.out.println();
            } while (j < arr[y].length);
            y++;
            System.out.println();
        } while (y < arr.length);

        System.out.println("----------------------------Using for each loop---------------------");
        for (int a[][] : arr) {
            for (int b[] : a) {
                for (int c : b) {
                    System.out.print(c + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("----------------------------Using deepToString()---------------------");
        System.out.println(Arrays.deepToString(arr));

        System.out.println("----------------------------Using for loop toString()---------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(Arrays.toString(arr[i][j]));

            }
            System.out.println();
        }


        System.out.println("----------------------------Using for each loop toString---------------------");
        for (int a[][] : arr) {
            for (int b[] : a) {
                System.out.println(Arrays.toString(b));
            }
            System.out.println();
        }


    }
}
