/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfis_teori;

/**
 *
 * @author ridho
 */
public class Sales extends Pegawai {
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
    
}
