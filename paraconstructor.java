class Student {
    int maths, bio, physics;
    int bonus=100;
    double average;

    Student(int m, int b, int p) {
        maths = m;
        bio = b;
        physics = p;
    }

    void averageCalculation( Student obj2) {
        average = (maths + bio + physics ) / 3;
        obj2.bonus = obj2.bonus / 2;
        System.out.println("From average calculation method:" + average + "bonus marks sent:" + obj2.bonus);
    }
    
    void display(){
        System.out.println("Bonus"+bonus);
    }

}

class paraconstructor {
    public static void main(String args[]) {
        Student obj1 = new Student(98, 99, 100);
        System.out.println("bonus marks after student 1 before:" + obj1.bonus);
        obj1.averageCalculation(obj1);
        System.out.println("bonus marks after student 1 after:" + obj1.bonus);
         Student obj2 = new Student(93, 99, 100);
         obj2.display();
    }

}