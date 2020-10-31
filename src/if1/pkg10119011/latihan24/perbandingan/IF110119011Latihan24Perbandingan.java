/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan24.perbandingan;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Nilai1;
        int Nilai2;
        String ulangi;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukan nilai pertama : ");
            Nilai1 = sc.nextInt();
            System.out.print("Masukan nilai kedua : ");
            Nilai2 = sc.nextInt();
            
            System.out.print("Hasil : ");
                if (Nilai1 > Nilai2) {
                    System.out.println("Nilai " + Nilai1 + " Lebih besar dari " + Nilai2);
                    } else if (Nilai2 > Nilai1) {
                        System.out.println("Nilai " + Nilai2 + " Lebih besar dari " + Nilai1);
                    } else if (Nilai1 == Nilai2) {
                        System.out.println("Nilai " + Nilai1 + " sama dengan " + Nilai2);
                    }
        System.out.println("Ulangi aktifitas anda (Ya/Tidak) : ");
        ulangi = sc.next();
        } while (ulangi.equals("Ya"));
        
    }
    
}
