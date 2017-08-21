/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author informatica
 */
public class Vendedor extends Funcionario {

    private VendedorDAO dao;

    private String cpf, email, turno;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Vendedor(String username, char[] password) {
        super(username, password);
    }

    public Vendedor(String username, char[] password, String turno, String email, String cpf) {
        super(username, password);
        this.cpf = cpf;
        this.email = email;
        this.turno = turno;
        this.dao = new VendedorDAO(this);
    }

    @Override
    public void sendToDB() {
        try {
            dao.adicionaCliente();
        } catch (SQLException ex) {
            System.out.println("Erro do SQL!");
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
