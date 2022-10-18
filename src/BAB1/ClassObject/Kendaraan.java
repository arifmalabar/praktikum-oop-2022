/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.ClassObject;

/**
 *
 * @author ridho
 */
public class Kendaraan {
    public String nama;
    public String warna;
    public String merk;
 
    public int jmlRoda(int jml)
    {
        return jml;
    }
    public void kendaraanMaju()
    {
        System.out.println("Kendaraan berjalan maju");
    }
    public void kendaraanMundur()
    {
        System.out.println("Berjalan munduru");
    }
    public void kendaraanBerhenti()
    {
       System.out.println("Kendaraan Berhenti"); 
    }
}
