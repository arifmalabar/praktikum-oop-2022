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
public class Segitiga {
    protected double alas, tinggi, luas;
    
    protected double luas()
    {
        luas = 0.5 * (alas * tinggi);
        return luas;
    }
}
