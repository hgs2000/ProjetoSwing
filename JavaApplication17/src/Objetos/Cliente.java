package Objetos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Cliente {

    private ClienteDAO dao;
    private String nome, endereco, CPF;
    private int idade;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf;
    }
    private boolean sexo;//true : masc, false femi;

    public Cliente() {

    }

    public Cliente(String nome, String endereco, int idade, boolean sexo, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.sexo = sexo;
        this.CPF = cpf;
        this.dao = new ClienteDAO(this);
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws Exception {
        if (!endereco.isEmpty()) {
            this.endereco = endereco;
        } else {
            throw new Exception("endereco invalido");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if ((idade > 17) && (idade < 150)) {
            this.idade = idade;
        } else {
            throw new Exception("idade invalida");
        }
    }

    public String getSexo() {
        if (sexo == true) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void sendToDB() {
        try {
            dao.adicionaCliente();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro do SQL!");
        }
    }

}
