package Quan.main;

import javax.swing.*;
import java.util.LinkedList;

/**
 * Created by NguyenVanQuan on 8/22/2017.
 */
public class QueueDemo {
    static class QueueDSLK{
       LinkedList list = new LinkedList();
        public void push(int val){
            list.pushList(val);
        }
        public void pop(){
            list.popList();
        }
        public void displayQueue(){
            System.out.println("Queue:");
            list.displayLinkList();
        }
    }
    static class node{
        public int value;
        public node next;

        public node(int value){
            this.value = value;
        }
        public void displayNode(){
            System.out.println(value + " ");
        }

    }
    static class LinkedList {
        private node firstValue;

        public LinkedList() {
            firstValue = null;
        }

        public void pushList(int value) {
            node newNode = new node(value);
            if (firstValue == null) {
                firstValue = newNode;
                return;
            }
            node valNode = firstValue;
            while (valNode.next != null) {
                valNode = valNode.next;
            }
            valNode.next = newNode;
        }

        public node popList() {
            if (firstValue == null) {
                System.out.println("LinkList is empty");
                return null;
            } else {
                node valNode = firstValue;
                firstValue = firstValue.next;
                return valNode;
            }
        }
        public void displayLinkList(){
            node disList = firstValue;
            while (disList!=null){
                disList.displayNode();
                disList = disList.next;
            }
            System.out.println();

        }
    }
    public static void main(String[] args){
        QueueDSLK que = new QueueDSLK();
       /* 
        que.push(11);
        que.displayQueue();
        que.push(12);
        que.displayQueue();
        que.push(13);
        que.displayQueue();
        que.push(14);

      
        que.pop();
        que.displayQueue();
        que.pop();
        que.displayQueue();
        que.pop();
        que.displayQueue();*/
       while (true){
           String numStr = JOptionPane.showInputDialog("1.Push:"+"\n2.Pop:"+"\n3.Díplay"+"\n4.exit:");
           int num = Integer.parseInt(numStr);
           switch (num){
               case 1:
                   String pushStr = JOptionPane.showInputDialog("enter number you want to push:");
                   int push = Integer.parseInt(pushStr);
                   que.push(push);
                   break;
               case 2:
                   que.pop();
                   break;
               case 3:
                   que.displayQueue();
               case 4:
                   System.exit(0);
                   break;
               default:
                   break;
           }
       }
    }
}
