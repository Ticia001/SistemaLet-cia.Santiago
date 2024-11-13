/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u11289134103
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... comp){
        for (int i = 0; i < comp.length; i++){
            comp[i].setEnabled(valor);
        }
    }
    public static void limpar(JComponent ... comp){
        for (int i = 0; i < comp.length; i++){
            ((JTextField)comp[i]).setText("");
        }
        if (comp[i] instanceof JTextFild){
            ((JTextField) comp[i]).setText("");
    }
    }
    public static int strToInt(String cad){
        return 0;
    }      
    public static double strToDouble(String cad){
        return 0;
    }
    public static Date strDate(String cad){
        return null;
    }
    public static String intToStr(int num){
        return"";
    }
    public static String doubleToStr(int num){
        return"";
    }
    public static String dateToStr(int num){
        return null;
    }
}
