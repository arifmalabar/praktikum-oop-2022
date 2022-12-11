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
public class HRD extends Pegawai implements DapatPensiun {

    int jmlHadir;

    public HRD(int jmlHadir) {
        this.jmlHadir = jmlHadir;
    }
    @Override
    double gajiTotal() {
       gajiTotal = gajiPokok + tunjangan + (jmlHadir * 45000);
       return gajiTotal;
    }

    @Override
    void tampil() {
        System.out.println(nama + " Bagigan HRD");
    }

    @Override
    public double potonganPensiun() {
        double potPensiun;
        potPensiun = 0.1 * gajiPokok;
        return potPensiun;
    }

    @Override
    public double potonganJHT() {
       double potJHT;
        potJHT = 0.1 * gajiPokok / 3;
        return potJHT;
    }

    @Override
    public double BPJSKesehatan() {
        double potBPJS;
        potBPJS = 60000;
        return potBPJS;
    }
    
}
