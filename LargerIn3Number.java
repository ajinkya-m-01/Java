public class LargerIn3Number 
{
    public static void main(String args[]){
        int a=60;
        int b=50;
        int c=90;
     //int result=(60>50)?((60>90)?60:90):(50>90?50:90);
        int result=(a>b)?((a>c)?a:c):(b>c?b:c);
        System.out.println(result+" is larger");
    }
}
        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            90 is larger
        */