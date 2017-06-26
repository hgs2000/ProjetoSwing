package Objetos;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Filme {

    private JTextField filmeNome;
    private JTextArea filmeSinopse;
    private ArrayList<JCheckBox> filmeGeneros;
    private int filmeAno;

    public int getFilmeAno() {
        return filmeAno;
    }

    public void setFilmeAno(int filmeAno) {
        this.filmeAno = filmeAno;
    }

    public JTextField getFilmeNome() {
        return filmeNome;
    }

    public void setFilmeNome(JTextField filmeNome) {
        this.filmeNome = filmeNome;
    }

    public JTextArea getFilmeSinopse() {
        return filmeSinopse;
    }

    public void setFilmeSinopse(JTextArea filmeSinopse) {
        this.filmeSinopse = filmeSinopse;
    }

    public ArrayList<JCheckBox> getFilmeGeneros() {
        return filmeGeneros;
    }

    public void setFilmeGeneros(ArrayList<JCheckBox> filmeGeneros) {
        this.filmeGeneros = filmeGeneros;
    }

    public Filme(JTextField filmeNome, JTextArea filmeSinopse, ArrayList<JCheckBox> filmeGeneros, int filmeAno) {
        this.filmeNome = filmeNome;
        this.filmeSinopse = filmeSinopse;
        this.filmeGeneros = filmeGeneros;
        this.filmeAno = filmeAno;
    }

}
