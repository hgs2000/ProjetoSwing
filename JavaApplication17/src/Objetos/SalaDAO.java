package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SalaDAO {

    public static void removeSala(Sala sala) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "delete from sala where cod_sala = ?;";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, Integer.parseInt(sala.getCod()));
        p.execute();
        System.out.println("Sala removida com sucesso!");
    }

    public static void adicionaSala(Sala s) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into sala (cod_sala, nome_sala) values (?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, Integer.parseInt(s.getCod()));
        p.setString(2, s.getNome());
        p.execute();
        System.out.println("Nova sala adicionada.");
    }

    public static ArrayList<Sala> getSalas() throws SQLException {
        ArrayList<Sala> salas = new ArrayList<>();
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select cod_sala, nome_sala from sala";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            Sala s = new Sala(rs.getString(2), rs.getString(1));
            salas.add(s);
        }
        System.out.println("Status: Retorno de salas do SQL realizado com sucesso.");
        return salas;
    }
}
