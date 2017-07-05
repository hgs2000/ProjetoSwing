package Objetos;

import java.net.PasswordAuthentication;

public class Funcionario {

    private PasswordAuthentication login_pessoa;

    public Funcionario(String username, char[] password) {
        login_pessoa = new PasswordAuthentication(username, password);
    }

    public boolean validLogin(String username, char[] password) {
        String senha = "";
        String senhaBD = "";
        for (int i = 0; i < password.length; i++) {
            senha = senha + password[i];
        }
        for (int i = 0; i < login_pessoa.getPassword().length; i++) {
            senhaBD = senhaBD + login_pessoa.getPassword()[i];
        }
        return ((login_pessoa.getUserName().equals(username))
                && (senha.equals(senhaBD)));

    }
}
