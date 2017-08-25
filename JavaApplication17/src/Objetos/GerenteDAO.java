package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class GerenteDAO {

    private Gerente g;

    public GerenteDAO(Gerente gerente) {
        this.g = gerente;
    }

    public void adicionaGerente() throws SQLException {
        String str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into gerente (login_ger, senha_ger, cpf_ger, email_ger) values (?, ?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, this.g.getLogin_pessoa().getUserName());
        p.setString(2, "" + Arrays.toString(this.g.getLogin_pessoa().getPassword()));
    }

    public Gerente getGerente() throws SQLException {
        Gerente ger = null;
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select login_ger, senha_ger from gerente";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            ger = new Gerente(rs.getString(1), rs.getString(2).toCharArray());
        }
        return ger;
    }
}
