/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijui;


import javax.swing.JOptionPane;

/**
 *
 * @author Estudos
 */
public class UIMessage {
    
    public static void exit(){
        int result = JOptionPane.showConfirmDialog(null, "Do you really want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
        if( result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    
    public static void showMessage(String msg){
        JOptionPane.showMessageDialog(null, msg, "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }
  
}