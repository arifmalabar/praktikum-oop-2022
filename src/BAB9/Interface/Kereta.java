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
public class Kereta implements Kendaraan {

    @Override
    public String nama() {
        return "Kereta Api gajayana";
    }

    @Override
    public int jumlah_roda() {
        return 8;
    }

    @Override
    public String lintasan() {
        return "rel";
    }
    
}
