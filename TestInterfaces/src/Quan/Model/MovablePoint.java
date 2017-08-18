package Quan.Model;

/**
 * Created by NguyenVanQuan on 7/31/2017.
 */
public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y-=ySpeed;
    }

    @Override
    public void moveDown() {
        y+=ySpeed;
    }

    @Override
    public void moveLeft() {
        x+=xSpeed;
    }

    @Override
    public void moveRight() {
        x-=xSpeed;
    }

    @Override
    public String toString() {
        return "("+x+","+y+","+xSpeed+","+ySpeed+")";
    }
}
