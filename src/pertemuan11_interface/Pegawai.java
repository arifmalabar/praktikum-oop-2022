/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11_interface;

import polimorfis_teori.*;

/**
 *
 * @author ridho
 */
abstract public class Pegawai {
    String ID, nama, alamat;
    double gajiPokok, tunjangan, gajiTotal;

    public Pegawai() {
        this.gajiPokok = 2500000.00;
        this.tunjangan = 750000.00;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    void setJudul(HRD obj)
    {
        System.out.println("DEPARTEMEN HRD");
        System.out.println("Nama Karyawan : "+nama);
    }
    void setJudul(Manufacturing obj)
    {
        System.out.println("DEPARTEMEN Manufaturing");
        System.out.println("Nama Karyawan : "+nama);
    }
    void setJudul(Sales obj)
    {
        System.out.println("DEPARTEMEN Sales");
        System.out.println("Nama Karyawan : "+nama);
    }
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    abstract double gajiTotal();
    abstract void tampil();
}
