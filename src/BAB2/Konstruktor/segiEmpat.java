/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.Konstruktor;

/**
 *
 * @author ridho
 */
public class segiEmpat {
    public int p;
    public int l;
    public int kel;
    public int luas;
    public String judul;
    
    segiEmpat()
    {
        this.p = 6;
        this.l = 2;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul() {
        this.judul = "Belajar Java";
    }
    
    public int hitLuas()
    {
        luas = p * l;
        return luas;
    }
    public int hitKeliling()
    {
        kel = 2 * (p * l);
        return kel;
    }
}
