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
                int studIndex;
                while (true) {
                    System.out.println("What is your name (first and last)?");
                    String studUsrName = wordScan.nextLine();
                    studIndex = operations.findIndex(studUsrName);
                    if (studIndex != -1) {
                        break;
                    } else {
                        System.out.println(
                                "Unable to find a student by the name of: " + studUsrName + ".\nPlease try again.");
                    }
                }
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
                            System.out.println(operations.viewGrade(studIndex));
                            System.out.println();
                            break;
                        case 2:
                            // edit stud info
                            while (true) {
                                operations.studEditInfo(studIndex);
                                System.out.println("Would you like to edit another piece of your student information?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                        case 3:
                            // log out
                            closeSesson = true;
                            break;
                    }
                    usrIn = "";
                    if (closeSesson == true) {
                        System.out.println(
                                "Session Ended. \n- - - - - - - - - - - - - - - - - - - - - -\n- - - - - - - - - - - - - - - - - - - - - -\n");
                        usrIn = "";
                        break;
                    }
                    if (closeSesson == false) {
                        System.out.println("Would you like to make another selection?");
                        usrIn = wordScan.nextLine().toLowerCase();
                        if (usrIn.contains("no")) {
                            System.out.println(
                                    "Session Ended. \n- - - - - - - - - - - - - - - - - - - - - -\n- - - - - - - - - - - - - - - - - - - - - -\n");
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
                    switch (teachModeSelect) {
                        case 1:
                            // View full table
                        case 2:
                            // View one stud

                        case 3:
                            // chng stud grade (manual)
                            while (true) {
                                int studIndex;
                                String studSet;
                                while (true) {
                                    System.out.println("What student's grade would you like to modify?");
                                    studSet = wordScan.nextLine();
                                    studIndex = operations.findIndex(studSet);
                                    if (studIndex != -1) {
                                        break;
                                    } else {
                                        System.out.println(
                                                "Unable to find a student by the name of: " + studSet
                                                        + ".\nPlease try again.");
                                    }
                                }
                                while (true) {
                                    System.out.println("Which class would you like to change their grade in?");
                                    usrIn = wordScan.nextLine();
                                    System.out.println("What would you like their average to be in " + usrIn + "?");
                                    int gradeSet = numScan.nextInt();
                                    operations.changeGrade(studIndex, usrIn, gradeSet);

                                    System.out.println("Would you like to change another grade for " + studSet + "?");
                                    usrIn = wordScan.nextLine().toLowerCase();
                                    if (usrIn.contains("no")) {
                                        break;
                                    }
                                }
                                System.out.println("Would you like to change the grade for another student?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                            System.out.println();
                            break;
                        case 4:
                            // chng stud grade (calc)
                            while (true) {
                                int studIndex;
                                String studSet;
                                while (true) {
                                    System.out.println("What student's grade would you like to modify?");
                                    studSet = wordScan.nextLine();
                                    studIndex = operations.findIndex(studSet);
                                    if (studIndex != -1) {
                                        break;
                                    } else {
                                        System.out.println(
                                                "Unable to find a student by the name of: " + studSet
                                                        + ".\nPlease try again.");
                                    }
                                }
                                while (true) {
                                    System.out.println("Which class would you like to change their grade in?");
                                    usrIn = wordScan.nextLine();
                                    operations.calcGrade(studIndex, usrIn);

                                    System.out.println("Would you like to change another grade for " + studSet + "?");
                                    usrIn = wordScan.nextLine().toLowerCase();
                                    if (usrIn.contains("no")) {
                                        break;
                                    }
                                }
                                System.out.println("Would you like to change the grade for another student?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                            System.out.println();
                            break;
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
                            "Please make your task selection\n1. View entire database\n2. View information for a specific student\n3. Edit Student information\n4. Enrol/modify class for a student.\n5. Change a student’s grade (manual)\n6. Change a student’s grade (calculate avg.)\n7. Add a new student\n8. End session and log out\nPlease choose your selection (type the number of the desired option):");
                    int adminModeSelect;
                    while (true) {
                        adminModeSelect = numScan.nextInt();
                        if (adminModeSelect >= 1 && adminModeSelect <= 8) {
                            break;
                        } else {
                            System.out.println("Invalid response. Please enter a new selection.");
                        }
                    }
                    switch (adminModeSelect) {
                        case 1:
                            // View full table

                        case 2:
                            // View one stud

                            break;
                        case 3:
                            // edit stud info
                            while (true) {
                                int studIndex;
                                String studSet;
                                while (true) {
                                    System.out.println("What student's grade would you like to modify?");
                                    studSet = wordScan.nextLine();
                                    studIndex = operations.findIndex(studSet);
                                    if (studIndex != -1) {
                                        break;
                                    } else {
                                        System.out.println(
                                                "Unable to find a student by the name of: " + studSet
                                                        + ".\nPlease try again.");
                                    }
                                }
                                while (true) {
                                    operations.adminEditInfo(studIndex);
                                    System.out
                                            .println("Would you like to edit another piece of student information for "
                                                    + studSet + "?");
                                    usrIn = wordScan.nextLine().toLowerCase();
                                    if (usrIn.contains("no")) {
                                        break;
                                    }
                                }
                                System.out.println("Would you like to edit another student's information?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                        case 4:
                            // edit stud class
                        case 5:
                            // chng stud grade (manual)
                            while (true) {
                                int studIndex;
                                String studSet;
                                while (true) {
                                    System.out.println("What student's grade would you like to modify?");
                                    studSet = wordScan.nextLine();
                                    studIndex = operations.findIndex(studSet);
                                    if (studIndex != -1) {
                                        break;
                                    } else {
                                        System.out.println(
                                                "Unable to find a student by the name of: " + studSet
                                                        + ".\nPlease try again.");
                                    }
                                }
                                while (true) {
                                    System.out.println("Which class would you like to change their grade in?");
                                    usrIn = wordScan.nextLine();
                                    System.out.println("What would you like their average to be in " + usrIn + "?");
                                    int gradeSet = numScan.nextInt();
                                    operations.changeGrade(studIndex, usrIn, gradeSet);

                                    System.out.println("Would you like to change another grade for " + studSet + "?");
                                    usrIn = wordScan.nextLine().toLowerCase();
                                    if (usrIn.contains("no")) {
                                        break;
                                    }
                                }
                                System.out.println("Would you like to change the grade for another student?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                            System.out.println();
                            break;
                        case 6:
                            // chng stud grade (calc)
                            while (true) {
                                int studIndex;
                                String studSet;
                                while (true) {
                                    System.out.println("What student's grade would you like to modify?");
                                    studSet = wordScan.nextLine();
                                    studIndex = operations.findIndex(studSet);
                                    if (studIndex != -1) {
                                        break;
                                    } else {
                                        System.out.println(
                                                "Unable to find a student by the name of: " + studSet
                                                        + ".\nPlease try again.");
                                    }
                                }
                                while (true) {
                                    studIndex = operations.findIndex(studSet);
                                    System.out.println("Which class would you like to change their grade in?");
                                    usrIn = wordScan.nextLine();
                                    operations.calcGrade(studIndex, usrIn);

                                    System.out.println("Would you like to change another grade for " + studSet + "?");
                                    usrIn = wordScan.nextLine().toLowerCase();
                                    if (usrIn.contains("no")) {
                                        break;
                                    }
                                }
                                System.out.println("Would you like to change the grade for another student?");
                                usrIn = wordScan.nextLine().toLowerCase();
                                if (usrIn.contains("no")) {
                                    break;
                                }
                            }
                            System.out.println();
                            break;
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
