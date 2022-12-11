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
public class HRD extends Pegawai {

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
    
}
