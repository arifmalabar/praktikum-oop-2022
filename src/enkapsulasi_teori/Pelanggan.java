/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi_teori;

/**
 *
 * @author ridho
 */
public class Pelanggan {
    private String kode_transaksi;
    private String input_user;
    private int jmlTransaksi;
    private double hasil;

    public Pelanggan() {
        this.kode_transaksi = "TR-Member";
        
    }   

    public void setInput_user(String input_user, int jmlTransaksi)
    {
        this.jmlTransaksi = jmlTransaksi;
        this.input_user = input_user;
        this.checkKodeTransaksi();
    }

    /*public void setInput_user(String input_user) {
    this.input_user = input_user;
    }*/
    public void setJmlTransaksi(int jmlTransaksi) {
        this.jmlTransaksi = jmlTransaksi;
    }

    private double checkKodeTransaksi() {
        if(this.input_user.equals(this.kode_transaksi))
        {
            this.hasil = this.jmlTransaksi - 0.15 * this.jmlTransaksi;
        } else {
            this.hasil = this.jmlTransaksi;
        }
        return hasil;
    }

    public double getHasil() {
        return hasil;
    }
    
}
