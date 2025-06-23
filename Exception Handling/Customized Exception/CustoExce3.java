class MyArrayOutOfBoundException extends RuntimeException
{
    MyArrayOutOfBoundException(String desc)
    {
        super(desc);
    }    
}
public class CustoExce3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        for(int i=0;i<=arr.length;i++)
        {
            if(i<0 || i>=arr.length)
            {
                throw new MyArrayOutOfBoundException("Wrong Index");
            }
            System.out.println(arr[i]);
        }
    }
}
/*
1
2
3
4
Exception in thread "main" MyArrayOutOfBoundException: Wrong Index */