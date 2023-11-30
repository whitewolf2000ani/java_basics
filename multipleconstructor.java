class Test{
    int marks,age;
    double rate;

    Test(int m,int a,double r){
        marks=m;
        age=a;
        rate=r;
    }

    Test(int m,int a){
        marks=m;
        age=a;
    }

    Test(Test obj){
        marks=obj.marks;
        age=obj.age;
        rate=obj.rate;
    }

     void display1(){
        System.out.println("marks:"+marks+"\t"+"age:"+age+"\t"+"rate:"+rate);
    }

    void display2(){
        System.out.println("marks:"+marks+"\t"+"age:"+age);
    }



}

class multipleconstructor{
    public static void main(String args[]){
        Test obj1=new Test(10,20,45.0);
        obj1.display1();
        Test obj2=new Test(19,40);
        obj2.display2();
        Test obj3=new Test(obj1);
        obj3.display1();


    }
}