package Tools;

public class Validadores {

    public static boolean isMaleOrFemale(Object sexo) {
        boolean mf = false;
        if (sexo.equals("Masculino")) {
            return true;
        } else {
            return mf;
        }
    }

    public static int getIntValue(String txt) {
        try {
            int val = Integer.parseInt(txt);
            return val;
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
}
