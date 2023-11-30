class UsingStaticMethod{
    int age;
    static String name="IITM";

    static void change(){
        name="TINT";
    }

    void display(){
        System.out.println("Name:"+name+"\t"+"Age:"+age);

    }

}
class USM{
    public static void main(String args[]){
        UsingStaticMethod obj=new UsingStaticMethod();
        obj.age=19;
        obj.display();
        UsingStaticMethod.change();
        obj.display();
    }
}