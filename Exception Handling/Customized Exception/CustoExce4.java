class MyClassCastException extends RuntimeException
{
    MyClassCastException(String desc)
    {
        super(desc);
    }
}
public class CustoExce4 
{
    public static void main(String[] args) {
        Object obj=new StringBuilder();
        if (!(obj instanceof StringBuffer)) {
            throw new MyClassCastException("Class cant be casted to SB");
        }
        StringBuffer sb=(StringBuffer)obj;
        System.out.println("Execution Ends");
    }
}
//! Exception in thread "main" MyClassCastException: Class cant be casted to SB