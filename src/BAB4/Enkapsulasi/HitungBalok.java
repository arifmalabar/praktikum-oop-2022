/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author ridho
 */
public class HitungBalok {
    private int panjang;
    public int lebar;
    public int tinggi;
    double volume;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public double volumeBalok()
    {
        this.volume = this.panjang * this.tinggi * this.lebar;
        return this.volume;
    }
}
