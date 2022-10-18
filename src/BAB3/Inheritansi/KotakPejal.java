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
public class KotakPejal extends Kotak {
    private double berat;
    KotakPejal(int p, int l, int t,int b)
    {
        super(p, l, t);
        berat = b;
    }
    public double getBerat()
    {
        return berat;
    }
}
class MainKotak {
    public static void main(String[]args){
        KotakPejal k = new KotakPejal(6, 5, 4, 2);
        System.out.println("Volume k :"+k.hitungVolume());
        System.out.println("berat k : "+k.getBerat());
    }
}
