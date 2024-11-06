
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u11289134103
 */
public class Util {
    public void habilitar(boolean valor, JComponent ... comp){
        for (int i = 0; i < comp.length; i++){
            comp[i].setEnabled(valor);
        }
    }
    public static void limpar(JComponent ... comp){
        for (int i = 0; i < comp.length; i++){
            ((JTextField)comp[i]).setText("");
        }
    }
    public static int strToint(String cad){
        return 0;
    }
    public static double strToDouble(String cad){
        return 0;
    }
    public static Date strToDate(int cad){
        return null;
    }
    public static String intToStr(int num){
        return "";
    }
    public static String doubleToStr(double num){
        return "";
    }
    public static String dateTOStr(Date data){
        return null;
    }
}
