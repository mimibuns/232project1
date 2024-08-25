public class Person {
    String lastName;
    int age;

    //parameterised constructor
    Person (String lastName, int age){
        this.lastName = lastName;
        this.age = age;
    }

    //default constructor
    Person (){
        lastName = "unknown";
        age = 20;
    }

    // if their age is over 16 then their name will print
    public void drive(){
        //using the variables will decide the output
        if (age >= 16){
            System.out.println(lastName + " is old enough to drive");
        }
        else{
            System.out.println(lastName + " is not old enough to drive");
        }
    }

    public void military(int age){
        if (this.age >= 18){
            System.out.println(lastName + " is old enough to be in the military");
        }
        else{
            System.out.println(lastName + " is not old enough to be in the military");
        }
    }
}