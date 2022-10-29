/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author ridho
 */
public class MainLogin {
    public static void main(String[]args)
    {
        Login log = new Login();
        log.setUsername("Ridho");
        log.setPassword("Admin123");
        System.out.println("Username : "+log.getUsername());
        System.out.println("Password : "+log.getPassword());
    }
}
