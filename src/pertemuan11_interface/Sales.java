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
public class Sales extends Pegawai implements DapatPensiun{
    int jmlPenjualan;
    double uangResiko;

    public Sales(int jmlPenjualan) {
        this.jmlPenjualan = jmlPenjualan;
        uangResiko = 750000.00;
    }
    
    @Override
    double gajiTotal() {
        gajiTotal = (gajiPokok + tunjangan + (jmlPenjualan * 250))+uangResiko;
        return gajiTotal;
    }

    @Override
    void tampil() {
        System.out.println(nama + " Bagian Sales");
    }

    @Override
    public double potonganPensiun() {
        double potPensiun;
        potPensiun = 0.25 * gajiPokok;
        return potPensiun;
    }

    @Override
    public double potonganJHT() {
        double potJHT;
        potJHT = 0.25 * gajiPokok / 3;
        return potJHT;
    }

    @Override
    public double BPJSKesehatan() {
        double potBPJS;
        potBPJS = 120000;
        return potBPJS;
    }
    
}
