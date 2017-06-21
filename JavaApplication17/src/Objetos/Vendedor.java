/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.net.PasswordAuthentication;

/**
 *
 * @author informatica
 */
public class Vendedor extends Funcionario{
        final int typeId = 1;
    private PasswordAuthentication login_pessoa;

    public Vendedor(String username, char[] password) {
        super(username, password);
    }

}
