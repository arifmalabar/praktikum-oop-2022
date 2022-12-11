/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_teori;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class Latihan2 {
    int bil1, bil2, hasil;
    String nama[] = new String[3];

    public Latihan2() {
        this.bil1 = 10;
        this.bil2 = 2;
        nama[0] = "Ridho";
        nama[1] = "Bahrul";
        nama[2] = "Toni";
    }
    
    double pembagian()
    {
        hasil = bil1 / bil2;
        return hasil;
    }
    public static void main(String[]args)
    {
        Latihan1 lt = new Latihan1();
        Scanner sc = new Scanner(System.in);  
        System.out.println("Siswa ke 1 = "+lt.nama[0]);
        System.out.println("Siswa ke 1 = "+lt.nama[1]);
        System.out.println("Siswa ke 1 = "+lt.nama[2]);
        
        try{
            System.out.println("Masukan nama Siswa ke 4 = ");
            lt.nama[3] = sc.next();
            System.out.print("Masukan Bilangan Pertama = ");
            lt.bil1 = sc.nextInt();
            System.out.print("Masukan Bilangan Kedua = ");
            lt.bil2 = sc.nextInt();
            System.out.println("Hasil pembagian : "+lt.pembagian());
            System.out.println("Siswa ke 1 = "+lt.nama[3]);
        } catch(Exception s){
            System.out.println("Terjadi Kesalahan");
            System.out.println(s);
        } finally{
            System.out.println("Program diakhiri terimakasih");
        }
    }
}
