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
public class Latihan {
    public int bagi() throws ArithmeticException{
        return 10/0;
    }
    
    public void method2(int a){
        try{
            bagi();
        } catch(ArithmeticException s){
            JOptionPane.showMessageDialog(null, "embagian 0");
        }
        
    }
}
