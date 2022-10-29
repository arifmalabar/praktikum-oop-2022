/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author ridho
 */
public class Penilaian {
    public String nim; 
    public String nama;
    public String kode_mk;
    private int nilaiTugas;
    private int nilaiPrak;

    public int getNilaiTugas() {
        return nilaiTugas;
    }
    private double NilaiAkhirPrak()
    {
        return ((nilaiTugas * 0.6)+(nilaiPrak *0.4));
    }
    double tampilNa()
    {
        return NilaiAkhirPrak();
    }
    double nilaiAkhir()
    {
        return 0;
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
    
}
