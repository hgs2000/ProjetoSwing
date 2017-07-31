package Tools;

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

}
