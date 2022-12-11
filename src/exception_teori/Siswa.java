/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_teori;

import javax.swing.JOptionPane;

public class Siswa {
    private String nama[];
    private int nilai[];
    private int no;
    public Siswa() {
        nama = new String[5];
        nilai = new int[5];
        no = 0;
    }
    public void insertData(String nama, int nilai)
    {
        this.nama[no] = nama;
        this.nilai[no] = nilai;
        no = no +1;
    }

    public String getNama(int index) {
        return nama[index];
    }

    public int getNilai(int index) {
        return nilai[index];
    }

    public int getNo() {
        return no;
    }
    
    public double rataRata()
    {
        double rata;
        int total = 0;
        for(int i = 0; i < no; i++)
        {
            total = total + nilai[i];
        }
        rata = total / no;
        return rata;
    }
    public String minNilai()
    {
        int min = nilai[0];
        String nama_terendah = "";
        for(int i = 0; i < no; i++)
        {
            if(nilai[i] <= min)
            {
                min = nilai[i];
                nama_terendah = nama[i];
            }
        }
        return String.valueOf(min+" - "+nama_terendah);
    }
    public String maxNilai()
    {
        int max = nilai[0];
        String nama_tertinggi = "";
        for(int i = 0; i < no; i++)
        {
            if(nilai[i] >= max)
            {
                max = nilai[i];
                nama_tertinggi = nama[i];
            }
        }
        return String.valueOf(max+" - "+nama_tertinggi);
    }
}
