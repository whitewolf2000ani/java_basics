import java.util.Scanner;
class MyException extends Exception{
  MyException(){
    super("There is a error");
  }
  MyException(String message){
    super(message);
  }
}

class M{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age");
        int age=s.nextInt();
        try{
            if(age>18){
                throw new MyException();
            }
            else{
                System.out.println("you can vote");
            }
        }

        catch(MyException e){
            System.out.println(e);
        }
        
    }



}