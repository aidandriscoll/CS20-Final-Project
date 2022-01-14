import java.util.Scanner;

public class UX {

    public static void main(String[] args) {
        // Var Setup
        Scanner numScan = new Scanner(System.in);
        Scanner wordScan = new Scanner(System.in);
        String usrIn;

        String teacherPassword = "AppleADay";
        String adminPassword = "drowssap";
        boolean closeSesson = false;

        // INTRO
        System.out.println("Welcome to the school database software.");
        System.out.println("Made by Aidan Driscoll. Final Project CS 20 - 2021/22");

        // USER LOGIN
        while (true) {
            System.out.println(
                    "Select which user you would like to log in as?\n1. Student\n2. Teacher\n3. Admin\nType your selection below:");
            usrIn = wordScan.nextLine().toLowerCase();
            closeSesson = false;
            if (usrIn.contains("student") || usrIn.equals("1")) {
                // STUDENT
                System.out.println("Welcome Student.");
                System.out.println("What is your name (first and last)?");
                String studUsrName = wordScan.nextLine();
                while (true) {
                    System.out.println(
                            "- - - - - - - - - - - - - - - - - - - - - -\nLogged in as Student.\nPlease make your task selection");
                    // MODE SELECTION
                    System.out.println(
                            "1. View your grades\n2. Edit your Student information\n3. End session and log out\nPlease choose your selection (type the number of the desired option):");
                    int studModeSelect;
                    while (true) {
                        studModeSelect = numScan.nextInt();
                        if (studModeSelect >= 1 && studModeSelect <= 3) {
                            break;
                        } else {
                            System.out.println("Invalid response. Please enter a new selection.");
                        }
                    }
                    switch (studModeSelect) {
                        case 1:
                            // view grade
                            while (true) {
                                System.out.println("Which class are you looking for your grade in?");
                                usrIn = wordScan.nextLine();
                                System.out.println(operations.viewGrade(studUsrName, usrIn));
                                System.out.println("Would you like to check your grade in another class?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                } else {
                                    System.out.println();
                                }
                            }
                            System.out.println();
                            break;
                        case 2:
                            // edit stud info
                        case 3:
                            // log out
                            closeSesson = true;
                            break;
                    }
                    usrIn = "";
                    if (closeSesson == false) {
                        System.out.println("Would you like to make another selection?");
                        usrIn = wordScan.nextLine().toLowerCase();
                        if (usrIn.contains("no")) {
                            System.out.println();
                            usrIn = "";
                            break;
                        }
                    } else {
                        System.out.println();
                        usrIn = "";
                        break;
                    }
                }

            } else if (usrIn.contains("teacher") || usrIn.equals("2")) {
                // TEACHER
                System.out.println("Welcome Teacher.");
                System.out.println("Please enter your password.");
                // PASSWORD ENTRY
                while (true) {
                    usrIn = wordScan.nextLine();
                    if (!usrIn.equals(teacherPassword)) {
                        System.out.println("Incorrect password. Please try again.");
                    } else {
                        break;
                    }
                }
                while (true) {
                    System.out.println(
                            "- - - - - - - - - - - - - - - - - - - - - -\nLogged in as Teacher.\nPlease make your task selection");
                    // MODE SELECTION
                    System.out.println(
                            "1. View entire database\n2. View information for a specific student\n3. Change a student’s grade (manual)\n4. Change a student’s grade (calculate avg.)\n5. End session and log out\nPlease choose your selection (type the number of the desired option)");
                    int teachModeSelect;
                    while (true) {
                        teachModeSelect = numScan.nextInt();
                        if (teachModeSelect >= 1 && teachModeSelect <= 5) {
                            break;
                        } else {
                            System.out.println("Invalid response. Please enter a new selection.");
                        }
                    }
                    String studName;
                    switch (teachModeSelect) {
                        case 1:
                            // View full table
                        case 2:
                            // View one stud
                           
                        case 3:
                            // chng stud grade (manual)
                        case 4:
                            // chng stud grade (calc)
                        case 5:
                            // log out
                            closeSesson = true;
                            break;
                    }
                    if (closeSesson == false) {
                        System.out.println("Would you like to make another selection?");
                        usrIn = wordScan.nextLine().toLowerCase();
                        if (usrIn.contains("no")) {
                            System.out.println();
                            usrIn = "";
                            break;
                        }
                    } else {
                        System.out.println();
                        usrIn = "";
                        break;
                    }
                }
            } else if (usrIn.contains("admin") || usrIn.equals("3")) {
                // ADMIN
                System.out.println("Welcome Admin.");
                System.out.println("Please enter your password.");
                // PASSWORD ENTRY
                while (true) {
                    usrIn = wordScan.nextLine();
                    if (!usrIn.equals(adminPassword)) {
                        System.out.println("Incorrect password. Please try again.");
                    } else {
                        break;
                    }
                }
                while (true) {
                    System.out.println("- - - - - - - - - - - - - - - - - - - - - - \nLogged in as Admin.");
                    // MODE SELECTION
                    System.out.println(
                            "Please make your task selection\n1. View entire database\n2. View information for a specific student\n3. Edit Student information\n4. Enrol/modify classes for a student.\n5. Change a student’s grade (manual)\n6. Change a student’s grade (calculate avg.)\n7. Add a new student\n8. End session and log out\nPlease choose your selection (type the number of the desired option):");
                    int adminModeSelect;
                    while (true) {
                        adminModeSelect = numScan.nextInt();
                        if (adminModeSelect >= 1 && adminModeSelect <= 8) {
                            break;
                        } else {
                            System.out.println("Invalid response. Please enter a new selection.");
                        }
                    }
                    String studName;
                    switch (adminModeSelect) {
                        case 1:
                            // View full table
                        case 2:
                            // View one stud
                            
                            break;
                        case 3:
                            // edit stud info
                        case 4:
                            // edit stud class
                        case 5:
                            // chng stud grade (manual)
                        case 6:
                            // chng stud grade (calc)
                        case 7:
                            // add new stud
                        case 8:
                            // log out
                            closeSesson = true;
                            break;
                    }
                    if (closeSesson == false) {
                        System.out.println("Would you like to make another selection?");
                        usrIn = wordScan.nextLine().toLowerCase();
                        if (usrIn.contains("no")) {
                            System.out.println();
                            usrIn = "";
                            break;
                        }
                    } else {
                        System.out.println();
                        usrIn = "";
                        break;
                    }
                }
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }// e psv main
}// e pc UX.j
