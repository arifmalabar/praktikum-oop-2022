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
    public double t;
    public double volume;
    public Tabung()
    {
        this.t = 10;
        this.r = 5;
    }
    public double getVolume()
    {
        this.volume = this.getLuas() * this.t;
        return this.volume;
    }
}
