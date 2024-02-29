import java.util.Scanner;
public class ReportCard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter School Name:");
        String School=sc.nextLine();

        System.out.print("Enter Affilation: ");
        String Affilation=sc.nextLine();

        System.out.print("Enter Your Name: ");
        String Name=sc.nextLine();

        System.out.print("Enter Date Of Birth: ");
        String Date=sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String Roll =sc.nextLine();

        System.out.print("Enter Section or Div : ");
        String Section=sc.nextLine();

        System.out.print("Enter Exam Name:");
        String Exam=sc.nextLine();


        System.out.println("Enter Marks:");

        System.out.print("Physics : ");
        int physics=sc.nextInt();

        System.out.print("Math : ");
        int math=sc.nextInt();

        System.out.print("History : ");
        int history=sc.nextInt();

        System.out.print("Geography : ");
        int geography=sc.nextInt();

        System.out.print("CS : ");
        int cs=sc.nextInt();

        int marks_obtained=physics+math+history+geography+cs;
        int total_marks=500;
        int per=(marks_obtained*100)/total_marks;

        char grade=(per>=85 && per<=100)?('A'):((per>=65 && per<85)?('B'):((per>=45 && per<65)?('C'):(per>=35 && per<45)?('E'):('F')));
        
        String remarks=(grade=='A')?("Very Good"):(grade=='B'?("Good"):(grade=='C')?("Need to Improve"):(grade=='E')?("Work Hard"):("Need not to improve"));


        System.out.println("                            School : "+School);
        System.out.println("                            Affilation : "+Affilation);
        System.out.println();
        System.out.println("Name : "+Name+"                                 Date Of Birth : "+Date);
        System.out.println("Roll No:"+Roll+"                    Section : "+Section+"           Exam : "+Exam);
        System.out.println();
        System.out.println("Subject                         Total Marks                         Marks Obtained");
        System.out.println("1.Physics                           100                                 "+physics);
        System.out.println("2.Math                              100                                 "+math);
        System.out.println("3.History                           100                                 "+history);
        System.out.println("4.Geography                         100                                 "+geography);
        System.out.println("5.CS                                100                                 "+cs);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Total                               "+total_marks+"                                 "+marks_obtained);

        System.out.println("Percentage :"+per+"                                                                Grade : "+grade);
        System.out.println("Remarks : "+remarks+"                                                              Sign : Ajinkya Mhetre");
        sc.close();




    }
}
/*
 * Compile Time:- Succes
 * Run Time:- Succes
 * O/P:-
 * 
 * Enter School Name:
L.N.HOSHING.VIDYALAY JAMKHED 413201
Enter Affilation: SSC
Enter Your Name: AJINKYA GORAKSHNATH MEHETRE
Enter Date Of Birth: 19/07/2003
Enter Roll Number: 3337
Enter Section or Div : C
Enter Exam Name:END SEM
Enter Marks:
Physics : 69
Math : 58
History : 81
Geography : 79
CS : 59
                            School : L.N.HOSHING.VIDYALAY JAMKHED 413201
                            Affilation : SSC

Name : AJINKYA GORAKSHNATH MEHETRE                                 Date Of Birth : 19/07/2003
Roll No:3337                    Section : C           Exam : END SEM

Subject                         Total Marks                         Marks Obtained
1.Physics                           100                                 69
2.Math                              100                                 58
3.History                           100                                 81
4.Geography                         100                                 79
5.CS                                100                                 59
----------------------------------------------------------------------------------
Total                               500                                 346
Percentage :69                                                                Grade : B
Remarks : Good                                                              Sign : Ajinkya Mhetre
 */