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
public abstract class Bentuk {
    abstract double Luas();
    abstract double keliling();
    static String apa()
    {
        return "apa";
    }
    public static void main(String[]args)
    {
        System.out.println(apa());
    }
}
