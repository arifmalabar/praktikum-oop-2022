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
public class limasSegitiga extends Segitiga {
    protected double t, vol;
    protected double volumeLimas()
    {
        vol = (luas() * t)/3;
        return vol;
    }
}
