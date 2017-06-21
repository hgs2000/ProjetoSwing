package Objetos;

import java.net.PasswordAuthentication;

public class Funcionario {

    private PasswordAuthentication login_pessoa;

    public Funcionario(String username, char[] password) {
        login_pessoa = new PasswordAuthentication(username, password);
    }

    public boolean validLogin(String username, char[] password) {
        return ((login_pessoa.getUserName().equals(username))
                && (login_pessoa.getPassword() == password));

    }
}
