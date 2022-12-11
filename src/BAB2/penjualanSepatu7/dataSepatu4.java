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
public class dataSepatu4 extends dataSepatu1{
    int brand, kategoriSup;
    int Nike, Adidas, Rebook, Puma;
      
    public dataSepatu4(){
        Nike = 200000;
        Adidas = 300000;
        Rebook = 200000;
        Puma = 300000;
    }
    @Override
    String cetakMerk() {
        String dataMerk = "";
        switch(this.brand){
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
        switch(this.kategoriSup){
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
        switch(this.hargaSup){
            case 1:
                hargaSup = Nike;
            break;
            case 2:
                hargaSup = Adidas;
            break;
            case 3:
                hargaSup = Rebook;
            break;
            case 4:
                hargaSup = Puma;
            break;
        }
      return hargaSup;
    }
    int jmlSup() {
        this.jumlah = cetakHarga()*jumlah;
        return jumlah;
    }
    @Override
    String cetakWarna() {
        String dataWarna = "";
        switch(this.warnaSup){
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

}
