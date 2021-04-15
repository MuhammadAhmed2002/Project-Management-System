/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver.pkg8;

import javax.swing.UIManager;

/**
 *
 * @author M AHMAD
 */
public class Driver8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        // TODO code application logic here
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        }catch(Exception ex)
        {
            System.out.println("Hellp1");
        }
        Login L = new Login();
        L.setVisible(true);
        System.out.println("Hellp2");
        
    }
    
    
}
