/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Interface;

/**
 *
 * @author ridho
 */
public class Main {
    public static void main(String[]args)
    {
        BurungDara bd = new BurungDara();
        bd.bernafas();
        bd.terbang();
        bd.tampil();
        System.out.println("=======================");
        Kucing kc = new Kucing();
        kc.tampil();
        kc.bernafas();
        kc.terbang();
    }
}
