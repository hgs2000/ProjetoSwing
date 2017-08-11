/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.ToolTipManager;

public class Msgs {

    public static boolean gerenteMsg() {
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Não a nenhum gerente cadatrado\n"
                + "É nesesario cadastrar um gerente para continuar\n"
                + "Deseja cadastrar um gerente agora?", "Atenção",
                JOptionPane.YES_NO_OPTION)) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void displayErrorJOP(String text, Component cmpnt){
        JOptionPane.showMessageDialog(cmpnt, text, "Erro!" ,JOptionPane.WARNING_MESSAGE);
    }
}
