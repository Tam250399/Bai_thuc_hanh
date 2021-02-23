package Entities;

public class ManageContacts {
    private String name;
    private int telephone;
    private String address;
    private String Email;
    private String facebook;

    public ManageContacts() {
    }

    public ManageContacts(String name, int telephone, String address, String email, String facebook) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        Email = email;
        this.facebook = facebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return
                "\n Name = " + name + '\'' +
                " \n Telephone =" + telephone +
                "\n address= " + address + '\'' +
                "\n Email =" + Email + '\'' +
                "\n facebook =" + facebook + '\'';

    }
};




