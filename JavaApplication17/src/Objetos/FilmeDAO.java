package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO {

    public static void adicionaFilme(Filme f) throws SQLException {
        String str;
        str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into filmes (nome_filme, des_filme, gen_filme, ano_filme) values (?, ?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, f.getFilmeNome());
        p.setString(2, f.getFilmeSinopse());
        p.setString(3, f.getFilmeGeneros());
        p.setInt(4, f.getFilmeAno());
        p.execute();
        System.out.println("Novo Filme adicionado");
    }

    public static ArrayList<Filme> getFilmes() throws SQLException {
        ArrayList<Filme> filmes = new ArrayList<>();
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select nome_filme, des_filme, gen_filme, ano_filme from filmes";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            Filme linha = new Filme(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            filmes.add(linha);
        }
        return filmes;
    }

    public static void deletaFilme(String nomeFilme, int anoFilme) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "delete from filmes where nome_filme = ? and ano_filme = ?";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, nomeFilme);
        p.setInt(2, anoFilme);
        p.execute();
        System.out.println("Filme removido!");
    }
}
