package Behavier;

import Entities.ManageContacts;

import java.util.ArrayList;
import java.util.List;

public class Managament {
    List<ManageContacts> manageContacts = new ArrayList<>();

    public void add (ManageContacts manageContacts1){
        manageContacts.add(manageContacts1);
    }

    public void uppdate(ManageContacts manageContacts1){
        for (ManageContacts MC: manageContacts) {
            System.out.println("Bạn đã uppdate " + manageContacts1.getClass().getSimpleName() + " Thành công :)");
            if(MC.getName().equals(manageContacts1.getName())){
                MC.setAddress(manageContacts1.getAddress());
                MC.setEmail(manageContacts1.getEmail());
                MC.setTelephone(manageContacts1.getTelephone());
                MC.setFacebook(manageContacts1.getFacebook());
            }
        }
    }
    public void delete(String name){
        manageContacts.removeIf(manageContacts1 -> manageContacts1.getName().equals(name));
    }


    public void Search(String name){
        boolean found = false;
        for (ManageContacts manageContacts1: manageContacts) {
            if(manageContacts1.getName().equals(name)){
                System.out.println(manageContacts1.toString());
                found = true;
                break;
            }
        }
        if(!found){
            System.err.println("không tìm thấy người trong danh bạ ");
        }
    }


    public void display(){
        for (ManageContacts manageContacts1: manageContacts) {
            System.out.println("-----------------ShowContact-------------------");
            System.out.println("Bạn đã thêm " + manageContacts1.getClass().getSimpleName() + " Thành công :)");
            System.out.println(manageContacts1.toString());
        }
    }
}
