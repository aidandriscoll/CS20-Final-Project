import java.util.Scanner;

public class operations {
    public static Scanner wordScan = new Scanner(System.in);
    public static Scanner numScan = new Scanner(System.in);
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
    
    // Teacher Names
    public static String[] teachers1 = { "Teacher1" };
    public static String[] teachers2 = { "Teacher2" };
    public static String[] teachers3 = { "Teacher3" };
    public static String[] teachers4 = { "Teacher4" };

    // Student Information
    public static String[] phoneNums = { "123" };
    public static String[] emails = { "example@example.com" };
    public static String[] addresses = { "Example" };
    public static String[] yearsOfSchool = { "11" };


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

    // View Student Information
    public static String viewInfo(int indexIn) {
        return ("Years of Schooling: " + yearsOfSchool[indexIn] + "\nPhone Number: " + phoneNums[indexIn] + "\nEmail: "
                + emails[indexIn] + "\nAddress: " + addresses[indexIn]);
    }// e psS viewInfo

    // Change Student Grade (manual)
    public static void changeGrade(int indexIn, String classIn, int avgIn) {
        if (classes1[indexIn].equalsIgnoreCase(classIn)) {
            grades1[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes2[indexIn].equalsIgnoreCase(classIn)) {
            grades2[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes3[indexIn].equalsIgnoreCase(classIn)) {
            grades3[indexIn] = avgIn;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avgIn + ".");
        } else if (classes4[indexIn].equalsIgnoreCase(classIn)) {
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
        int assignCount = wordScan.nextInt();
        double markTotal = 0;
        for (int i = 0; i < assignCount; i++) {
            System.out.println("What is the mark for assignment #" + i + "?");
            markTotal = markTotal + wordScan.nextDouble();
        }
        int avg = (int) Math.round((markTotal / assignCount));
        if (classes1[indexIn].equalsIgnoreCase(classIn)) {
            grades1[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes2[indexIn].equalsIgnoreCase(classIn)) {
            grades2[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes3[indexIn].equalsIgnoreCase(classIn)) {
            grades3[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else if (classes4[indexIn].equalsIgnoreCase(classIn)) {
            grades4[indexIn] = avg;
            System.out.println(names[indexIn] + "'s grade in " + classIn + " is now: " + avg + ".");
        } else {
            System.out
                    .println("Student " + names[indexIn] + " is not enroled in: " + classIn + ".\n Please try again.");
        }
    }// e psv calcGrade

    // STUDENT USER edit information
    public static void studEditInfo(int indexIn) {
        System.out.println(
                "Which information would you like to edit? \n1. Name\n2. Phone Number\n3. Email\n4. Address\nPlease make a selection: ");
        int usrSelection = numScan.nextInt();
        while (true) {
            usrSelection = numScan.nextInt();
            if (usrSelection >= 1 && usrSelection <= 4) {
                break;
            } else {
                System.out.println("Invalid response. Please enter a new selection.");
            }
        }
        switch (usrSelection) {
            case 1:
                // Name
                System.out.println("What would you like your name to be set to?");
                usrIn = wordScan.nextLine();
                names[indexIn] = usrIn;
                break;
            case 2:
                // Phone #
                System.out.println("What is your new phone number?");
                usrIn = wordScan.nextLine();
                phoneNums[indexIn] = usrIn;
                break;
            case 3:
                // Email
                System.out.println("What is your new email?");
                usrIn = wordScan.nextLine();
                emails[indexIn] = usrIn;
                break;
            case 4:
                // Address
                System.out.println("What is your new address?");
                usrIn = wordScan.nextLine();
                addresses[indexIn] = usrIn;
                break;
        }
    }// e psv studEditInfo

    // STUDENT USER edit information
    public static void adminEditInfo(int indexIn) {
        System.out.println(
                "Which information would you like to edit? \n1. Name\n2. Phone Number\n3. Email\n4. Address\n5. Years of schooling\nPlease make a selection: ");
        int usrSelection = numScan.nextInt();
        while (true) {
            usrSelection = numScan.nextInt();
            if (usrSelection >= 1 && usrSelection <= 4) {
                break;
            } else {
                System.out.println("Invalid response. Please enter a new selection.");
            }
        }
        switch (usrSelection) {
            case 1:
                // Name
                System.out.println("What would you like the new name to be set to?");
                usrIn = wordScan.nextLine();
                names[indexIn] = usrIn;
                break;
            case 2:
                // Phone #
                System.out.println("What is the new phone number for " + names[indexIn] + "?");
                usrIn = wordScan.nextLine();
                phoneNums[indexIn] = usrIn;
                break;
            case 3:
                // Email
                System.out.println("What is the new email for " + names[indexIn] + "?");
                usrIn = wordScan.nextLine();
                emails[indexIn] = usrIn;
                break;
            case 4:
                // Address
                System.out.println("What is the new address for " + names[indexIn] + "?");
                usrIn = wordScan.nextLine();
                addresses[indexIn] = usrIn;
                break;
            case 5:
                // Years of Schooling
                System.out.println("How many years of schooling has " + names[indexIn] + " had?");
                usrIn = wordScan.nextLine();
                yearsOfSchool[indexIn] = usrIn;
                break;
        }
    }// e psv adminEditInfo

    // Edit Classes
    public static void editClass(int indexIn) {

        System.out.println("Which period class would you like to modify?");
        int periodNum;
        while (true) {
            periodNum = numScan.nextInt();
            if (periodNum >= 1 && periodNum <= 4) {
                break;
            } else {
                System.out.println("Invalid response. Please enter a new selection.");
            }
        }
        switch (periodNum) {
            case 1:
                // Period 1
                System.out.println(names[indexIn] + "'s 1st period class is currently: " + classes1[indexIn]
                        + ".\nWould would you like their new class to be?");
                classes1[indexIn] = wordScan.nextLine();
                System.out.println("Who teaches " + classes1[indexIn] + "?");
                teachers1[indexIn] = wordScan.nextLine();
                break;
            case 2:
                // Period 2
                System.out.println(names[indexIn] + "'s 2nd period class is currently: " + classes2[indexIn]
                        + ".\nWould would you like their new class to be?");
                classes2[indexIn] = wordScan.nextLine();
                System.out.println("Who teaches " + classes2[indexIn] + "?");
                teachers2[indexIn] = wordScan.nextLine();
                break;
            case 3:
                // Period 3
                System.out.println(names[indexIn] + "'s 3rd period class is currently: " + classes3[indexIn]
                        + ".\nWould would you like their new class to be?");
                classes3[indexIn] = wordScan.nextLine();
                System.out.println("Who teaches " + classes3[indexIn] + "?");
                teachers3[indexIn] = wordScan.nextLine();
                break;
            case 4:
                // Period 4
                System.out.println(names[indexIn] + "'s 4th period class is currently: " + classes4[indexIn]
                        + ".\nWould would you like their new class to be?");
                classes4[indexIn] = wordScan.nextLine();
                System.out.println("Who teaches " + classes4[indexIn] + "?");
                teachers4[indexIn] = wordScan.nextLine();
                break;
        }
        System.out.println("Period " + periodNum + " class updated.");
    }// e psv editClass

    // Print Full Table
    public static void printTable() {
        System.out.println("Full Database Table: \nYr:    Student:    P1:       P2:       P3:       P4:       Email:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(yearsOfSchool[i] + "     " + names[i] + "    " + grades1[i] + "(" + classes1[i] + ")"
                    + "    " + grades2[i] + "(" + classes2[i] + ")" + "    " + grades3[i] + "(" + classes3[i] + ")"
                    + "    " + grades4[i] + "(" + classes4[i] + ")" + "    " + emails[i]);
        }
    }// e psv printTable

    // Add Student
    public static void addStudent() {

    }// e psv addStudent

    public static void saveAll() {
        Files.saveFile("Data/studentNames.txt", names);
        
        Files.saveFile("Data/ClassInfo/ClassNames/1.txt", classes1);
        Files.saveFile("Data/ClassInfo/ClassNames/2.txt", classes2);
        Files.saveFile("Data/ClassInfo/ClassNames/3.txt", classes3);
        Files.saveFile("Data/ClassInfo/ClassNames/4.txt", classes4);
        
        Files.saveFile("Data/ClassInfo/Grades/1.txt", grades1);
        Files.saveFile("Data/ClassInfo/Grades/2.txt", grades2);
        Files.saveFile("Data/ClassInfo/Grades/3.txt", grades3);
        Files.saveFile("Data/ClassInfo/Grades/4.txt", grades4);
        
        Files.saveFile("Data/ClassInfo/Teachers/1.txt", teachers1);
        Files.saveFile("Data/ClassInfo/Teachers/2.txt", teachers2);
        Files.saveFile("Data/ClassInfo/Teachers/3.txt", teachers3);
        Files.saveFile("Data/ClassInfo/Teachers/4.txt", teachers4);

        Files.saveFile("Data/StudentInfo/phoneNums.txt", phoneNums);
        Files.saveFile("Data/StudentInfo/emails.txt", emails);
        Files.saveFile("Data/StudentInfo/addresses.txt", addresses);
        Files.saveFile("Data/StudentInfo/yearsOfSchooling.txt", yearsOfSchool);
        
        System.out.println("All database files updated!");
    }// e psv saveAll

}// e pc operations.j