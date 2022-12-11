/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi.latihan;

/**
 *
 * @author arif
 */
public class Penilaian {
    String kode_mk, NIM, nama;
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
    private double nilaiAkhirPrak()
    {
        return ((nilaiTugas * 0.6)+(nilaiPrak * 0.4));
    }
    double tampilNA()
    {
        return nilaiAkhirPrak();
    }
    double nilaiAkhir()
    {
        return 0;
    }
}
