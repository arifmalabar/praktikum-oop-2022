/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

import Inheritansi_Teori.D;

/**
 *
 * @author ridho
 */
public class MainKelas {
    public static void main(String[] args) {
       Segitiga segitiga = new Segitiga();
       segitiga.tinggi = 5;
       //segitiga.alas = 2;
       segitiga.setAlas(2.0);
       System.out.println("Luas "+Double.toString(segitiga.Luas()));
        
    }
}
