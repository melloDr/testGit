/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s1.p0055;

import java.io.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class classSup {

    Scanner sc = new Scanner(System.in);
    ArrayList<doctor> list = new ArrayList();

    public void add() {
        String code, name, spec;
        int avai = 0;
        int pos = 0;
        boolean valid = true;
        System.out.println("--------- Add Doctor ----------");
        do {
            System.out.println("Enter Code: ");
            code = sc.nextLine().toUpperCase();
            pos = findCode(code);
            valid = code.matches("^DOC\\d{2}$");
            if (pos >= 0) {
                System.err.println("The code is duplicated");
                pos = findCode(code);
            }
            if (!valid) {
                System.out.println("The code about DOC and 2 integer!");
            }
        } while (pos >= 0 || (!valid));

        System.out.println("Enter Name: ");
        name = sc.nextLine().toUpperCase();
        System.out.println("Enter Specialization: ");
        spec = sc.nextLine().toUpperCase();
        avai = getAvai(avai);
        list.add(new doctor(code, name, spec, avai));
        for (doctor object : list) {
            System.out.println("---------------------------------");
            object.print();
        }
    }

    int getAvai(int avai) {
        boolean check = true;
        while (check = true) {
            try {
                System.out.println("Enter Availability: ");
                avai = Integer.parseInt(sc.nextLine());
                if (avai > 0) {
                    check = true;
                    return avai;
                } else {
                    System.err.println("Availability must be positive!");
                    check = false;
                }
            } catch (Exception e) {
                System.err.println("Availability must be Integer!");
            }
        }
        return avai;
    }

    public int findCode(String code) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public void update() {
        String code;
        System.out.println("Enter Code: ");
        code = sc.nextLine().toUpperCase();
        int pos = findCode(code);
        if (pos < 0) {
            System.err.println("Doctor not exist! ");
        } else {
            String oldName = list.get(pos).getName();
            String oldSpec = list.get(pos).getSpec();
            int oldAvai = list.get(pos).getAvai();
            String newName, newSpec;
            int newAvai = 0;
            System.out.println("Old name: " + oldName + ", update new name: ");
            newName = sc.nextLine().toUpperCase();
            System.out.println("Old Specialization: " + oldSpec + ", update new specialization: ");
            newSpec = sc.nextLine().toUpperCase();
            newAvai = getAvai(newAvai);
            list.get(pos).setName(newName);
            list.get(pos).setSpec(newSpec);
            list.get(pos).setAvai(newAvai);
            System.out.println("Doctor have been update");
            for (doctor object : list) {
                System.out.println("---------------------------------");
                object.print();
            }

        }
    }

    public void delete() {
        String code;
        System.out.println("Enter code: ");
        code = sc.nextLine().toUpperCase();
        int pos = findCode(code);
        if (pos < 0) {
            System.err.println("Doctor's code not exist! ");
            for (doctor object : list) {
                object.print();
            }
        } else {
            list.remove(pos);
            System.out.println("Doctor has been deleted");
        }
        for (doctor object : list) {
            System.out.println("----------------");
            object.print();
        }
    }

    public int searchDoctorByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public void search() {
        int pos;
        String name;
        if (list.isEmpty()) {
            return;
        } else {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            pos = searchDoctorByName(name);
            if (pos >= 0) {
                list.get(pos).print();
            } else {
                System.out.println("Not found");
            }
        }
    }

    public int abc(int choice) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check = true) {
            try {
                System.out.println("========= Doctor Management ==========");
                System.out.println("1.	Add Doctor");
                System.out.println("2.	Update Doctor");
                System.out.println("3.	Delete Doctor");
                System.out.println("4.	Search Doctor");
                System.out.println("5.	Exit");
                System.out.println("Your choice is: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 5 || choice < 0) {
                    check = false;
                } else {
                    check = true;
                    return choice;
                }
            } catch (Exception e) {
                System.err.println("Vui lòng Nhập đúng!");
            }

        }
        return choice;
    }
}
