import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PracticalJava {
    private static Map<String, StudentRecord> studentsRecord = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enter new Student Record");
            System.out.println("2. Edit student record");
            System.out.println("3. Display student entry record");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    storeStudentRecord(scanner);
                    break;
                case 2:
                    editStudentRecord(scanner);
                    break;
                case 3:
                    DisplayInfo(scanner);
                    break;
                case 4:
                    exit(scanner);
                    break;
            }
        }

    }

    public static void storeStudentRecord(Scanner scanner) {
        System.out.println("Enter student number: ");
        String studentNumber = scanner.nextLine();
        if (!isValidStudentNumber(studentNumber)) {
            System.out.println("Please enter a valid student number in the format YYYY-XXXXXXXX.");
            studentNumber = scanner.nextLine();
        } else if (studentsRecord.containsKey(studentNumber)) {
            System.out.println("Student record already exists.");
            return;
        }
        System.out.println("Enter your Surname, Firstname, Middle initial: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter student age: ");
        int studentAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender(M for Male & F for Female): ");
        String studentGender = scanner.nextLine();
        if (!isValidGender(studentGender)) {
            System.out.println("Please enter a valid gender (M or F).");
            studentGender = scanner.nextLine();
        }
        System.out.println("Enter Program: ");
        String studentProgram = scanner.nextLine();
        System.out.println("Enter section: ");
        String studentSection = scanner.nextLine();

        StudentRecord studentRecord = new StudentRecord(studentNumber, studentName, studentAge, studentGender,
                studentProgram, studentSection);
        studentsRecord.put(studentNumber, studentRecord);

    }

    public static void editStudentRecord(Scanner scanner) {
        System.out.println("Enter student number: ");
        String studentNumber = scanner.nextLine();

        StudentRecord studentRecord = studentsRecord.get(studentNumber);
        if (studentRecord == null) {
            System.out.println("Student record not found.");
            return;
        }
        System.out.println("Choice which one you want to edit:\n 1. Student Number \n 2. Student Name \n 3. Student Age"
                + "\n 4. Student Gender \n 5. Student Program \n 6. Student Section \n Enter your choice: ");
        String choice = scanner.nextLine();
        try {
            switch (choice) {
                case "1":
                    System.out.println("Enter new student number: ");
                    studentRecord.setStudentNumber(scanner.nextLine());
                    break;
                case "2":
                    System.out.println("Enter new student name: ");
                    studentRecord.setStudentName(scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Enter new student age: ");
                    studentRecord.setStudentAge(Integer.parseInt(scanner.nextLine()));
                    break;
                case "4":
                    System.out.println("Enter new student gender: ");
                    studentRecord.setStudentGender(scanner.nextLine());
                    break;
                case "5":
                    System.out.println("Enter new student program: ");
                    studentRecord.setStudentProgram(scanner.nextLine());
                    break;
                case "6":
                    System.out.println("Enter new student section: ");
                    studentRecord.setStudentSection(scanner.nextLine());
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    public static void DisplayInfo(Scanner scanner) {
        System.out.println("Students entry: ");
        for (StudentRecord studentRecord : studentsRecord.values()) {
            System.out.println("Student Number: " + studentRecord.getStudentNumber());
            System.out.println("Student Name: " + studentRecord.getStudentName());
            System.out.println("Student Age: " + studentRecord.getStudentAge());
            System.out.println("Student Gender: " + studentRecord.getStudentGender());
            System.out.println("Student Program: " + studentRecord.getStudentProgram());
            System.out.println("Student Section: " + studentRecord.getStudentSection());
            System.out.println();
        }

    }

    public static void exit(Scanner scanner) {
        System.out.println("Exiting System...");
        System.exit(0);
    }

    private static class StudentRecord {
        private String studentNumber;
        private String studentName;
        private int studentAge;
        private String studentGender;
        private String studentProgram;
        private String studentSection;

        public StudentRecord(String studentNumber, String studentName, int studentAge, String studentGender,
                String studentProgram, String studentSection) {
            this.studentNumber = studentNumber;
            this.studentName = studentName;
            this.studentAge = studentAge;
            this.studentGender = studentGender;
            this.studentProgram = studentProgram;
            this.studentSection = studentSection;
        }

        // Getters and setters
        public String getStudentNumber() {
            return studentNumber;
        }

        public void setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public String getStudentGender() {
            return studentGender;
        }

        public void setStudentGender(String studentGender) {
            this.studentGender = studentGender;
        }

        public String getStudentProgram() {
            return studentProgram;
        }

        public void setStudentProgram(String studentProgram) {
            this.studentProgram = studentProgram;
        }

        public String getStudentSection() {
            return studentSection;
        }

        public void setStudentSection(String studentSection) {
            this.studentSection = studentSection;
        }
    }

    private static boolean isValidGender(String studentGender) {
        return studentGender.equalsIgnoreCase("M") || studentGender.equalsIgnoreCase("F");
    }

    private static boolean isValidStudentNumber(String studentNumber) {
        String pattern = "^\\d{4}-\\d{7}$";
        return studentNumber.matches(pattern);
    }

}