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
public class BangunDatar {
    int p,l,ls;
    double pj, lb, luas;

    public BangunDatar() {
        this.p = 10;
        this.l= 4;
        this.pj = 10;
        this.lb = 4;
    }

    public BangunDatar(double pj, double lb) {
        this.pj = pj;
        this.lb = lb;
    }

    public BangunDatar(int p, int l) {
        this.p = p;
        this.l = l;
    }
    int luas()
    {
        ls = p * l;
        return ls;
    }
    int luas(int p, int l)
    {
        this.p = p;
        this.l = l;
        ls = this.p * this.l;
        return ls;
    }
    double luas(double lb, double pj)
    {
        this.lb  = lb;
        this.pj = pj;
        luas = this.lb * this.pj;
        return luas;
    }
}
