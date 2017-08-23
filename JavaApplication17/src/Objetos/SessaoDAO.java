package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SessaoDAO {

    Sessao s;
    
    public SessaoDAO(Sessao ses){
        this.s = ses;
    }
    public void adicionaSessao() throws SQLException {
        String str;
        //if (!System.getProperty("user.name").equals("dupla")) {
        //System.out.println("Yes");
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //} else /*if (System.getProperty("user.name").equals("Sake"))*/ {
        //System.out.println("No");
        //str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //}
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into sessao (preco_sessao, hora_sessao, minuto_sessao) values (?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setFloat(1, this.s.getPreco());
        p.setInt(2, this.s.getHora());
        p.setInt(3, this.s.getMinuto());
        p.execute();
        System.out.println("Nova sessão adicionada.");
    }
}
