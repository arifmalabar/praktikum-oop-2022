/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritansi;

/**
 *
 * @author ridho
 */
public class Tabung extends Lingkaran {
    int t;
    double volume;
    public Tabung()
    {
        t = 20;
    }
    void Keterangan()
    {
        deskripsi();
        System.out.println("Mengitung volume tabung");
    }
    double volume()
    {
        volume = (luas()*t);
        return volume;
    }
}
class mainLingkaran{
    public static void main(String[]args){
        Lingkaran lkr = new Lingkaran();
        lkr.deskripsi();
        Tabung tb = new Tabung();
        tb.Keterangan();
        System.out.println("Volume adalah : "+tb.volume());
    }
}