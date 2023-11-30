class scope {
    int a;
    static int b;

    void add() {
        int c;
        c = a + b;
        System.out.println(c);
    }

    void mul() {
        int d;
        d = a * b;
        System.out.println(d);
    }

    public static void main(String args[]) {
        scope obj = new scope();
        obj.add();
        obj.mul();
        // Instance variables can be called only with object creation.
        obj.a = 1000;
        b = 2000;
        System.out.println(obj.a);
        System.out.println(b);
        scope obj1 = new scope();
        // when object is created memory is allocated for "a" in heap as its a instance
        // variable.
        System.out.println(obj1.a);
        // we get the earlier default that was intialized during the start of the
        // program.
        System.out.println(b);
        // changes show as varible is allocated memeory in static memory block, can be
        // called with or without object.
    }
}