package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FilmeDAO {

    Filme f;

    public FilmeDAO(Filme film) {
        this.f = film;
    }

    public void adicionaFilme() throws SQLException {
        String str;
        str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into filmes (nome_filme, des_filme, gen_filme, ano_filme) values (?, ?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, this.f.getFilmeNome());
        p.setString(2, this.f.getFilmeSinopse());
        p.setString(3, this.f.getFilmeGeneros());
        p.setInt(4, this.f.getFilmeAno());
        p.execute();
        System.out.println("Novo Filme adicionado");
    }

    public static ArrayList<Filme> carregaFilme() throws SQLException {
        ArrayList<Filme> filmes = new ArrayList<>();
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select nome_filme, des_filme, gen_filme, ano_filme from filmes";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            Filme linha = new Filme(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            filmes.add(linha);
            System.out.println(linha.getFilmeNome());
            System.out.println(linha.getFilmeGeneros());
            System.out.println(linha.getFilmeSinopse());
            System.out.println(linha.getFilmeAno());
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
