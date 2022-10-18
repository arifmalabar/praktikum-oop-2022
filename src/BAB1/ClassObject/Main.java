/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject;

/**
 *
 * @author ridho
 */
public class Main {
    public static void main(String[]args)
    {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "mobil";
        mobil.merk = "avanza";
        mobil.warna = "merah";
        System.out.println("Nama kendaraan  : "+mobil.nama);
        System.out.println("Merk Kendaraaan : "+mobil.merk);
        System.out.println("Warna kendaraan : "+mobil.warna);
        System.out.println("Jumlah roda     : "+mobil.jmlRoda(4));
        
        System.out.println();
        System.out.println("Cara mobil bergerak:");
        System.out.print("Saat maju : ");mobil.kendaraanMaju();
        System.out.print("Saat mundur: ");mobil.kendaraanMundur();
        System.out.print("Mobil berhenti: ");mobil.kendaraanBerhenti();
            
    }
}
