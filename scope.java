class A{
    int a=10;
    static int b=56;
    void add(){
        int c=0;
        c=a+b;
        System.out.println(c);
        a=90;
    }
    void mul(){
        int d=1;
        d=a*b;
        System.out.println(d);
        b=66;
    }
    public static void main(String args[]){
        A obj=new A();
        obj.add();
        obj.mul();
        System.out.println(obj.a);
        System.out.println(b);
    }
}