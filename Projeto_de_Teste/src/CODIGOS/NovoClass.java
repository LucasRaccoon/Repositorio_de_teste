/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael Ribeiro
 */
public class NovoClass {
    public static void main(String args[]){
        
        double x = 3.14;
        double y = 2.452134;
        double resultado = (x*y);
        
        DecimalFormat deci = new DecimalFormat("0.000");
     
         JOptionPane.showMessageDialog(null,deci.format(resultado));
        
    }
}
