package Quan.test;

import Quan.io.SerializableFileFactory;
import Quan.model.Customer;
import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by NguyenVanQuan on 7/25/2017.
 */
public class TestCustomer {
    static ArrayList<Customer>listOfCustomer = new ArrayList<Customer>();
    public static void menu() {
        String menuStr;
        menuStr = JOptionPane.showInputDialog(
            "1.Nhập khách hàng"+
            "\n2.Xuất khách hàng" +
            "\n3.Tìm kiếm khách hàng" +
            "\n4.Sắp xếp khách hàng" +
            "\n5.Lưu khách hàng" +
            "\n6.Đọc khách hàng" +
            "\n7.Thống kê nhà mạng" +
            "\n8.Thoát" +
            "\nChọn tác vụ [1..8]");
        int enter = 0;
        enter = Integer.parseInt(menuStr);
                switch (enter) {
            case 1:
                xuLyNhap();
                break;
            case 2:
                xuLyXuat();
                break;
            case 3:
                xuLyTimKiem();
                break;
            case 4:
                xuLySapXep();
                break;
            case 5:
                xuLyLuu();
                break;
            case 6:
                xuLyDoc();
                break;
            case 7:
                xuLyThongKe();
                break;
            case 8:
                xuLyThoat();
                break;
            default:
                break;
        }
    }
        private static void xuLyNhap(){
            Customer cus =new Customer();
            String id = JOptionPane.showInputDialog("Enter customer ID:");
            String name = JOptionPane.showInputDialog("Enter customer Name:");
            String phone = JOptionPane.showInputDialog("Enter customer Phone:");

            cus.setId(id);
            cus.setName(name);
            cus.setPhone(phone);

            listOfCustomer.add(cus);

        }
        private static void xuLyXuat(){
            System.out.println("ID\t\t\tName\t\t\tPhone");
            for (Customer cus: listOfCustomer){
                System.out.println(cus);
            }
        }
        private static void xuLyTimKiem(){
            String searchcontent = JOptionPane.showInputDialog("Enter what to look for:");

            System.out.println("ID\t\t\tName\t\t\tPhone");
            for (Customer cus: listOfCustomer){
                while (searchcontent != null){
                if (cus.getPhone().startsWith(searchcontent)){
                    System.out.println(cus);
                }
                else if (cus.getName().startsWith(searchcontent)){
                    System.out.println(cus);
                }
                else if (cus.getId().startsWith(searchcontent)){
                    System.out.println(cus);
                }
                else {
                    System.out.println("Do not see search content!");
                }
                break;
            }
            }


        }
        private static void xuLySapXep(){

            Collections.sort(listOfCustomer);
        }
        private static void xuLyLuu(){
            boolean result = SerializableFileFactory.saveFile(listOfCustomer,"d:\\customerData.db");
            if (result == true){
                System.out.println("Save file successfully!");
            }
            else {
                System.out.println("Save file failed!");
            }
        }
        private static void xuLyDoc(){
            listOfCustomer = SerializableFileFactory.readTheFile("d:\\customerData.db");
            System.out.println("Read file successfully!");
        }
        private static void xuLyThongKe(){
            int statistics = 0;
            String statisticsStr = JOptionPane.showInputDialog("Import content would like the statistics!");
            for (Customer cus: listOfCustomer){

                while (statisticsStr != null){
                    if (cus.getId().startsWith(statisticsStr)){
                        statistics++;
                    }
                    else if (cus.getName().startsWith(statisticsStr)){
                        statistics++;
                    }
                    else if (cus.getPhone().startsWith(statisticsStr)) {
                        statistics++;
                    }
                    break;
                }
            }
            System.out.println("Có " + statistics + " thuộc nội dung tìm kiếm " + statisticsStr);
        }
        private static void xuLyThoat(){
            System.exit(0);
        }
    public static void main (String[] args){
        while (true){
            menu();
        }

    }
}
