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


    public static ArrayList<Cliente> getClientesFromDB() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        return null;
    }

    public static String connectToDB() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.out.println("Windows!");
            return "jdbc:mysql://localhost:3306/Opencine?user=root&password=root";
        } else {
            System.out.println("Not Windows!");
            return "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        }

    }
}
