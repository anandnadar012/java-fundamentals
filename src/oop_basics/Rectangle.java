package oop_basics;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(String color, double length, double breadth){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * ( length + breadth);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle of " + length + "x" + breadth);
    }
}
