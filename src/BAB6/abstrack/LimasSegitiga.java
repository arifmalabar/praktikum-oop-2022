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
public class LimasSegitiga extends Segitiga {
    double t, vol;

    @Override
    double volume() {
        vol = (luas() * t)/3;
        return vol;
    }
    
}
