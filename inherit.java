class Vehicle{
    String type;

    void mileage(){
        System.out.println("depends on vehicle");
    }
}
class Car extends Vehicle{
    int wheel;
    String company;

    void totalMiles(){
        System.out.println("A lot if miles");
    }
}

class Bike extends Vehicle{
    int suspension;
    String Biketype;

    void topSpeed(){
        System.out.println("super fast if its a sports bike");
    }
}

class Pulsar extends Bike{
    int Pulsarsuspension;
    String topraftar;

    void Pulsarspeed(){
        System.out.println("super slow");
    }
}

class Hayabusa extends Bike{
    int speed;

    void Topvelocity(){
        System.out.println("hello");
    }
}

class inherit{
    public static void main(String args[]){
        Car cr=new Car();
        Pulsar pr=new Pulsar();
        Hayabusa hb=new Hayabusa();
        cr.mileage();
        pr.topSpeed();
        pr.Pulsarspeed();
        hb.Topvelocity();
        System.out.println(pr instanceof Vehicle);
        System.out.println(hb instanceof Bike);


    }


}
