package Quan.model;

/**
 * Created by NguyenVanQuan on 8/1/2017.
 */
public class TestResizableCircle {
    public static void main(String[] args){
        Circle cir = new Circle(5.0);
        System.out.println(cir);
        System.out.println(cir.getArea());
        System.out.println(cir.getPerimeter());
        System.out.println(cir.getRadius());

        Circle cir1 = new ResizableCircle(6.0);
        System.out.println(cir1);
        System.out.println(cir1.getRadius());
        System.out.println(cir1.getPerimeter());
        System.out.println(cir1.getArea());


    }
}
