class Aniket{

    void run(){
        System.out.println("Aniket");
    }
}

class Disha extends Aniket{
    void run(){
        System.out.println("Disha");
    }
}

class override{
    public static void main(String args[]){
        Aniket a=new Aniket();
        a.run();
    }
}