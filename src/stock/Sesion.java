/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stock;

import basedatos.Conexion;

import com.mycompany.interfaz.RegistroDIALOG;
import com.mycompany.interfaz.menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author 52917
 */
public class Sesion {
    
    public void consultarUsuario(String user, String pass) {
        // TODO add your handling code here:
        Conexion db = new Conexion();
        // Se inicializa a null
        String usuarioCorrecto = user;
        String passCorrecto = pass;
        try {
            
            Connection cn = db.iniciar();
            PreparedStatement pst = cn.prepareStatement("SELECT tipo_usuario, contrasena FROM usuario WHERE tipo_usuario='" + user + "'");
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                usuarioCorrecto = rs.getString(1);
                passCorrecto = rs.getString(2);
                //String nombre = rs.getString(3);  
                if (user.equals("Administrador") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) " + user);
                    

                    //abre la ventana de menu
                    menu menu = new menu();
                    menu.setVisible(true);
                                       
                }else if(user.equals("Empleado") && pass.equals("user")){
                    JOptionPane.showMessageDialog(null, "Bienvenido(a) " + user);

                    //abre la ventana de menu
                    menu menu = new menu();
                    menu.setVisible(true);
                    menu.desactivarbotones();
                }//Fin del else if
            } else if (user.equals(usuarioCorrecto) || pass.equals(passCorrecto)) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }//fin del elfe if que pertenece a el if principal
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }

//    private void dispose() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    public static Boolean cierreSesion(String usuario, String pass){
        boolean cierre = false;
        if(usuario.equals("Administrador") && pass.equals("admin") || usuario.equals("Empleado") && pass.equals("user")){
            return cierre = true;
        }else{
            return cierre;
        }
    }
}
