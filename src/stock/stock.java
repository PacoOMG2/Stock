/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

import basedatos.Conexion;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.mycompany.interfaz.menu;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.jtattoo.plaf.aero.*;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.mycompany.interfaz.login;


public class stock {
    
    public static void main(String[] args) {
        
      
        try {
            AeroLookAndFeel.setTheme("Gold-Giant-Font,");
            
            UIManager.setLookAndFeel(new MintLookAndFeel());
            System.err.println(AeroLookAndFeel.getThemes());
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex){
            ex.printStackTrace();
        }
        
        
        login log = new login();
        log.setVisible(true);
//        Conexion.iniciar();
//      
//        
//        if (Conexion.conexion != null){
//            
//           menu menu = new menu();
//           menu.setVisible(true);
//        
//        }else{
//            JOptionPane.showMessageDialog(null, "No hubo conexion con la base de datos ...");
//            
//        }//cierre del ese
    
}}//cierre del main
