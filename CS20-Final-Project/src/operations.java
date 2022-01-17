import java.util.Scanner;

public class operations {
    public static Scanner usrScan = new Scanner(System.in);
    public static String usrIn;

    // Student Names
    public static String[] names = { "a", "b", "c", "d" };

    // Student Registered Classes
    public static String[] classes1 = { "math", "science", "chem", "music" };
    public static String[] classes2 = { "science", "chem", "music" };
    public static String[] classes3 = { "chem", "music" };
    public static String[] classes4 = { "music" };

    // Student Grades in classes
    public static int[] grades1 = { 100, 90, 80, 70 };
    public static int[] grades2 = { 90, 80, 70 };
    public static int[] grades3 = { 80, 70 };
    public static int[] grades4 = { 70 };

    // Student Information
    public static String[] phoneNum = { "123" };
    public static String[] email = { "example@example.com" };
    public static String[] address = { "Example" };

    // Teacher Names
    public static String[] teachers1 = { "Teacher1" };
    public static String[] teachers2 = { "Teacher2" };
    public static String[] teachers3 = { "Teacher3" };
    public static String[] teachers4 = { "Teacher4" };

    // - - - - - - - - - - - - - - - - - - - - - -
    // Functions

    // Find Student Index
    public static int findIndex(String nameIn) {
        int out = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameIn)) {
                out = i;
            }
        }
        return out;
    }// e psi findIndex

    // View Grade
    public static String viewGrade(int indexIn) {
        return ("Student: " + names[indexIn] + "\n" + classes1[indexIn] + ":    " + grades1[indexIn] + "\n"
                + classes2[indexIn] + ":    " + grades2[indexIn] + "\n" + classes3[indexIn] + ":    " + grades3[indexIn]
                + "\n" + classes4[indexIn] + ":    " + grades4[indexIn] + "\n");
    }// e psS viewGrade

    // Change Student Grade (manual)
    public static void changeGrade(int indexIn, String classIn, int avgIn) {
        if (classes1[indexIn].equals(classIn)) {
            grades1[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes2[indexIn].equals(classIn)) {
            grades2[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes3[indexIn].equals(classIn)) {
            grades3[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes4[indexIn].equals(classIn)) {
            grades4[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else {
            System.out
                    .println("Student " + names[indexIn] + " is not enroled in: " + classIn + ".\n Please try again.");
        }
    }// e psv changeGrade

    // Change Student Grade (Calc. Average)
    public static void calcGrade(int indexIn, String classIn) {
        System.out.println("How many assignments would you like to calculate the average from?");
        int assignCount = usrScan.nextInt();
        double markTotal = 0;
        for (int i = 0; i < assignCount; i++) {
            System.out.println("What is the mark for assignment #" + i + "?");
            markTotal = markTotal + usrScan.nextDouble();
        }
        int avg = (int) Math.round((markTotal / assignCount));
        if (classes1[indexIn].equals(classIn)) {
            grades1[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes2[indexIn].equals(classIn)) {
            grades2[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes3[indexIn].equals(classIn)) {
            grades3[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes4[indexIn].equals(classIn)) {
            grades4[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else {
            System.out
                    .println("Student " + names[indexIn] + " is not enroled in: " + classIn + ".\n Please try again.");
        }
    }// e psv calcGrade
}// e pc operations.j