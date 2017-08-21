package Quan.main;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by NguyenVanQuan on 8/20/2017.
 */
public class HashmapDemo {
    public static void main(String[] args){
        HashMap<String, Double> student = new HashMap<String, Double>();
        student.put("m1", 2.5);
        student.put("m2", 3.5);
        student.put("m3", 4.5);
        student.put("m4", 5.5);

        System.out.println("Values: ");

        for (Double val: student.values()){
            System.out.println(val);
        }
        System.out.println("=========================================");

       Double getStr = student.get("m2");
        System.out.println(getStr);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        student.remove("m3");
        System.out.println("Sau khi remove: ");
        for (Double ds: student.values()) {
            System.out.println(ds);
        }

        System.out.println("-----------------------------------------");
        Set set = student.entrySet();
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            Map.Entry me = (Map.Entry)iter.next();
            System.out.print(me.getKey());
            System.out.println(" : " + me.getValue());
        }


    }
}
