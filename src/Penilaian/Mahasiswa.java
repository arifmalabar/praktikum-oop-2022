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
public class Mahasiswa {
    String nim, nama, prodi;
    void dataNim(String nim)
    {
        this.nim = nim;
    } 
    void dataProdi(String prodi)
    {
        this.prodi = prodi;
    }
    void dataNama(String nama)
    {
        this.nama = nama;
    }
    String cetakNim()
    {
        return nim;
    }
    String cetakNama()
    {
        return nama;
    }
    String cetakProdi()
    {
        return prodi;
    }
}
