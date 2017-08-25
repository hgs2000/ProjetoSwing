package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaDAO {

    Sala s;

    public SalaDAO(Sala sal) {
        this.s = sal;
    }

    public void adicionaSala() throws SQLException {
        String str;
        str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into sala (cod_sala, nome_sala) values (?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, Integer.parseInt(this.s.getCod()));
        p.setString(2, this.s.getNome());
        p.execute();
        System.out.println("Nova sala adicionada.");
    }

    public Sala retornaSala() throws SQLException {
        Sala s = null;
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select login_ger, senha_ger from gerente";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            s = new Sala(rs.getString(1), rs.getString(2));
        }
        return s;
    }
}
