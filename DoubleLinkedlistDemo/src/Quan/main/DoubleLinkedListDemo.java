package Quan.main;

import javax.swing.*;

/**
 * Created by NguyenVanQuan on 8/23/2017.
 */
public class DoubleLinkedListDemo {
    static class Node{
        protected int value;
        protected Node next, previous;
        public Node(){
            next = null;
            previous = null;
            value=0;
        }
        public Node(int value, Node next, Node previous ){
            this.value=value;
            this.next = next;
            this.previous = previous;
        }
        public void displayNode(){
            System.out.print(value+ " ");
        }
    }
    static class DoubleLinkedList{
        protected Node first, last;
        protected int size;
        public DoubleLinkedList(){
            first = null;
            last = null;
            size = 0;
        }
         public void addFirst(int value){
            Node node = new Node(value,null, null);
            if (first == null){
                first = node;
                last = first;
                return;
            }
            else {
                 first.previous = node;
                 node.next=first;
                 first =node;
             }
             size++;
             System.out.println();

         }
         public void addLast(int value) {
             Node node = new Node(value, null, null);
             if (first == null) {
                 first = node;
                 last = first;
                 return;
             } else {
                 node.previous = last;
                 last.next = node;
                 node.previous = last;
                 last = node;
             }
             size++;
             System.out.println();
         }
         public Node deleteFirst(){
             System.out.println();
             if (size == 0){
                 System.out.println("Do not delete anything");
                 return null;
             }
             else {
                 Node node = first;
                 first = first.next;
                 first.previous = null;
                 size--;
                 return node;
             }
         }
         public Node deleteLast(){
             System.out.println();
             if (size == 0){
                 System.out.println("Do not delete anything");
                 return null;
             }
             else {
                 Node node = last;
                 last = last.previous;
                 last.next = null;
                 size--;
                 return node;
             }
         }
         public void displayDoubleLinkedList(){
             Node node = first;
             while (node!= null){
                 node.displayNode();
                 node = node.next;
             }
         }
    }
    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        while (true){
            String numStr = JOptionPane.showInputDialog("1.Add First:"+"\n2.Add Last:"+"\n3.Delete First:"+"\n4.Delete Last:"
            +"\n5.Display"+"\n6.Exit");
            int num = Integer.parseInt(numStr);
            switch (num){
                case 1:
                    String addFirstStr = JOptionPane.showInputDialog("enter number you want to addfirst:");
                    int addFirst = Integer.parseInt(addFirstStr);
                    list.addFirst(addFirst);
                    break;
                case 2:
                    String addLastStr = JOptionPane.showInputDialog("enter number you want to addlast:");
                    int addLast = Integer.parseInt(addLastStr);
                    list.addLast(addLast);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.displayDoubleLinkedList();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
