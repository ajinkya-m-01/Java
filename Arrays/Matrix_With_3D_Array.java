import java.util.Arrays;
public class Matrix_With_3D_Array {
    public static void main(String[]args)
    {
        // char [][][] a=new char[3][2][2];
        // a[0][0][0]='A';
        // a[0][0][1]='B';
        // a[0][1][0]='C';
        // a[0][1][1]='D';
        // a[1][0][0]='E';
        // a[1][0][1]='F';
        // a[1][1][0]='G';
        // a[1][1][1]='H';
        // a[2][0][0]='I';
        // a[2][0][1]='J';
        // a[2][1][0]='K';
        // a[2][1][1]='L';
        // System.out.println(Arrays.deepToString(a));
        char [][][]a={{{'A','B'},{'C','D'}},{{'E','F'},{'G','H'}},{{'I','J'},{'K','L'}}};
        System.out.println(Arrays.deepToString(a));
    }
}
