package Quan.model;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

/**
 * Created by NguyenVanQuan on 7/29/2017.
 */
  abstract public class AbstractShape {
    private String color;
    private boolean filled;
    public AbstractShape(){};
    public AbstractShape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    @Override
    public String toString() {
        return "Shape[" +color+","+filled+"]";
    }
}
