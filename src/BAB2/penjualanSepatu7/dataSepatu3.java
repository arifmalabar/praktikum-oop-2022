/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanSepatu7;

/**
 *
 * @author ACER
 */
public abstract class dataSepatu3 {
    String merk, warna, kategori;
    int ukuran, harga, jumlah;
    
    abstract String merkSup();
    abstract String dataWarna(String Warna);
    abstract int dataUkuran(int Ukuran);
    abstract String dataKategori(String Kategori);
    abstract String kategoriSup();
    abstract int dataHarga(int Harga);
    abstract int hargaSup();
    abstract int jmlSup();
}
