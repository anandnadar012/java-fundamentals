package oop_basics;

public abstract class Shape implements Drawable {
    protected String color;

    public Shape(String color){
        this.color = color;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public String getColor(){
        return color;
    }
    @Override
    public abstract void draw();
}
