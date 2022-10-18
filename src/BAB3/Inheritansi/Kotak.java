/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritansi;


public class Kotak {
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    public Kotak()
    {
        panjang = lebar = tinggi = 0;
    }
    public Kotak(int p, int l, int t)
    {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public double hitungVolume()
    {
        double vol =0.0;
        vol = panjang * lebar * tinggi;
        return vol;
    }
}
