package Tools;

import GUI.PainelVendedor;
import Objetos.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class AutoBuild {

    public static JComboBox<String> setIntegerComboBox(int min, int max) {
        JComboBox<String> value = new JComboBox<>();
        for (int i = min; i <= max; i++) {
            value.addItem("" + i);
        }
        return value;
    }

    public static JFormattedTextField validaNums(int subOp) {
        switch (subOp) {
            case 1: {
                MaskFormatter formatoCPF = null;
                try {
                    formatoCPF = new MaskFormatter("###.###.###-##");
                } catch (ParseException ex) {
                    Logger.getLogger(PainelVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                JFormattedTextField field = new JFormattedTextField(formatoCPF);
                return field;
            }
            case 2: {
                MaskFormatter formatoCPF = null;
                try {
                    formatoCPF = new MaskFormatter("###");
                } catch (ParseException ex) {
                    Logger.getLogger(PainelVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                JFormattedTextField field = new JFormattedTextField(formatoCPF);
                return field;
            }
            default:
                return new JFormattedTextField();
        }
    }

    public static ArrayList<Cliente> getClientesFromDB() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        
        
        return null;
    }
}
