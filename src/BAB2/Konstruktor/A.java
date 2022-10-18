/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.Konstruktor;

/**
 *
 * @author ridho
 */
public class A {
    public static void main(String[]args)
    {
        segiEmpat pp = new segiEmpat();
        pp.setJudul();
        System.out.println(pp.getJudul());
        System.out.println("Panjang : "+pp.p);
        System.out.println("Lebar : "+pp.l);
        System.out.println("Luas : "+pp.hitLuas());
        System.out.println("Keliling: "+pp.hitKeliling());
    }
}
