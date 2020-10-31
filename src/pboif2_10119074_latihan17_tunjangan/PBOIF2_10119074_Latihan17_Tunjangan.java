/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan17_tunjangan;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskripsi : Menampilkan TUnjangan
 */
public class PBOIF2_10119074_Latihan17_Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char menikah;
       double gajipokok,tunjangan,totalgaji;
       
       menikah='Y';
        gajipokok = 6000000;
       tunjangan=(menikah=='Y')?0.35*gajipokok:0;
       totalgaji=gajipokok + tunjangan;
       
       System.out.println("==============PROGRAM TUNJANGAN==============");
       System.out.println("Berapa Gaji Pokok Anda Perbulan? : Rp.6000000");        
       System.out.println("Status Anda? (Menikah/Belum)     : Menikah");
       System.out.println();
       System.out.println("=========Hasil Perhitungan Gaji Anda=========");
       System.out.println("Gaji Pokok : " + gajipokok);
       System.out.println("Tunjangan  : " + tunjangan);       
       System.out.println("Total Gaji : " + totalgaji);     
       System.out.println("Depeloped by -Handrian Rivaldi");
    }
    
}
