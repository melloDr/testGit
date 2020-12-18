/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s1.p0055;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1S1P0055 {

    /**
     * @param args the command line arguments
     */
//    public int abc(int choice){
//        Scanner sc = new Scanner(System.in);
//                
//        boolean check = true;
//        while (check = true) {                
//                System.out.println("========= Doctor Management ==========");
//                System.out.println("1.	Add Doctor");
//                System.out.println("2.	Update Doctor");
//                System.out.println("3.	Delete Doctor");
//                System.out.println("4.	Search Doctor");
//                System.out.println("5.	Exit");
//                System.out.println("Your choice is: ");
//                choice = Integer.parseInt(sc.nextLine());
//                if (choice > 5) {
//                    check = false;
//                }
//                else{
//                    check = true;
//                    return choice;
//                }
//            }
//        return  choice;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        classSup cs = new classSup();
        boolean check = true;
        do {
//            System.out.println("========= Doctor Management ==========");
//                System.out.println("1.	Add Doctor");
//                System.out.println("2.	Update Doctor");
//                System.out.println("3.	Delete Doctor");
//                System.out.println("4.	Search Doctor");
//                System.out.println("5.	Exit");
//                System.out.println("Your choice is: ");
                choice = cs.abc(choice);
            
            switch (choice) {
                case 1:
                    cs.add();
                    break;
                case 2:
                    cs.update();
                    break;
                case 3:
                    cs.delete();
                    break;
                case 4:
                    cs.search();
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
