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
public class B {
    public static void main(String[]args)
    {
        Balok bl = new Balok();
        bl.t = 10;
        System.out.println("as"+bl.volume());
    }
}
