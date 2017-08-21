package Objetos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    Cliente c;

    public ClienteDAO(Cliente cli) {
        this.c = cli;
    }

    /*public Cliente retornaCliente(
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
                Logger.getLoggString sqler(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cl;
    }*/
    public void adicionaCliente() throws SQLException {
        String str;
        //if (!System.getProperty("user.name").equals("dupla")) {
        //System.out.println("Yes");
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=root";
        //} else /*if (System.getProperty("user.name").equals("Sake"))*/ {
        //System.out.println("No");
        //str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        //}
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into cliente (nome_cliente, idade_cliente, sexo_cliente, endereco_cliente, cpf_cliente) values (?, ?, ?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, this.c.getNome());
        p.setInt(2, this.c.getIdade());
        p.setString(3, this.c.getSexo());
        p.setString(4, this.c.getEndereco());
        p.setString(5, this.c.getCPF());
        p.execute();
        System.out.println("Novo cliente adicionado.");
    }
}
