/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritansi_Teori;

import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class Lingkaran {
    double phi;
    double r;
    double luas;
    double keliling;
    
    public Lingkaran()
    {
        this.phi = 3.14;
        this.r = 5;
    }
    double Luas()
    {
        this.luas = this.phi * this.r * this.r;
        return this.luas;
    }
    double Keliling()
    {
        this.keliling =  2 * this.phi * this.r;
        return this.keliling;
    }
}