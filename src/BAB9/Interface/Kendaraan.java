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
public interface Kendaraan {
    String alat_penggerak = "";
    abstract String nama();
    abstract int jumlah_roda();
    abstract String lintasan();
}
