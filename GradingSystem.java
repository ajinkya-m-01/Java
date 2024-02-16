public class GradingSystem {
    public static void main(String args[]){
        int marks=45;
        char grade=(marks>90 && marks<=100)?('A'):((marks>75 && marks<=90)?('B'):((marks>60 && marks<=75)?('C'):(marks>45 && marks<=60)?('D'):((marks>=35 && marks<=45)?('E'):('F'))));
        System.out.println(grade);
    }
}

        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            E
        */