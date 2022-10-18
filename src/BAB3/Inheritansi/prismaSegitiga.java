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
public class prismaSegitiga extends Segitiga {
    double t, vol;
    double volumePrisma()
    {
        vol = (luas()*t);
        return vol;
    }
}
