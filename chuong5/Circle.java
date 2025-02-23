package chuong5;

class Circle {
    private double radius;
    private String color;

  
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

  
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

  
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

  
    public double getArea() {
        return Math.PI * radius * radius;
    }
}


class Cylinder {
    private Circle base; 
    private double height;

    
    public Cylinder() {
        base = new Circle(); 
        height = 1.0;
    }

   
    public Cylinder(double radius, String color, double height) {
        base = new Circle(radius, color);
        this.height = height;
    }

   
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

 
    public double getVolume() {
        return base.getArea() * height;
    }
}


public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.5, "blue", 5.0);
        System.out.println("Cylinder base radius: " + cylinder.getBase().getRadius());
        System.out.println("Cylinder base color: " + cylinder.getBase().getColor());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
    }
}
