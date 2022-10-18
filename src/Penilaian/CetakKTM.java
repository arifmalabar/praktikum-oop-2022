/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author ridho
 */
public class CetakKTM {
    public static void main(String[]args)
    {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNama("Ridho Arif");
        mhs.dataNim("2118055");
        mhs.dataProdi("Informatika");
        
        System.out.println("Nama  : "+mhs.cetakNama());
        System.out.println("Nim   : "+mhs.cetakNim());
        System.out.println("Prodi : "+mhs.cetakProdi());
    }
}
