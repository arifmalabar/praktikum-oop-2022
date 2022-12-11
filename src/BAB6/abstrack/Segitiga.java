/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.abstrack;

/**
 *
 * @author ridho
 */
public abstract class Segitiga {
    double alas, tinggi, luas;
    double luas()
    {
        luas = 0.5 * (alas * tinggi);
        return luas;
    }
    abstract double volume();
}
