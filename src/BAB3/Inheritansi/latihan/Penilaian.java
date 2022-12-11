/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3.Inheritansi.latihan;

/**
 *
 * @author arif
 */
public class Penilaian {
    String nim, nama, kode_mk;
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
    double nilaiAkhirPrak()
    {
        return((this.nilaiTugas * 0.6)+(this.nilaiPrak * 0.4));
    }
    double tampilNa()
    {
        return nilaiAkhirPrak();
    }
    double nilaiAkhir()
    {
        return 0;
    }
}
