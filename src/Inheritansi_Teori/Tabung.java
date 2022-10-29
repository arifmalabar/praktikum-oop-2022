/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritansi_Teori;


/**
 *
 * @author ridho
 */
public class Tabung extends Lingkaran {
    double t;
    double volume;
    public Tabung()
    {
        this.t = 10;
        this.r = 5;
    }
    double Volume()
    {
        this.volume = this.Luas() * this.t;
        return this.volume;
    }
}
