package Objetos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Filme {

    private FilmeDAO dao;
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

    public void setFilmeNome(JTextField filmeNome) throws Exception {
         if (!filmeNome.isEmpty()) {
            this.filmeNome = filmeNome;
        } else {
            throw new Exception("nome de filme invalido");
        }
    }

    public JTextArea getFilmeSinopse() {
        return filmeSinopse;
    }

    public void setFilmeSinopse(JTextArea filmeSinopse) throws Exception {
        if (!filmeSinopse.isEmpty()) {
            this.filmeSinopse = filmeSinopse;
        } else {
            throw new Exception("sinopse invalida");
        }
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
    
    public void sendToBD(){
        try{
            dao.adicionaFilme();
        } catch (SQLException ex) {
            Logger.getLogger(Filme.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro do SQL");
        }
    }

}
