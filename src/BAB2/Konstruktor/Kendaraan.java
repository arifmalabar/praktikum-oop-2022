/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.Konstruktor;

/**
 *
 * @author ridho
 */
public class Kendaraan {
    String nama, warna;
    int jml_roda;
    Kendaraan(String nama, String warna, int jml_roda)
    {
        this.nama = nama;
        this.warna = warna;
        this.jml_roda = jml_roda;
        
        System.out.println("Nama kendaraan  : "+this.nama);
        System.out.println("Warna Kendaraan : "+this.warna);
        System.out.println("Roda Kendaraan  : "+this.jml_roda);
    }   
}
class KendaraanMain{
    public static void main(String[]args){
        Kendaraan kendaraan = new Kendaraan("avanza", "merah", 4);
        Kendaraan honda = new Kendaraan("honda", "hijau", 2);
    }
}
