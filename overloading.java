class Student{
    int count,age,multiple;

    int calculate(int c, int a){
        System.out.println("count:"+c+"age:"+a);
        return c;
    }

    long calculate(long c,long a){
        System.out.println("count:"+c+"age:"+a);
        return c;
    }
}

class overloading{

    public static void main(int a){
        System.out.println("age:"+a);
    }

    public static void main(String a){
        System.out.println("name"+a);
    }
    public static void main(String args[]){
        Student obj=new Student();
        int x= obj.calculate(4,5);
        int y=obj.calculate(2,3);
        main("aniket");
        main(89);
        System.out.println("x"+x+"y:"+y);
    }
}