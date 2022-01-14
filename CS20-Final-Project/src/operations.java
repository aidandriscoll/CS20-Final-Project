import java.util.Scanner;

public class operations {
    public static Scanner usrScan = new Scanner(System.in);
    public static String usrIn;

    public static String[] names = { "a", "b", "c", "d" };
    public static String[] classes1 = { "math", "science", "chem", "music" };
    public static String[] classes2 = { "science", "chem", "music" };
    public static String[] classes3 = { "chem", "music" };
    public static String[] classes4 = { "music" };

    public static int[] grades1 = { 100, 90, 80, 70 };
    public static int[] grades2 = { 90, 80, 70 };
    public static int[] grades3 = { 80, 70 };
    public static int[] grades4 = { 70 };

    // View Grade (STUDENT ONLY)
    public static String viewGrade(String nameIn, String classIn) {
        String output = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameIn)) {
                if (classes1[i].equalsIgnoreCase(classIn)){
                    output = (nameIn+"'s grade in " + classIn +" is: " +grades1[i]+".");
                } else if (classes2[i].equalsIgnoreCase(classIn)){
                    output = (nameIn+"'s grade in " + classIn +" is: " +grades2[i]+".");
                } else if (classes3[i].equalsIgnoreCase(classIn)){
                    output = (nameIn+"'s grade in " + classIn +" is: " +grades3[i]+".");
                } else if (classes4[i].equalsIgnoreCase(classIn)){
                    output = (nameIn+"'s grade in " + classIn +" is: " +grades4[i]+".");
                } else {
                    output = (nameIn + " is not enroled in "+classIn+".");
                }
            }
        }
        if (output.equals("")){
            return("Unable to find a student by the name of: " + nameIn +".");
        } else {
            return output;
        }
    }// e ps viewGrade

    // Change Student Grade (Calc. Average)
    public static void calcGrade() {
        System.out.println("How many assignments would you like to calculate the average from?");
        int assignCount = usrScan.nextInt();
        double markTotal = 0;
        for (int i = 0; i < assignCount; i++) {
            System.out.println("What is the mark for assignment #" + i + "?");
            markTotal = markTotal + usrScan.nextDouble();
        }
        int avg = (int) Math.round((markTotal / assignCount));
        System.out.println(avg);
    }// e ps calcGrade
}// e pc operations.j