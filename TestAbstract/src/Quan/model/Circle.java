package Quan.model;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
abstract public class Circle extends AbstractShape {
    private double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filed){
        super(color, filed);
        this.radius = radius;
        dt = Math.PI*Math.pow((double)radius,2);
        cv = 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double dt;
    @Override
    public double getArea() {
        return this.dt;
    }
    double cv ;
    @Override
    public double getPerimeter() {
        return cv;
    }

    @Override
    public String toString() {
        return "circle[radius:" +radius+","+super.toString()+"] co chu vi,dien tich: "+cv+" "+dt;
    }
}
