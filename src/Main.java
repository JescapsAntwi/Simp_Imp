//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Asking for user input
        //use compareTo method and comparable
        //arrays.sort()


        ArrayList<Student> pupils = new ArrayList<>();
        //ArrayList.sort(pupils);
        Collections.sort(pupils);

        Scanner userInput = new Scanner(System.in);
        //Get user input


        //using a for loop to get 10 user inputs
        for (int i=0; i<2; i++)  {
            System.out.println("Enter your firstname below: ");
            String firstname = userInput.next();
            System.out.println("Enter your lastname below: ");
            String lastname = userInput.next();
            System.out.println("Enter your course grade: ");
            String grade = userInput.next();
            System.out.println("Enter your id number: ");
            int id = userInput.nextInt();

            pupils.add(new Student(firstname, lastname, id, grade));
        }
        System.out.println("These are the details of the students " + pupils);

        userInput.close();
    }

    //Binary Search function to find student last name and ID
    public static
}







//Write a java program that stores the details of at least 10 students like their name, ID, and overall course grade(e.g. A+)
//and finds the student details with the given last name and ID using binary search.