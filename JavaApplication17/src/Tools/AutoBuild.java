package Tools;

import Objetos.Cliente;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class AutoBuild {

    public static JComboBox<String> setIntegerComboBox(int min, int max) {
        JComboBox<String> value = new JComboBox<>();
        for (int i = min; i <= max; i++) {
            value.addItem("" + i);
        }
        return value;
    }

    public static String connectToDB() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            return "jdbc:mysql://localhost:3306/Opencine?user=root&password=root";
        } else {
            return "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        }

    }
}
