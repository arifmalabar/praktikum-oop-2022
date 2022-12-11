/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_teori;

import java.util.Scanner;
/**
 *
 * @author ridho
 */
public class PersegiPanjang {
    int panjang, lebar, keliling,luas;

    public PersegiPanjang() {
        this.panjang = 10;
        this.lebar = 4;
    }
    
    int keliling()
    {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
    int luas()
    {
        luas = panjang * lebar;
        return luas;
    }
    public static void main(String[]args)
    {
        PersegiPanjang pp = new PersegiPanjang();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Masukan Panjang = ");
            pp.panjang = sc.nextInt();
            System.out.println("Masukan Lebar = ");
            pp.lebar = sc.nextInt();
            if(pp.lebar < 0 || pp.panjang < 0){
                //jika panjang dan lebar lebih kecil dari 0
                throw new Exception("Input Negatif");
            } else {
                System.out.println("Kelilling = "+pp.keliling());
                System.out.println("Luas = "+pp.luas());
            }
        } catch(Exception e){
            System.out.println("Terjadi kesalahan program = "+e);
        } finally{
            System.out.println("Program Selesai");
        }
    }
}
