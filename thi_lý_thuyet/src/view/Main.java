package view;

import Behavier.Managament;
import Entities.ManageContacts;
import view.Menus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Managament managament = new Managament();
        Scanner sc = new Scanner(System.in);
        do {
            try {
                ShowMenu();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        managament.display();
                        break;
                    case 2:
                        ManageContacts manageContacts = Menus.getInfor();
                        managament.add(manageContacts);
                        break;
                    case 3:
                        ManageContacts manageContacts1 = Menus.getInfor();
                        managament.uppdate(manageContacts1);
                        break;
                    case 4:
                        System.out.println("Nhập tên cần xóa :");
                        String name1 = sc.nextLine();
                        managament.delete(name1);
                        break;
                    case 5:
                        System.out.println("Nhập tên để tìm kiếm :");
                        String name2 = sc.nextLine();
                        managament.Search(name2);
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.exit(1);
                        break;
                    default:
                        System.err.println("Error");

                }
            }catch (Exception e ){
                System.err.println("Bạn đã chọn sai!!");
            }
        }while (true);
    }
    static void ShowMenu (){
        System.out.println("-------------------------Quản lý danh sách----------------------");
        System.out.println("1: xem danh sách");
        System.out.println("2 : thêm mới ");
        System.out.println("3 : cập nhật");
        System.out.println("4 : xóa");
        System.out.println("5 : tìm kiếm ");
        System.out.println("6 : đọc từ file");
        System.out.println("7 : ghi vào file");
        System.out.println("8 : thoát");
        System.out.println("Chọn chức năng :");
    }
}
