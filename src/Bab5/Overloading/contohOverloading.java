/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab5.Overloading;

/**
 *
 * @author ridho
 */
public class contohOverloading {
      public void jumlah (int a, int b){
        System.out.println("Jumlah 2 angka ="+ (a + b));
      } 
      //overloading perbedaan jumlah parameter
      public void jumlah (int a, int b, int c){
        System.out.println("Jumlah 3 angka =" + (a + b + c));
      } 
      //overloading perbedaan tipe data parameter
      public void jumlah (double a, int b){
        System.out.println("Jumlah 2 angka (double+int)= "+ (a + b));
      } 
      //overloading perbedaan urutan tipe data parameter
      public void jumlah (int b, double a){
        System.out.println("Jumlah 2 angka (int+double)= "+ (a + b));
      }
}
