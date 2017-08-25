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
public class Gerente extends Funcionario {

    GerenteDAO dao;

    public Gerente(String username, char[] password) {
        super(username, password);
        dao = new GerenteDAO(this);
    }

    @Override
    public void sendToDB() {
        try {
            dao.adicionaGerente();
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
