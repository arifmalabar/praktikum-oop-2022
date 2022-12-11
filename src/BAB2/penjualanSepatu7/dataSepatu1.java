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
public abstract class dataSepatu1 {
    int ukuran, kategori, merk, harga, hargaSup, warna, warnaSup, ongkir, proteksi, lokasi, jumlah;
    int hargaNike, hargaAdidas, hargaRebook, hargaPuma, dalamNegri, luarNegri;
   
    abstract String cetakWarna(); 
    abstract String cetakMerk();
    abstract String cetakKategori();
    abstract int cetakHarga();
    
    public dataSepatu1(int Merk, int Ukuran, int Warna, int Kategori, int Harga, int Ongkir, int Proteksi, int Lokasi){
        this.merk = Merk;
        this.warna = Warna;
        this.ukuran = Ukuran;
        this.kategori = Kategori;
        this.harga = Harga ;
        this.ongkir = Ongkir;
        this.proteksi = Proteksi;
        this.lokasi = Lokasi;
    }    
    public dataSepatu1(){
        hargaNike = 5000000;
        hargaAdidas = 5990000;
        hargaRebook = 2900000;
        hargaPuma = 3000000;
        dalamNegri = 200000;
        luarNegri = 400000;
    }
    int cetakUkuran(){
        return ukuran;
    }
}
