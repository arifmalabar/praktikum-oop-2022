/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject.latihan;

/**
 *
 * @author arif
 */
public class Mahasiswa {
    String nim, nama, prodi, angkatan;
    void dataNim(String nim)
    {
        this.nim = nim;
    }
    void dataNama(String nama)
    {
        this.nama = nama;
    }
    void dataProdi(String prodi)
    {
        this.prodi = prodi;
    }
    void angkatan(String angkatan)
    {
        this.angkatan = angkatan;
    }
    String cetakNim()
    {
        return this.nim;
    }
    String cetakNama()
    {
        return this.nama;
    }
    String cetakProdi()
    {
        return this.prodi;
    }
    String cetakAngkatan()
    {
        return this.angkatan;
    }
}
