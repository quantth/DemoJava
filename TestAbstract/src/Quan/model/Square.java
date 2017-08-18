package Quan.model;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
public class Square extends Rectangle {
    public double side;
    public Square(){};
    public Square(double side){};
    public Square(double side, String color, boolean filled){
        super(color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square[side:"+side+"]"+super.toString();
    }
}
