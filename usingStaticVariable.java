class Student {
    String name;
    static String college = "Tint";
    int age;

    Student(int a, String Nm) {
        name = Nm;
        age = a;
    }

    void print() {
        System.out.println("Name:" + name + "\n" + "Age:" + age + "\n" + "College:" + college);
    }
}

class Test {

    public static void main(String args[]) {
        Student obj = new Student(22, "Aniket");
        obj.print();
    }
}