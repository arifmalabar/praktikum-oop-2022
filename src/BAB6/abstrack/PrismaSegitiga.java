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
public class PrismaSegitiga extends Segitiga {
    double vol, t;
    @Override
    double volume() {
        vol = (luas() * t);
        return vol;
    }
    
}
