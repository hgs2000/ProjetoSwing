package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalaDAO {

    Sala s;

    public SalaDAO(Sala sal) {
        this.s = sal;
    }

    public void adicionaSala() throws SQLException {
        String str;
        //if (!System.getProperty("user.name").equals("dupla")) {
        //System.out.println("Yes");
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //} else /*if (System.getProperty("user.name").equals("Sake"))*/ {
        //System.out.println("No");
        //str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //}
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into sala (cod_sala, nome_sala) values (?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, this.s.getCod());
        p.setString(2, this.s.getNome());
        p.execute();
        System.out.println("Nova sala adicionada.");
    }

}
