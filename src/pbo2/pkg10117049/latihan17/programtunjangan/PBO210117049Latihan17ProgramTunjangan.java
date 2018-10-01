/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi 
 * Nama : Gery Akbar Fauzi
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk memghitung berapa besar
 * tunjangan dan gajih total yang akan diterima
 */
public class PBO210117049Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        double tunjangan;
        String status;
        double totalGaji;

        Scanner scan = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajiPokok = scan.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum) ? : ");
        status = scan.next();

        System.out.println("=========Hasil Perhitungan Gaji==========");
        System.out.println("Gaji Pokok/t/t: " + gajiPokok);

        //tunjangan
        tunjangan = (status.equals("Menikah")) ? 0.35 * gajiPokok : 0;

        System.out.println("Tunjangan : Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total gaji : Rp. " + totalGaji);
        System.out.println("Developed By : Gery Akbar Fauzi");
    }

}
