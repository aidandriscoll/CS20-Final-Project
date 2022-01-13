import java.util.Scanner;

public class operations {
        public static Scanner usrScan = new Scanner(System.in);
        public static String usrIn;
        
        public static String[] names = {"a", "b", "c", "d"};
        public static int[] grades = {100, 90, 80 ,70};

        //View Grade (STUDENT ONLY)
        public static void viewGrade(String nameIn){
            for (int i=0; i < names.length; i++){
                if (names.equals(nameIn)){
                    System.out.println(grades[i]);
                } else {
                    //return 0;
                }
            }
        }//e ps viewGrade
      


        //Change Student Grade (Calc. Average)
        public static void calcGrade(){
            System.out.println("How many assignments would you like to calculate the average from?");
            int assignCount = usrScan.nextInt();
            double markTotal; 
            for (int i = 0; i<assignCount ;i++){
                System.out.println("What is the mark for assignment #"+i+"?");        
                markTotal = markTotal + usrScan.nextDouble();
            }
            
        }//e ps calcGrade
}//e pc operations.j