
//Method concept you can essyly read that




//I can't solev this problem so i have no idea to solve that......?
class  Method2(){

    public void Computer(){
        System.out.println("payling music....");
    }

    public String getMePen(int cost){
        if(cost >= 12){
        return "pen";
    }else{
        return "No! I have  no pen";
    }
    }

    public String getMeBook(int cost){

        if(cost >= 50){
        return "Your Book";
    }else{
        return "No one book here";
    }

}

        }

    public void concept(){

    public static void main(String args[]){

        Method2 obj = new Method2();
        obj.Computer();

        String str = obj.getMePen(6);
        System.out.println(str);

        String strs = obj.getMeBook(78);
        System.out.println(strs);
    }
}