/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

/**
 *
 * @author ridho
 */
public class Hewan {
    String nafas = "Tidak bisa bernafas";
    String terbang = "Tidak bisa terbang";

    public void setNafas(String nafas) {
        this.nafas = nafas;
    }

    public void setTerbang(String terbang) {
        this.terbang = terbang;
    }
    public void tampil()
    {
        System.out.println("HEwan ini adalah hewan peiliharaan");
        System.out.println(nafas);
        System.out.println(terbang);
    }
}
