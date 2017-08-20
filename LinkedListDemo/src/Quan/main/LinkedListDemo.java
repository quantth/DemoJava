package Quan.main;

import java.util.LinkedList;

/**
 * Created by NguyenVanQuan on 8/20/2017.
 */
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Q");
        list.add("U");
        list.add("A");
        list.add("N");
        System.out.println("List: "+ list);

        list.addFirst("o");
        list.addLast("Wo");
        list.add(2,"y");
        System.out.println("List: "+ list);

        list.remove("y");
        list.remove(2);
        System.out.println("List: " +list);
        list.removeFirst();
        list.removeLast();
        System.out.println("list: " +list);

        Object val = list.get(1);
        list.set(1, val + " depzai");
        System.out.println("list: " + list);


    }
}
