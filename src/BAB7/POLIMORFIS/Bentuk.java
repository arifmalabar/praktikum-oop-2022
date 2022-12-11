/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.POLIMORFIS;

/**
 *
 * @author ridho
 */
public abstract class Bentuk {
    abstract double volume();
    abstract double luasPermukaan();
    int color(int a){
        return a;
    }
    int color(int a, int b)
    {
        return a+b;
    }
}
