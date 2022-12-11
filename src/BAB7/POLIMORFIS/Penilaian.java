/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.POLIMORFIS;

/**
 *
 * @author ridho
 */
public abstract class Penilaian {
    String nim, kode_mk, nama;
    private int nilaiTugas, nilaiPrak;
    double nilaiAkhir;

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
        
    double nilaiAkhirPrak()
    {
        return ((getNilaiTugas() * 0.6)+(getNilaiPrak() * 0.4));
    }
    abstract double nilaiAkhir();
}
