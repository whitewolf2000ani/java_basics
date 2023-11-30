class Test{
    int age;
    int count;
    String name;

    void check(){
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }

    void PrintName(){
        System.out.println("Name:"+name);
    }
}

class Check{
    public static void main(String args[]){
        Test ob=new Test();
        ob.age=20;
        ob.count=11;
        ob.name="Aniket";
        ob.check();
        ob.PrintName();
    }
}