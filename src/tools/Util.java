package tools;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    // Método para habilitar ou desabilitar componentes em um JPanel
    public static void habilitarComponentes(JPanel panel, boolean habilitar) {
        Component[] componentes = panel.getComponents();
        for (Component componente : componentes) {
            componente.setEnabled(habilitar);
        }
    }

    // Método para limpar campos de texto em um JPanel
    public static void limparCampos(JPanel panel) {
        Component[] componentes = panel.getComponents();
        for (Component componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JPasswordField) {
                ((JPasswordField) componente).setText("");
            }
        }
    }

    // Método para mostrar mensagem de confirmação
    public static boolean perguntar(String mensagem, String titulo) {
        int resposta = JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);
        return resposta == JOptionPane.YES_OPTION;
    }

    // Método para mostrar mensagens de erro
    public static void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    // Método para mostrar mensagens de informação
    public static void mostrarInformacao(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para converter String para inteiro
    public static int stringParaInt(String valor) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            mostrarErro("Valor inválido! Deve ser um número inteiro.");
            return 0;
        }
    }

    // Método para converter String para Date
    public static Date stringParaData(String dataStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(dataStr);
        } catch (ParseException e) {
            mostrarErro("Formato de data inválido! Use o formato 'yyyy-MM-dd'.");
            return null;
        }
    }

    // Método para converter Date para String
    public static String dataParaString(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(data);
    }

    // Método para centralizar uma janela (JFrame ou JDialog) na tela
    public static void centralizarJanela(Window janela) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tela.width - janela.getWidth()) / 2;
        int y = (tela.height - janela.getHeight()) / 2;
        janela.setLocation(x, y);
    }
}
