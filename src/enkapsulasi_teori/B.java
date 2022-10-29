/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_teori;

import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class B {
    public static void main(String[]args)
    {
        int jmlTransaksi;
        String kodeTransaksi;
        Pelanggan pl = new Pelanggan();
        //System.out.println("Kode transaksi = "+pl.kode_transaksi);
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah transaksi ");
        jmlTransaksi = sc.nextInt();
        System.out.println("Masukan Kode Transaksi ");
        kodeTransaksi = sc.next();
        pl.setInput_user(kodeTransaksi, jmlTransaksi);
        System.out.println("Hasil = "+pl.getHasil());
    }
}
