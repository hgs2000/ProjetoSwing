package Objetos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sala {

    private String nome, cod;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new Exception("nome invalido");
        }
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) throws Exception {
        if (!nome.isEmpty()) {
            this.cod = cod;
        } else {
            throw new Exception("código invalido");
        }
    }

    public Sala(String nome, String cod) {
        this.nome = nome;
        this.cod = cod;
    }

    public void sendToBD() {
        try {
            SalaDAO.adicionaSala(this);
        } catch (SQLException ex) {
            Logger.getLogger(Sala.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro do SQL!");
        }
    }
}
