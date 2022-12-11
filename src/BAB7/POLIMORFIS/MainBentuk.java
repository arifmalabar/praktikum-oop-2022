/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.POLIMORFIS;

/**
 *
 * @author ridho
 */
public class MainBentuk {
    public static void main(String[]args){
        Bentuk shape;
        System.out.println("Penerapan POlimorfisme");
        shape = new Kubus();
        System.out.println("Volume kubus "+shape.volume());
        System.out.println("Luas Permukanaan Kubus "+shape.luasPermukaan());
        System.out.println("Warna Permuakaan Kubus "+shape.color(6121212));
        System.out.println("");
        shape = new Tabung();
        System.out.println("Volume Tabung "+shape.volume());
        System.out.println("Luas Permukanaan Tabung "+shape.luasPermukaan());
        System.out.println("Warna Permuakaan Tabung "+shape.color(6121212));
    }
}
