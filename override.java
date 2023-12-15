class Aniket{

    public Object run(){
        System.out.println("Aniket");
        return null;
    }
}

class Disha extends Aniket{
    
    public String run(){
        System.out.println("Disha");
        return null;
    }
}

class override{
    public static void main(String args[]){
       Aniket d=new Disha();
       d.run();
    }
}