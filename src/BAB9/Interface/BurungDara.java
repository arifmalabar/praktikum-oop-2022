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
public class BurungDara extends Hewan implements Nafas, Terbang {

    @Override
    public void bernafas() {
        setNafas("Bisa bernafas");
    }

    @Override
    public void terbang() {
        setTerbang("Bisa terbang");
    }
    
}
