class MyArrayIndexOutOfBoundException extends RuntimeException
{
    MyArrayIndexOutOfBoundException (String desc)
    {
        super(desc);
    }
}
public class explicitExc1
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3};
        for (int i = 0; i <= arr.length; i++)
        {
            if(i==arr.length){
                throw new MyArrayIndexOutOfBoundException("array index out of bound");
            }
            else{
                System.out.println(arr[i]);
            }   
        }
    }
}
/*
1
2
3
Exception in thread "main" MyArrayIndexOutOfBoundException: array index out of bound
 */