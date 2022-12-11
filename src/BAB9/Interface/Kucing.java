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
public class Kucing extends Hewan implements Nafas, Terbang {

    @Override
    public void bernafas() {
        System.out.println("Hewan Bernafas");
    }

    @Override
    public void terbang() {
        System.out.println("Hewan Tidak Bisa Terbang");
    }
    
}
