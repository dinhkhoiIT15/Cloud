import java.util.Scanner;

public class StudentMenu {

    // A method to display the menu options
    public static void displayMenu() {
        System.out.println("Welcome to the student menu!");
        System.out.println("Please choose an option:");
        System.out.println("1. View your profile");
        System.out.println("2. Enroll in a course");
        System.out.println("3. Drop a course");
        System.out.println("4. View your grades");
        System.out.println("5. Exit");
    }

    // A method to handle the user input
    public static void handleInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                // Call a method to view the student profile
                viewProfile();
                break;
            case 2:
                // Call a method to enroll in a course
                enrollCourse();
                break;
            case 3:
                // Call a method to drop a course
                dropCourse();
                break;
            case 4:
                // Call a method to view the student grades
                viewGrades();
                break;
            case 5:
                // Exit the program
                System.out.println("Thank you for using the student menu. Goodbye!");
                System.exit(0);
                break;
            default:
                // Invalid input
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }

    // A method to view the student profile
    public static void viewProfile() {
        // TODO: Implement the logic to view the student profile
        System.out.println("You chose to view your profile.");
    }

    // A method to enroll in a course
    public static void enrollCourse() {
        // TODO: Implement the logic to enroll in a course
        System.out.println("You chose to enroll in a course.");
    }

    // A method to drop a course
    public static void dropCourse() {
        // TODO: Implement the logic to drop a course
        System.out.println("You chose to drop a course.");
    }

    // A method to view the student grades
    public static void viewGrades() {
        // TODO: Implement the logic to view the student grades
        System.out.println("You chose to view your grades.");
    }

    public static void main(String[] args) {
        // Display the menu and handle the input in a loop
        displayMenu();
        while (true) {
            // displayMenu();
            handleInput();
        }
    }
}

