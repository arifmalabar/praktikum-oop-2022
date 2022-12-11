/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraksi_teori;

/**
 *
 * @author ridho
 */
public abstract class Member {
    private String kodeTransaksi;
    private String userInput;
    private double jmlTransaksi;
    private double hasil;
    abstract double hasil();
    abstract void cekKdTransaksi();
    abstract void setInputUser(String userInput, int jmlTransaksi);

    public String getKodeTransaksi() {
        return kodeTransaksi;
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public double getJmlTransaksi() {
        return jmlTransaksi;
    }

    public void setJmlTransaksi(int jmlTransaksi) {
        this.jmlTransaksi = jmlTransaksi;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
    
}
