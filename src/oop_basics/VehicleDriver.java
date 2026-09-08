package oop_basics;

public class VehicleDriver {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Yamaha",60);
        Car c1 = new Car("Toyota" , 80 , 4);

        c1.accelerate(20);
        c1.displayInfo();
        c1.honk();

        v1.displayInfo();
    }
}
