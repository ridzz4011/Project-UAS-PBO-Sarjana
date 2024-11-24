/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EventHandler;

import javax.swing.JOptionPane;

/**
 *
 * @author farid
 */
public class ErrorHandler {
    public static void eHandler(Exception e, String message) {
        e.printStackTrace();
        
        JOptionPane.showMessageDialog(null, message + "\nError: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
