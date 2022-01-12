import java.util.Scanner;

public class Main {
    public static Scanner usrScan = new Scanner(System.in);
    public static String usrIn;

    public static void main(String[] args) {
        String teacherPassword = "AppleADay";
        String adminPassword = "drowssap";
        System.out.println("Welcome to the school database software.");
        System.out.println("Made by Aidan Driscoll. Final Project CS 20 - 2021/22");
        
        //USER LOGIN
        while (true) {
            System.out.println(
                    "Select which user you would like to log in as?\n1. Student\n2. Teacher\n3. Admin\nType your selection below:");
            usrIn = usrScan.nextLine().toLowerCase();
            if (usrIn.contains("student") || usrIn.equals("1")) {
                // STUDENT
                System.out.println("Welcome Student.");
                System.out.println("What is your name (first and last)?");
                String studUsrName = usrScan.nextLine();
                System.out.println("- - - - - - - - - - - - - - - - - - - - - -\nLogged in as Student.\nPlease make your task selection");
                //MODE SELECTION
                System.out.println("1. View your grades\n2. Edit your Student information\n3. End session and log out\nPlease choose your selection (type the number of the desired option):");
                int studModeSelect;
                while (true) {
                    studModeSelect = usrScan.nextInt();
                    if (studModeSelect >= 1 && studModeSelect <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid response. Please enter a new selection.");
                    }
                }
                switch (studModeSelect) {
                    case 1:
                        //view grade
                    case 2:
                        //edit stud info
                    case 3:
                        //log out
                }

            } else if (usrIn.contains("teacher") || usrIn.equals("2")) {
                // TEACHER
                System.out.println("Welcome Teacher.");
                System.out.println("Please enter your password.");
                //PASSWORD ENTRY
                while (true) {
                    usrIn = usrScan.nextLine();
                    if (!usrIn.equals(teacherPassword)) {
                        System.out.println("Incorrect password. Please try again.");
                    } else {
                        break;
                    }
                }
            } else if (usrIn.contains("admin") || usrIn.equals("3")) {
                // ADMIN
                System.out.println("Welcome Admin.");
                System.out.println("Please enter your password.");
                //PASSWORD ENTRY
                while (true) {
                    usrIn = usrScan.nextLine();
                    if (!usrIn.equals(adminPassword)) {
                        System.out.println("Incorrect password. Please try again.");
                    } else {
                        break;
                    }
                }
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - \nLogged in as Admin.");
                //MODE SELECTION
                System.out.println("Please make your task selection\n1. View entire database\n2. View information for a specific student\n3. Edit Student information\n4. Enrol/modify classes for a student.\n5. Change a student’s grade (manual)\n6. Change a student’s grade (calculate avg.)\n7. Add a new student\n8. End session and log out\nPlease choose your selection (type the number of the desired option):");
                int adminModeSelect; 
                while (true) {
                    adminModeSelect = usrScan.nextInt();
                    if (adminModeSelect >= 1 && adminModeSelect <= 3) {
                        break;
                    } else {
                        System.out.println("Invalid response. Please enter a new selection.");
                    }
                }
                switch (adminModeSelect) {
                    case 1:
                        //View full table
                    case 2:
                        //View one stud
                    case 3:
                        //edit stud info
                    case 4:
                        //edit stud class
                    case 5:
                        //chng stud grade (manual)
                    case 6:
                        //chng stud grade (calc)
                    case 7:
                        //add new stud
                    case 8:
                        //log out    
                }


            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }//e psv main
}//e pc main.j
