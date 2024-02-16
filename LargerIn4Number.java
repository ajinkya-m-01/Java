public class LargerIn4Number {
    public static void main(String args[]){
        int a=120;
        int b=560;
        int c=980;
        int d=100;

//int result=(120>560)?((120>980)?((120>100)?120:100):((980>100)?(980):(100))):((560>980)?((560>100)?560:100):((980>100)?980:100));

        int result=(a>b) ? ((a>c)?((a>d)?a:d)  :  ((c>d)?(c):(d)))  :  ((b>c)?((b>d)?b:d)  :  ((c>d)?c:d));
    }
}

        System.out.println(result+" is larger");
        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            900 is larger
        */
