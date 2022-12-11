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
public class dataSepatu2 extends dataSepatu1{
    private String kodePromo;
    private String input;
    private int hasilPromo;
    private String lokasiPengirim;
    
    @Override
    String cetakWarna() {
        String dataWarna = "";
        switch(this.warna){
            case 1:
                dataWarna = "Putih";
            break;
            case 2:
                dataWarna = "Hitam";
            break;
            case 3:
                dataWarna = "Hijau";
            break;
            case 4:
                dataWarna = "Merah";
            break;
        }
      return dataWarna;
    }
    @Override
    String cetakMerk() {
        String dataMerk = "";
        switch(this.merk){
            case 1:
                dataMerk = "Nike";
            break;
            case 2:
                dataMerk = "Adidas";
            break;
            case 3:
                dataMerk = "Rebook";
            break;
            case 4:
                dataMerk = "Puma";
            break;
        }
      return dataMerk;
    }
    @Override
    String cetakKategori() {
        String dataKategori = "";
        switch(this.kategori){
            case 1:
                dataKategori = "Sneakers";
            break;
            case 2:
                dataKategori = "Slip On";
            break;
        }
      return dataKategori;
    }
    @Override
    int cetakHarga() {
        switch(this.harga){
            case 1:
                harga = hargaNike;
            break;
            case 2:
                harga = hargaAdidas;
            break;
            case 3:
                harga = hargaRebook;
            break;
            case 4:
                harga = hargaPuma ;
            break;
        }
      return harga;
    }
    public dataSepatu2(){
        this.kodePromo = "KDPROMO";
    }
    public void setinput(String Input) {
        this.input = Input;
    }
    public int getHasilPromo() {
        return hasilPromo;
    }
    public int cekPromo(){
        if(kodePromo.compareTo(input) == 0){
            hasilPromo = cetakHarga()-50000;
        }
        else{
            hasilPromo = cetakHarga();   
        }
        return hasilPromo;
    }
    String getLokasiPengirim(){
        switch(this.lokasi){
            case 1:
                lokasiPengirim = "Dalam Negri";
            break;
            case 2:
                lokasiPengirim = "Luar Negri";
            break;
        }
      return lokasiPengirim;
    }    
    int cetakLokasi(){
        switch(this.lokasi){
            case 1:
                lokasi = dalamNegri;
            break;
            case 2:
                lokasi = luarNegri;
            break;
        }
      return lokasi;
    }
}
