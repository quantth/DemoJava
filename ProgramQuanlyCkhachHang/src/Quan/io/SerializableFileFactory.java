package Quan.io;

import Quan.model.Customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by NguyenVanQuan on 7/25/2017.
 */
public class SerializableFileFactory {
    public static boolean saveFile(ArrayList<Customer>listOFCustomer, String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listOFCustomer);
            oos.close();
            fos.close();
            return true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Customer>readTheFile(String path){
        ArrayList<Customer>listOfCustomer = new ArrayList<Customer>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object data = ois.readObject();
            listOfCustomer = (ArrayList<Customer>) data;
            ois.close();
            fis.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return listOfCustomer;
    }
}
