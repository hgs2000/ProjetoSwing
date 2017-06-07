package projeto_swing;

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

    public void changePassword(char[] password) {
        login_pessoa = new PasswordAuthentication(login_pessoa.getUserName(), password);
    }
}

class Gerente extends Funcionario {

    public Gerente(String username, char[] password) {
        super(username, password);
    }

}

class Vendedor extends Funcionario {

    public Vendedor(String username, char[] password) {
        super(username, password);
    }

}
