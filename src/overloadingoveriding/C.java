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
public class C {
    public static void main(String[]args)
    {
        LimasSegitiga lm = new LimasSegitiga();
        lm.t = 10;
        System.out.println("Volume limas : "+lm.volume());
    }
}
