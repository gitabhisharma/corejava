
//Conditional Statament :-

public class gerater {
    public static void main(String[] args) {
        
        //Enter the value of
        int x = 10;
        int y = 6;
        int z =9;

        //Check the Condition who gerater then
        if (x > y && x > z){
            System.out.println(x); //If x is gerater the y,z
        }else if (y > z && y > x){
                //print the value of y
                System.out.println(y);
            
        }else{
            //print the value of z
            System.out.println(z);
        }
    }
}
