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
public class Manufacturing extends Pegawai {
    int jmlProduksi;

    public Manufacturing(int jmlProduksi) {
        this.jmlProduksi = jmlProduksi;
    }
    
    @Override
    double gajiTotal() {
        gajiTotal = (gajiPokok + tunjangan + (jmlProduksi * 1500)+(0.10 * gajiPokok));
        return gajiTotal;
    }

    @Override
    void tampil() {
        System.out.println(nama + " bagian manufacturing");
    }
}
