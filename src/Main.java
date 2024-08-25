import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializes a new object with the corresponding variables
        Student s1 = new Student("Jenna", 15, "wang", 100);
        //using that object passes it to drive
        s1.drive();

        Student s2 = new Student();
        s2.military(s2.age);

        // array is made to hold students scores
        ArrayList<Integer> numbers = new ArrayList<>();

        String userName;
        int userScore;

        // loop to allow the teacher to enter multiple assignment scores
        while (true) {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please enter name or press enter to stop:");
            userName = scnr.nextLine();

            // ends code
            if (userName.isEmpty()) {
                break;
            }

            System.out.println("Please enter their score:");

            // code will stop if no int was put in
            if (scnr.hasNextInt()){
                userScore = scnr.nextInt();
            } else {
                System.out.println("Invalid input");
                break;
            }

            // inputs gets stored into array
            numbers.add(userScore);

            // created an instance of the class student
            //using the input, sees what grade they get
            Student StuOne = new Student(userName, userScore);
            StuOne.calcGrade(userName, userScore);
        }
        //gets average and displays it
        int average = Student.calcAverage(numbers);
        Student.calcGrade("Average is " + average, average);
    }
}