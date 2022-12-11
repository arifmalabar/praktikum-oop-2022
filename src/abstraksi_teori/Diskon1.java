/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraksi_teori;

import javax.swing.JOptionPane;

/**
 *
 * @author ridho
 */
public class Diskon1 extends Member{

    public Diskon1() {
        setKodeTransaksi("GOOO1");
    }

    @Override
    double hasil() {
        return getHasil();
    }

    @Override
    void cekKdTransaksi() {
        if(getUserInput().compareTo(getKodeTransaksi()) == 0){
            setHasil(getJmlTransaksi() - (0.8 * getJmlTransaksi()));
        } else {
            setHasil(getJmlTransaksi());
        }
    }

    @Override
    void setInputUser(String userInput, int jmlTransaksi) {
        setUserInput(userInput);
        setJmlTransaksi(jmlTransaksi);
        cekKdTransaksi();
    }
    
}
