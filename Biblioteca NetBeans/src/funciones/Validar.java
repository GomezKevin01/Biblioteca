/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Validar {
    
    public void validarSoloLetras(JTextField campo){
       campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c= e.getKeyChar();
               //Si se ingresa un numero no se visualiza
               if(Character.isDigit(c)){
                   e.consume();
               }
           }
       });
   }
   
   public void validarSoloNumeros(JTextField campo){
       campo.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
               char c= e.getKeyChar();
               //Si se ingresa un numero se visualiza
               if(!Character.isDigit(c)){
                   e.consume();
               }
           }
       });
   }
}
