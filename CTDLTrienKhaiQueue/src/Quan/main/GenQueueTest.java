package Quan.main;

import Quan.model.Employee;
import Quan.model.GenQueue;
import Quan.model.HourlyEmployee;

/**
 * Created by NguyenVanQuan on 8/14/2017.
 */
public class GenQueueTest {
    public static void main(String[] args){
        GenQueue<Employee> emlist = new GenQueue<Employee>();
        GenQueue<HourlyEmployee> hlist = new GenQueue<HourlyEmployee>();
        hlist.enqueue(new HourlyEmployee("T", "D"));
        hlist.enqueue(new HourlyEmployee("G", "V"));
        hlist.enqueue(new HourlyEmployee("R", "K"));
        emlist.addItem(hlist);
        System.out.println("The employees' names are:");
        while (emlist.hasItem()){
            Employee emp = emlist.dequeue();
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }
}
