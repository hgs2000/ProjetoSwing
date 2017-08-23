package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilmeDAO {
    Filme f;
    
    public FilmeDAO(Filme film){
        this.f = film;
    }

    public void adicionaFilme() throws SQLException{
        String str;
        //if (!System.getProperty("user.name").equals("dupla")) {
        //System.out.println("Yes");
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //} else /*if (System.getProperty("user.name").equals("Sake"))*/ {
        //System.out.println("No");
        //str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //}
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

}
