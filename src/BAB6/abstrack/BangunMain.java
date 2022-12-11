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
public class BangunMain {
    public static void main(String[]args)
    {
        System.out.println("LUAS dan keliling");
        LayangLayang ly = new LayangLayang();
        System.out.println("Luas layang "+ly.Luas());
        System.out.println("Keliling "+ly.keliling());
        JajarGenjang jr = new JajarGenjang();
        System.out.println("Luas jajar "+jr.Luas());
        System.out.println("Keliling "+jr.keliling());
    }
}
