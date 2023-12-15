abstract class Director{
    void meeting(){
        System.out.println("Director");
    }

    abstract void meet();
}

abstract class HOD extends Director{
    
    abstract void meet();

}

class Student extends HOD{
    void meet(){
        System.out.println("met in student ");
    }
    public static void main(String args[]){
        Student s=new Student();
        s.meet();
        s.meeting();
    }
}
