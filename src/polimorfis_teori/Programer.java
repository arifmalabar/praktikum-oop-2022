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
public class Programer extends Pegawai {
    int jmlHadir;

    public Programer(int jmlHadir) {
        this.jmlHadir = jmlHadir;
    }
    
    @Override
    double gajiTotal() {
        gajiTotal = gajiPokok + tunjangan + (jmlHadir * 25000);
        return gajiTotal;
    }

    @Override
    void tampil() {
        System.out.println(nama + " Bagian Programer");
    }
}
