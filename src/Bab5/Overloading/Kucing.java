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
public class Kucing extends Hewan {
    public Kucing()
    {
        super();
        System.out.println("Konstruktor Kelas Kucing");
    }
    @Override
    public void makan()
    {
        System.out.println("Hewan sedang makan");
    }
    @Override
    public void berkembangBiak()
    {
        System.out.println("kucing berkembang biak");
    }
    public void makan(String food)
    {
        System.out.println("Kucing makan = "+food);
    }
}
