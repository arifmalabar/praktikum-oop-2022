/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfis_teori;

/**
 *
 * @author ridho
 */
public class MainPagawai {
    public static void main(String[] args)
    {
        Pegawai pgw;
        HRD ridho =new HRD(25);
        pgw = ridho;
       
        pgw.setID("12121212");
        pgw.setNama("Ridho Arif W");
        pgw.setAlamat("Rogonoto");
        pgw.setJudul(ridho);
        System.out.println("ID HRD "+pgw.getID());
        System.out.println("Nama : "+pgw.getNama());
        System.out.println("Alamat : "+pgw.getAlamat());
        System.out.println("gaji Pokok "+pgw.gajiPokok);
        System.out.println("Gaji total "+pgw.gajiTotal());
        pgw.tampil();System.out.println("\n");
     
        Manufacturing yogi = new Manufacturing(1000);
        pgw = yogi;
        pgw.setID("123455");
        pgw.setNama("Yogi");
        pgw.setAlamat("JL Kemirahan");   
        pgw.setJudul(yogi);
        System.out.println("ID Manufacturing "+pgw.getID());
        System.out.println("Nama : "+pgw.getNama());
        System.out.println("Alamat : "+pgw.getAlamat());
        System.out.println("gaji Pokok "+pgw.gajiPokok);
        System.out.println("Gaji total "+pgw.gajiTotal());
        pgw.tampil();System.out.println("\n");
        
        Sales bahrul = new Sales(1000);
        pgw = bahrul;
        pgw.setID("123455");
        pgw.setNama("Bahrul");
        pgw.setAlamat("JL Blimbingindah");
        pgw.setJudul(bahrul);
        System.out.println("ID Sales "+pgw.getID());
        System.out.println("Nama : "+pgw.getNama());
        System.out.println("Alamat : "+pgw.getAlamat());
        System.out.println("gaji Pokok "+pgw.gajiPokok);
        System.out.println("Gaji total "+pgw.gajiTotal());
        pgw.tampil();System.out.println("\n");
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
