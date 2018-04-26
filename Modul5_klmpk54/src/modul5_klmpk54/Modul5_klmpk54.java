/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5_klmpk54;

import modul5.Student;

/**
 *
 * @author Mulazi
 */
public class Modul5_klmpk54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        footer a = new footer();
        Student one =  new Student();
        System.out.println("\n");
        Student two = new Student("CUCUCUCUPIDA", "21120117130046", "SMA Semarang");
        System.out.println(two.intro());
        System.out.println(two.tellGPA(4));//Pilihan Prodi
        System.out.println(two.tellAddress());
        System.out.println ("\n");
        Student three = new Student("Mulazi", "21120117120013", "Man Binjai");
        System.out.println(three.intro());
        System.out.println(three.tellGPA(4));//Pilihan Prodi
        System.out.println(three.tellAddress());
        System.out.println("\n");
        footer1 ab = new footer1();
     
        
        
    }
    
}
