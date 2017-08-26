package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SessaoDAO {

    public static void adicionaSessao(Sessao s) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into sessao (preco_sessao, hora_sessao, minuto_sessao) values (?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setFloat(1, s.getPreco());
        p.setInt(2, s.getHora());
        p.setInt(3, s.getMinuto());
        p.execute();
        System.out.println("Nova sessão adicionada.");
    }
}
