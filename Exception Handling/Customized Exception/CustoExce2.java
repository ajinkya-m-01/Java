class MyNullPointerException extends RuntimeException
{
    MyNullPointerException(String desc)
    {
        super(desc);
    }
}
public class CustoExce2 {
    public static void main(String[] args) {
        String str=null;
        if(str==null)
        {
            throw new MyNullPointerException("Object not yet created");
            
        }
        System.out.println(str.charAt(0));
    }
}
//!Exception in thread "main" MyNullPointerException: Object not yet created