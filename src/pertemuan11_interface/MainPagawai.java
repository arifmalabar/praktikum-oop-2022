/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan11_interface;

import polimorfis_teori.*;

/**
 *
 * @author ridho
 */
public class MainPagawai {
    public static void main(String[] args)
    {
        Pegawai ridho; //polimor
        ridho = new HRD(26);
        ridho.setNama("Yuda");
        ridho.setGajiPokok(1000);
        ridho.setTunjangan(100000);
        System.out.println("ID HRD "+ridho.getID());
        System.out.println("Nama : "+ridho.getNama());
        System.out.println("Alamat : "+ridho.getAlamat());
        System.out.println("gaji Pokok "+ridho.gajiPokok);
        System.out.println("Gaji total "+ridho.gajiTotal());
        ridho.tampil();
        System.out.println("==========================================");
        HRD ridho2 = (HRD) ridho; //downcasting dari ridho bertipe kelas induk(Pegawai) ke rifdho2 bertipe kelas anak(HRD)
        System.out.println("Potongan pensiun = "+ridho2.potonganPensiun());
        System.out.println("Pootongan BPJS = "+ridho2.BPJSKesehatan());
        System.out.println("Potongan JHT = "+ridho2.potonganJHT());
        ridho = new Manufacturing(100);
        System.out.println("==========================================");
        ridho = new Sales(100);
        ridho.setNama("Yuda");
        ridho.setGajiPokok(1000);
        ridho.setTunjangan(100000);
        System.out.println("ID Sales "+ridho.getID());
        System.out.println("Nama : "+ridho.getNama());
        System.out.println("Alamat : "+ridho.getAlamat());
        System.out.println("gaji Pokok "+ridho.gajiPokok);
        System.out.println("Gaji total "+ridho.gajiTotal());
        ridho.tampil();
        Sales ridho3 = (Sales) ridho; //downcasting dari ridho bertipe kelas induk(Pegawai) ke rifdho2 bertipe kelas anak(HRD)
        System.out.println("Potongan pensiun = "+ridho3.potonganPensiun());
        System.out.println("Pootongan BPJS = "+ridho3.BPJSKesehatan());
        System.out.println("Potongan JHT = "+ridho3.potonganJHT());
        /*HRD anang = new HRD(26);
        anang.setID("123455");
        anang.setNama("Anang");
        anang.setAlamat("JL Blimbingindah");
        System.out.println("ID HRD "+anang.getID());
        System.out.println("Nama : "+anang.getNama());
        System.out.println("Alamat : "+anang.getAlamat());
        System.out.println("gaji Pokok "+anang.gajiPokok);
        System.out.println("Gaji total "+anang.gajiTotal());
        anang.tampil();
        Manufacturing ridho = new Manufacturing(1000);
        ridho.setID("123455");
        ridho.setNama("Ridho");
        ridho.setAlamat("JL Blimbingindah");
        System.out.println("ID Manufacturing "+ridho.getID());
        System.out.println("Nama : "+ridho.getNama());
        System.out.println("Alamat : "+ridho.getAlamat());
        System.out.println("gaji Pokok "+ridho.gajiPokok);
        System.out.println("Gaji total "+ridho.gajiTotal());
        ridho.tampil();*/
    }
}
