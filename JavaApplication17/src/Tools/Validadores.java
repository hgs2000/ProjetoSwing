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

    public static String getSexoFromBool(boolean sexo) {
        if (sexo) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }

    public static long getLongValue(String text) {
        try {
            long val = Long.parseLong(text);
            return val;
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return -1;
        }
    }
}
