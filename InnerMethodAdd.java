
//Method funcation used that to add a two numbers

class MethodAdd {

    //Here is the type of varible
    public int Calculets(int n1, int n2){

        //basicaliy return type is the return a value who can calculet that once first
        return n1 + n2;

    }
}

public class InnerMethodAdd {

    public static void main(String args[]){

        //call the funcation to use a method funcation
    MethodAdd obj = new MethodAdd();
    int r = obj.Calculets(4, 8);

     //and print the value of r and return the value
    System.err.println(r);

}
}