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
public class LimasSegitiga extends BangunDatar {
    double t, volume;
    @Override
    double luas(double lb, double pj)
    {
        this.lb  = lb;
        this.pj = pj;
        luas = (this.lb * this.pj) / 2;
        return luas;
    }
    double volume()
    {
        this.lb  = lb;
        this.pj = pj;
        volume = luas(lb, pj) * t / 3;
        return volume;
    }
}
