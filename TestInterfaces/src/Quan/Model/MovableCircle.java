package Quan.Model;

/**
 * Created by NguyenVanQuan on 7/31/2017.
 */
public class MovableCircle implements Movable  {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;

    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x += center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x -= center.xSpeed;
    }

    @Override
    public String toString() {
        return "("+center.x+","+center.y+","+center.xSpeed+","+center.ySpeed+","+radius+")";
    }
}
