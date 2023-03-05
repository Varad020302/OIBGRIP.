import java.util.Scanner;

public class OnlineExam {
    static Scanner scanner = new Scanner(System.in);
    static String username = "Varad";
    static String password = "Varad2002";
    static int marks = 0;
    static int totalQuestions = 5;
    static int remainingTime = 0;
    static boolean examStarted = false;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the Online Examination System");
        System.out.println("----------------------------------------");
        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Take Exam");
            System.out.println("4. Logout");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    updateProfile();
                    break;
                case 3:
                    if (examStarted) {
                        System.out.println("You are already taking the exam.");
                    } else {
                        takeExam();
                    }
                    break;
                case 4:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.println("Enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter your password: ");
        String inputPassword = scanner.nextLine();
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private static void updateProfile() {
        System.out.println("Enter your current password: ");
        String inputPassword = scanner.nextLine();
        if (!inputPassword.equals(password)) {
            System.out.println("Incorrect password.");
            return;
        }
        System.out.println("Enter your new username: ");
        username = scanner.nextLine();
        System.out.println("Enter your new password: ");
        password = scanner.nextLine();
        System.out.println("Profile updated successfully.");
    }

    private static void takeExam() {
        System.out.println("Welcome to the online exam.");
        examStarted = true;
        remainingTime = 300;
        marks = 0;
        for (int i = 1; i <= totalQuestions; i++) {
            System.out.println("\nQuestion " + i + ":");
            System.out.println("What is the capital of India?");
            System.out.println("A. New Delhi");
            System.out.println("B. Mumbai");
            System.out.println("C. Kolkata");
            System.out.println("D. Chennai");
            System.out.println("Enter your answer (A/B/C/D):");
            String answer = scanner.nextLine();
            if (answer.equals("A")) {
                marks++;
            }
        }
        System.out.println("\nExam completed. You scored " + marks + " out of " + totalQuestions + ".");
        examStarted = false;
    }

    private static void logout() {
        System.out.println("Thank you for using the online examination system. Hope to see you again!!");
        System.exit(0);
    }
}
