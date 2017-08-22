package Quan.main;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by NguyenVanQuan on 8/22/2017.
 */
public class StackDemo {
    static Stack st = new Stack();
    static void showpush(Stack st , int a){
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("Stack: "+st);
    }
    static void showpop(Stack st){
        System.out.print("pop->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st);
    }
    static void menu(){
        String numStr = JOptionPane.showInputDialog("\n1.push"+"\n2.pop"+"\n3.Exit");
        int num = Integer.parseInt(numStr);
        switch (num){
            case 1:
                String kStr = JOptionPane.showInputDialog("Enter number you want to push");
                int k = Integer.parseInt(kStr);
                showpush(st,k);
                break;
            case 2:
                showpop(st);
                break;
            case 3:
                System.exit(0);
            default:
                break;
        }

    }
    public static void main(String[] args){
        while (true){
            menu();
        }
    }


}
