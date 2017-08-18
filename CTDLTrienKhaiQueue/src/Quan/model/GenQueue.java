package Quan.model;

import java.util.LinkedList;

/**
 * Created by NguyenVanQuan on 8/14/2017.
 */
public class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<E>();
    public void enqueue(E item){
        list.addLast(item);
    }
    public E dequeue(){
        return list.poll();
    }
    public boolean hasItem(){
        return !list.isEmpty();
    }
    public int size(){
        return list.size();
    }
    public void addItem(GenQueue<? extends E> q){
        while (!hasItem()){
            list.addLast(q.dequeue());
        }
    }
}
