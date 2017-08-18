package Quan.model;

import java.io.Serializable;

/**
 * Created by NguyenVanQuan on 7/25/2017.
 */
public class Customer implements Serializable, Comparable<Customer> {
    private String id;
    private String name;
    private String phone;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public String getId() {
        return id;
    }
    public Customer(){
        super();
    }
    public Customer(String id, String name, String phone){
        this.id=id;
        this.name=name;
        this.phone=phone;
    }
    @Override
    public String toString() {
        return this.id + "\t\t" +this.name+ "\t\t" +this.phone;
    }

    @Override
    public int compareTo(Customer o) {
        return this.phone.compareToIgnoreCase(o.phone);
    }
}
