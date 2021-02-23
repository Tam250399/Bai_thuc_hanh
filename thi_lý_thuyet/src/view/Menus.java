package view;

import Behavier.Managament;
import Entities.ManageContacts;

import java.util.Scanner;

public class Menus {
    ManageContacts manageContacts = new ManageContacts();
    static Scanner sc = new Scanner(System.in);
    public static ManageContacts getInfor(){
        System.out.println("Nhập tên :");
        String name = sc.nextLine();
        System.out.println("Nhập số điện thoại :");
        int telephone = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ :");
        String address = sc.nextLine();
        System.out.println("Nhập email :");
        String email = sc.nextLine();
        System.out.println("Nhập facebook :");
        String face = sc.nextLine();
        return new ManageContacts(name, telephone , address, email , face);
    }


}
