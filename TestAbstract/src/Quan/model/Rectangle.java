package Quan.model;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
abstract public class Rectangle extends AbstractShape {
    private double width, length;
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.width= width;
        this.length= length;
    }
    public Rectangle(String color, boolean filled){
        super(color, filled);

    }
    public  Rectangle(String color,boolean filled, double width, double length){
        super(color, filled);
        this.length=length;
        this.width=width;
        cv= 2*(width+length);
        dt = width*length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    };

    public void setLength(double length) {
        this.length = length;
    }
     double dt ;
    @Override
    public double getArea() {
        return dt;
    }
    double cv;
    @Override
    public double getPerimeter() {
        return cv;
    }

    @Override
    public String toString() {
        return "Rectangle[length:"+length+", width:"+width+","+super.toString()+"]"+"co cv,dt: "+cv+" "+dt;
    }

}
