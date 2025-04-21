package day3;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    private String rollNumber;
    private String stdName;
    private String stdEmail;
    private String stdPassword;

    // Constructor
    public Student(String rollNumber, String stdName, String stdEmail, String stdPassword) {
        this.rollNumber = rollNumber;
        this.stdName = stdName;
        this.stdEmail = stdEmail;
        this.stdPassword = stdPassword;
    }

    // Getters
    public String getRollNumber() {
        return rollNumber;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdEmail() {
        return stdEmail;
    }

    public String getStdPassword() {
        return stdPassword;
    }
}

class StudentLogin {
    private HashMap<String, Student> studentDatabase = new HashMap<>();

    // Register a new student
    public void registerStudent(String rollNumber, String stdName, String stdEmail, String stdPassword) {
        if (studentDatabase.containsKey(rollNumber)) {
            System.out.println("⚠️ Student already registered!");
        } else {
            Student student = new Student(rollNumber, stdName, stdEmail, stdPassword);
            studentDatabase.put(rollNumber, student);
            System.out.println("✅ Registration Successful! You can now log in.");
        }
    }

    // Student Login
    public boolean loginStudent(String rollNumber, String stdPassword) {
        if (studentDatabase.containsKey(rollNumber)) {
            Student student = studentDatabase.get(rollNumber);
            if (student.getStdPassword().equals(stdPassword)) {
                System.out.println("🎉 Login Successful! Welcome, " + student.getStdName());
                return true;
            } else {
                System.out.println("❌ Incorrect Password!");
            }
        } else {
            System.out.println("❌ Student not found! Please register first.");
        }
        return false;
    }
}

public class StudentLoginApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLogin studentLogin = new StudentLogin();

        while (true) {
            System.out.println("\n📌 Student Login Application");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    studentLogin.registerStudent(rollNumber, name, email, password);
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    String loginRoll = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String loginPass = scanner.nextLine();
                    studentLogin.loginStudent(loginRoll, loginPass);
                    break;

                case 3:
                    System.out.println("🚀 Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        }
    }
}
