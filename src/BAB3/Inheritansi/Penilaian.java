/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritansi;

/**
 *
 * @author ridho
 */
public class Penilaian {
    protected String NIM, kode_mk, nama;
    private int nilaiTugas, nilaiPrak;

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public int getNilaiPrak() {
        return nilaiPrak;
    }

    public void setNilaiPrak(int nilaiPrak) {
        this.nilaiPrak = nilaiPrak;
    }
    public double nilaiAkhirPrak()
    {
        return ((nilaiTugas * 0.6)+(nilaiPrak*0.4));
    }
    public double tampilNA()
    {
        return nilaiAkhirPrak();
    }
    public double nilaiAkhir()
    {
        return 0;
    }
}
