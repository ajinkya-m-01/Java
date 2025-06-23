import java.util.Scanner;
class LessScoreException extends RuntimeException
{
    LessScoreException(String desc)
    {
        super(desc);
    }
}
class UnderAgeException extends RuntimeException
{
    UnderAgeException(String desc)
    {
        super(desc);
    }
}
public class CustoExce5 
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age=sc.nextInt();
        if(!(age<18))
        {
            System.out.println("You are Elligible for test");
            System.out.println("Enter test Score : ");
            int score=sc.nextInt();
            if (score<60)
            {
                throw new LessScoreException("Score less by "+(60-score)+" Marks");
            } 
        }
        else{
            throw new UnderAgeException("Age is less");
        }
    }
}
/*
!Enter Your Age : 
17
Exception in thread "main" UnderAgeException: Age is less

!Enter Your Age : 
18
You are Elligible for test
Enter test Score :
55
Exception in thread "main" LessScoreException: Score less by 5 Marks

!Enter Your Age : 
18
You are Elligible for test
Enter test Score :
65
 */