//OOP (object orianted programming languge ) some basic concept of oop's


//you creat a class and diffine the which funcanllity
class OopConcept {


    //that creat a new varibles to call the funcation
    public int add(int a, int b){

        //to creat a function you want to use
        int r = a+ b;

        //And the return of the value of calculet your eqution
        return r;

    }
}

//creat a object that mains your code will be exquit that
public class add {

    public static void main(String[] args) {

        //Enter the first value of you want that
        int num1 = 4;

        //Enter the second value of you want that
        int num2 = 6;

        //call the class function
        OopConcept cal = new OopConcept();

        //Write a funcation to calculet what..
        int result = cal.add(num1,num2);

        //And print that you want a calculet value (that main's user input the value..)
        System.out.println(result);
    }
}
