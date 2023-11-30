class Student {
    String name;
    static String college = "Tint";
    int age;

    Student(int a, String Nm, String coll) {
        name = Nm;
        age = a;
        college = coll;
    }

    void Print() {
        System.out.println("Name:" + name + "\n" + "Age:" + age + "\n" + "College:" + college);
    }
}

class Test {

    public static void main(String args[]) {
        Student obj = new Student(22, "Aniket", "IITMadras");
        obj.Print();
    }
}