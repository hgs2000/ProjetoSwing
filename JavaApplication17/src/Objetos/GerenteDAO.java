package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GerenteDAO {

    public static void adicionaGerente(Gerente g) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into gerente (login_ger, senha_ger) values (?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, g.getLogin_pessoa().getUserName());
        p.setString(2, "" + String.valueOf(g.getLogin_pessoa().getPassword()));
        p.execute();
    }

    public static Gerente getGerente() throws SQLException {
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
