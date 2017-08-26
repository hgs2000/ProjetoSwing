package Objetos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JCheckBox;

public class Filme {

    private FilmeDAO dao;
    private String filmeNome;
    private String filmeSinopse;
    private String filmeGeneros;
    private int filmeAno;

    public int getFilmeAno() {
        return filmeAno;
    }

    public void setFilmeAno(int filmeAno) {
        this.filmeAno = filmeAno;
    }

    public String getFilmeNome() {
        return filmeNome;
    }

    public void setFilmeNome(String filmeNome) throws Exception {
        if (!filmeNome.isEmpty()) {
            this.filmeNome = filmeNome;
        } else {
            throw new Exception("nome de filme invalido");
        }
    }

    public String getFilmeSinopse() {
        return filmeSinopse;
    }

    public void setFilmeSinopse(String filmeSinopse) throws Exception {
        if (!filmeSinopse.isEmpty()) {
            this.filmeSinopse = filmeSinopse;
        } else {
            throw new Exception("sinopse invalida");
        }
    }

    public String getFilmeGeneros() {
        return filmeGeneros;
    }

    public void setFilmeGeneros(String filmeGeneros) {
        this.filmeGeneros = filmeGeneros;
    }

    public Filme(String filmeNome, String filmeSinopse, String filmeGeneros, int filmeAno) {
        this.filmeNome = filmeNome;
        this.filmeSinopse = filmeSinopse;
        this.filmeGeneros = filmeGeneros;
        this.filmeAno = filmeAno;
    }

    public void sendToBD() {
        try {
            FilmeDAO.adicionaFilme(this);
        } catch (SQLException ex) {
            Logger.getLogger(Filme.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro do SQL");
        }
    }

}
