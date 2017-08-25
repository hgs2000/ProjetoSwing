package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    public static void removeCliente(Cliente c) throws SQLException {
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "delete from cliente where cpf_cliente = ?;";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, c.getCPF());
        p.execute();
        System.out.println("Cliente removido!");
    }

    public static void adicionaCliente(Cliente c) throws SQLException {
        String str;
        str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into cliente (nome_cliente, idade_cliente, sexo_cliente, endereco_cliente, cpf_cliente) values (?, ?, ?, ?, ?);";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, c.getNome());
        p.setInt(2, c.getIdade());
        p.setString(3, c.getSexo());
        p.setString(4, c.getEndereco());
        p.setString(5, c.getCPF());
        p.execute();
        System.out.println("Novo cliente adicionado.");
    }

    public static ArrayList<Cliente> getClientes() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select nome_cliente, endereco_cliente, idade_cliente, sexo_cliente, cpf_cliente from cliente;";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            Cliente c = new Cliente(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
            clientes.add(c);
        }
        return clientes;
    }
}
