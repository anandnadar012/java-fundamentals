package oop_basics;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public Vehicle() {
    }

    public void accelerate(int increment){
        speed += increment;
    }
    public void displayInfo(){
        System.out.println("Brand = " + brand);
        System.out.println("Speed = " + speed + "km/h");
    }
}
