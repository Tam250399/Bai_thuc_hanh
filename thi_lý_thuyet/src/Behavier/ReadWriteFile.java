package Behavier;

import Entities.ManageContacts;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ReadWriteFile {

        private static final String COMMA_DELIMITER = ",";
        private static final String NEW_LINE_SEPARATOR = "\n";
        private static final String FILE_HEADER = "Name,Phone Number,Address,Email,Facebook,Nickname";

        public static void writeToFileCsv(ArrayList<ManageContacts> manageContactsList, String pathFile) {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(pathFile);
                fileWriter.append(FILE_HEADER.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
                for (ManageContacts c : manageContactsList) {
                    fileWriter.append(String.valueOf(c.getName()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(String.valueOf(c.getTelephone()));
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(c.getAddress());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(c.getEmail());
                    fileWriter.append(COMMA_DELIMITER);
                    fileWriter.append(c.getFacebook());
                    fileWriter.append(COMMA_DELIMITER);

                }
                System.out.println("Done!!!");
            } catch (Exception e) {
                System.out.println("Error in CsvFileWriter !!!");
                e.printStackTrace();
            } finally {
                try {
                    assert fileWriter != null;
                    fileWriter.flush();
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while flushing/closing fileWriter !!!");
                    e.printStackTrace();
                }
            }
        }

        public static void readFromFileCsv(String pathFile) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(pathFile));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] cols = line.split(",");
                    if (cols[0].equals("Name")) {
                        System.out.println("Contacts: ");
                    } else System.out.println("Name: " + cols[0] + ", phone number: " + cols[1] +
                            ", address: " + cols[2] + ", email: " + cols[3] + ", facebook: " +
                            cols[4] + ", nickname: " + cols[5]);
                }
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }

        public static ArrayList<ManageContacts> readCSV(String pathFile){
            try {
                BufferedReader br = new BufferedReader(new FileReader(pathFile));
                String line;
                ArrayList<ManageContacts> contacts = new ArrayList<>();
                while ((line = br.readLine()) != null) {
                    String[] cols = line.split(",");
                    if (cols[0].equals("Name")){
}else {
                   ManageContacts c = new ManageContacts();
                    c.setName(cols[0]);
                    c.setTelephone(Integer.parseInt(cols[1]));
                    c.setAddress(cols[2]);
                    c.setEmail(cols[3]);
                    c.setFacebook(cols[4]);
                    contacts.add(c);
                }
            }
            return contacts;
        }catch (IOException io){
            io.printStackTrace();
        }
        return null;
    }};

