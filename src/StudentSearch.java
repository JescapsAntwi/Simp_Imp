//import java.util.Arrays;
//import java.util.Scanner;
//
//class Student implements Comparable<Student> {
//    String firstName;
//    String lastName;
//    String id;
//    String grade;
//
//    public Student(String firstName, String lastName, String id, String grade) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.id = id;
//        this.grade = grade;
//    }
//
//    // Composite key comparison: lastName + id
//    @Override
//    public int compareTo(Student other) {
//        String key1 = this.lastName.toLowerCase() + this.id;
//        String key2 = other.lastName.toLowerCase() + other.id;
//        return key1.compareTo(key2);
//    }
//
//    @Override
//    public String toString() {
//        return firstName + " " + lastName + " | ID: " + id + " | Grade: " + grade;
//    }
//}
//
//public class StudentSearch {
//    public static void main(String[] args) {
//        Student[] students = {
//            new Student("John", "Doe", "1001", "A"),
//            new Student("Alice", "Smith", "1002", "B+"),
//            new Student("Bob", "Johnson", "1003", "A-"),
//            new Student("Grace", "Brown", "1004", "B"),
//            new Student("Eve", "Davis", "1005", "A+"),
//            new Student("Charlie", "Miller", "1006", "C+"),
//            new Student("David", "Wilson", "1007", "A"),
//            new Student("Faythe", "Moore", "1008", "B+"),
//            new Student("Heidi", "Taylor", "1009", "A-"),
//            new Student("Ivan", "Anderson", "1010", "A")
//        };
//
//        // Sort the array using Comparable
//        Arrays.sort(students);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter last name to search: ");
//        String searchLastName = scanner.nextLine();
//        System.out.print("Enter ID to search: ");
//        String searchId = scanner.nextLine();
//
//        Student key = new Student("", searchLastName, searchId, "");
//        int index = Arrays.binarySearch(students, key);
//
//        if (index >= 0) {
//            System.out.println("Student found:\n" + students[index]);
//        } else {
//            System.out.println("Student not found.");
//        }
//
//        scanner.close();
//    }
//}
