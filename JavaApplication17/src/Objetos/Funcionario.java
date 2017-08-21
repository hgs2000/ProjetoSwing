package Objetos;

import java.net.PasswordAuthentication;

public class Funcionario {

    public PasswordAuthentication getLogin_pessoa() {
        return login_pessoa;
    }

    public void setLogin_pessoa(PasswordAuthentication login_pessoa) {
        this.login_pessoa = login_pessoa;
    }

    private PasswordAuthentication login_pessoa;

    public Funcionario(String username, char[] password) {
        this.login_pessoa = new PasswordAuthentication(username, password);
    }

    public boolean validLogin(String username, char[] password) {
        String senha = "";
        String senhaBD = "";
        senha = String.copyValueOf(password);
        senhaBD = String.copyValueOf(login_pessoa.getPassword());
        return ((login_pessoa.getUserName().equals(username))
                && (senha.equals(senhaBD)));
    }

    public void sendToDB() {
        System.out.println("This isn't the DB you are looking for...");
    }
}
