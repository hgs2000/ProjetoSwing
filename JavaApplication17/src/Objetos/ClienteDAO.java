package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    public Cliente autenticaUsuario(
            String nome,
            String senha)
            throws SQLException {

        String str = "jdbc:mysql://localhost:3306/Opencine?"
                + "user=root&password=alunoifc";

        Connection conn = DriverManager.getConnection(str);
        String sql = "select nome_cliente, idade_cliente, endereco_cliente, cpf_cliente, sexo_cliente from cliente"
                + " where nome = ? "
                + "   and senha = ? ";

        PreparedStatement p = conn.prepareStatement(sql);

        p.setString(1, nome);
        p.setString(2, senha);

        ResultSet rs = p.executeQuery();
        Cliente cl = null;
        if (rs.next()) {
            cl = new Cliente();
            try {
                cl.setNome(rs.getString(1));
                cl.setEndereco(rs.getString(2));
                cl.setIdade(rs.getInt(3));
                cl.setCPF(rs.getInt(4));
                cl.setSexo(rs.getBoolean(5));
            } catch (Exception ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cl;
    }
}
