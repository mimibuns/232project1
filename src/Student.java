import java.util.ArrayList;
//made student class that can inherit from the person class by using extends
public class Student extends Person{
    String firstName;
    String userName;
    int userScore;

    //parameterised constructor, input is assigned to a name
    Student(String firstName, int userScore, String lastName, int age ) {
        super(lastName, age);
        this.userScore = userScore;
        this.firstName = firstName;

    }

    Student(String userName, int userScore){
        this.userName = userName;
        this.userScore = userScore;
    }

    Student(){
        super("lastName", 50);
        userName = "mimi";
        firstName = "selena";
        userScore = 100;
        /*
        super(lastName, age);
        age = 40;
        lstName = "moses";
         */
    }

    //gets average
    public static int calcAverage(ArrayList<Integer> numbers){
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return sum / numbers.size();
    }

    // sees what grade they get
    public static void calcGrade(String name, int score) {
        if (score >= 90 && score <=100){
            System.out.println(name + " A");
        } else if (score >= 80 && score <=89) {
            System.out.println(name + " B");
        } else if (score >= 70 && score <=79) {
            System.out.println(name + " C");
        } else if (score >= 60 && score <=69) {
            System.out.println(name + " D");
        } else {
            System.out.println(name + " F");
        }
    }
}