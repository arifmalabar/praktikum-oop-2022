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
public class Segitiga {
    private double alas;
    public double tinggi, Luas;
    double Luas()
    {
        Luas = (getAlas() * tinggi)/2;
        return Luas;
    }
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }
    
}
