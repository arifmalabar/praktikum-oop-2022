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
public class PenilaianNonPrak extends Penilaian {
    double nilaiAkhir()
    {
        return (getNilaiTugas());
    }
}
