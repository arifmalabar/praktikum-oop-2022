/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author ridho
 */
public class LatException {
    public static void main(String[]args){
        int a= 0, b = 10, hasil;
        //if(a == 0) throw new ArithmeticException ("A tidak boleh bernilai 0");
        try{
            if(a == 0) throw new Exception ("A tidak boleh bernilai 0");
            hasil = b/a;
        } catch(Exception s){
            JOptionPane.showMessageDialog(null, s.getMessage());
        }
    }
}
