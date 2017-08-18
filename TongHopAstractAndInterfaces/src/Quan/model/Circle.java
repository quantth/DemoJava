package Quan.model;

/**
 * Created by NguyenVanQuan on 8/1/2017.
 */
public class Circle implements GeometricObject{
    private double radius;
    public double perimeter;
    public double area;
    public Circle(double radius){
        this.radius = radius;
        perimeter = 2*Math.PI*radius;
        area = Math.PI*Math.pow((double)radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle("+radius+"): "+area+" "+perimeter;
    }
}
