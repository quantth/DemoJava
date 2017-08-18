package Quan.model;

/**
 * Created by NguyenVanQuan on 8/1/2017.
 */
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public double recent(int percent) {
        return percent;
    }

    @Override
    public double getRadius() {
        return super.getRadius()*recent(10);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getArea() {
        return super.getArea()*recent(10);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter()*recent(10);
    }

    @Override
    public String toString() {
        return "Circle("+super.getRadius()+","+getRadius()+"): "+getArea()+" "+getPerimeter();
    }
}
