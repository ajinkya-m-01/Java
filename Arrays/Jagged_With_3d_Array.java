import java.util.Arrays;
public class Jagged_With_3d_Array
{
    public static void main(String[] args) {
    // char [][][] a=new char[2][][];
    // a[0]=new char[1][3];
    // a[1]=new char[2][];
    // a[1][0]=new char[2];
    // a[1][1]=new char[1];
    // a[0][0][0]='a';
    // a[0][0][1]='b';
    // a[0][0][2]='c';
    // a[1][0][0]='d';
    // a[1][0][1]='e';
    // a[1][1][0]='f';
    // System.out.println(Arrays.deepToString(a));   
    char [][][]a=  {{{'a','b','c'}},{{'d','e' }, {'f'}}};
    System.out.println(Arrays.deepToString(a));
}
}
