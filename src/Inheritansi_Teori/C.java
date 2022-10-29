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
public class C {
     public static void main(String[]args){
        Lingkaran lk = new Lingkaran();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jari-jari ");
        lk.r = sc.nextInt();
        System.out.println("Luas = "+lk.Luas());
        System.out.println("Keliling = "+lk.Keliling());
    }
}
