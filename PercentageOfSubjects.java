public class PercentageOfSubjects {
    public static void main(String args[]){
        int CyberSecurity=100;
        int AI=87;
        int Web=100;
        int DSBDA=60;
        int CNS=90;

        int ObtainMarks=CyberSecurity+AI+Web+DSBDA+CNS;
        int TotalMarks=500;
        int per=(ObtainMarks*100)/TotalMarks;

        char grade=(per>90 && per<=100)?('A'):((per>75 && per<=90)?('B'):((per>60 && per<=75)?('C'):(per>45 && per<=60)?('D'):((per>=35 && per<=45)?('E'):('F'))));

        System.out.println("Obtained Marks : "+ObtainMarks);
        System.out.println("Percentage : "+per);
        System.out.println("Grade : "+grade);
    }
}


        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            Obtained Marks : 437
            Percentage : 87
            Grade : B
        */