/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingoveriding;

/**
 *
 * @author ridho
 */
public class Balok extends BangunDatar {
    double t, volume;
    
    
    double volume()
    {
        volume = luas(lb, pj) * t;
        return volume;
    }
}
