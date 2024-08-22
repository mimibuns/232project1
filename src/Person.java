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
        this.lastName = "unknown";
        this.age = 20;
    }

    // if their age is over 16 then their name will print
    public void drive(){
        //using the variables will decide the output
        if (this.age > 16){
            System.out.println(this.lastName);
        }
    }
}