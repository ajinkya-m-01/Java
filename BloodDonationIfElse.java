import java.util.Scanner;
public class BloodDonationIfElse {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age=sc.nextInt();

        System.out.println("Enter your Hemoglobin:");
        int hemoglobin=sc.nextInt();

        System.out.println("Enter you have any Disease:");
        boolean disease=sc.nextBoolean();

        System.out.println("You have drugs addict:");
        boolean drugsaddict=sc.nextBoolean();

        /*int hemoglobin=13;
        int age=25;
        boolean disease=false;
        boolean drugsaddict=false;*/

        if(age>18 && age<55)
        {
            if(hemoglobin>=13)
            {
                if(disease==false)
                {
                    if(drugsaddict==false)
                    {
                        System.out.println("Congrats,You are elligible for blood donation");
                    }
                    else
                    {
                        System.out.println("Sorry you are not eligible because you are drugsaddict");
                    }
                }
                else
                {
                    System.out.println("Sorry you are not eligible because you have disease");
                }
            }
            else
            {
                System.out.println("Sorry you are not eligible because youre hemoglobin is less than 13");
            }
        }
        else
        {
            if(age<18)
            {
                System.out.println("Sorry you are not eligible because you are age is more than 60");
            }
            else
            {
                System.out.println("Sorry you are not eligible because you are age is less than 18");
            }
        }
    }
}
/*
 * Compile Time:- Succes
 * Run Time:- Succes
 * O/P:-
 * 
 * Enter your Age:
25
Enter your Hemoglobin:
13
Enter you have any Disease:
false
You have drugs addict:
false
Congrats,You are elligible for blood donation
 */
