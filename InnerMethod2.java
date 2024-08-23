
//Method concept you can essyly read that

//Creat a an object to perform a basic rule
class  Method2{

    //creat a object just like a computer
    public void Computer(){
        System.out.println("payling music....");
    }


    //creat a an outer object to how can aproche that anouter person..
    public String getMePen(int cost){

        //Condition check to tre or fls
        if(cost >= 10){
        return "pen";
    }else{
        return "No! I have  no pen";
    }
    }

    //creat a anouter object
    public String getMeBook(int cost){

        if(cost >= 50){
        return "Your Book";
    }else{
        return "No one book here";
    }

}

        }


        //creat a main class to call the funcation to object varibles
    public class InnerMethod2{

    public static void main(String args[]){

        //call the funcation a method varibles and use that here funcanlity
        Method2 obj = new Method2();
        obj.Computer();

        //call the second method object
        String str = obj.getMePen(76);
        System.out.println(str);

        //and thied method
        String strs = obj.getMeBook(78);
        System.out.println(strs);
    }
}