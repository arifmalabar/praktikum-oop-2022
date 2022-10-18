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
public class Lingkaran {
    int r;
    double phi, luas;
    public Lingkaran()
    {
        r = 7;
        phi = 3.14;
    }
    void deskripsi()
    {
        System.out.println("Ini adalah hasil menghtung ");
    }
    double luas()
    {
        luas = (phi * r * r);
        return luas;
    }
}
