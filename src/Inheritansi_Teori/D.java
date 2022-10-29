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
public class D {
    protected String tes;
    public static void main(String[]args)
    {
        Tabung tb = new Tabung();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan jari jari = ");
        tb.r = sc.nextDouble();
        System.out.println("Masukan tinggi = ");
        tb.t = sc.nextInt();
        System.out.println("Masukan volume = "+tb.Volume());
        
    }
}
