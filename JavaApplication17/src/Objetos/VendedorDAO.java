package Objetos;

import Tools.AutoBuild;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class VendedorDAO {

    Vendedor v;

    public VendedorDAO(Vendedor v) {
        this.v = v;
    }

    public void adicionaCliente() throws SQLException {
        String str;
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=alunoifc";
        Connection conn = DriverManager.getConnection(str);
        String sql = "insert into vendedor values (?, ?, ?, ?, ?)";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, this.v.getLogin_pessoa().getUserName());
        p.setString(2, "" + String.valueOf(this.v.getLogin_pessoa().getPassword()));
        p.setString(3, this.v.getCpf());
        p.setString(4, this.v.getTurno());
        p.setString(5, this.v.getEmail());
        p.execute();
        System.out.println("Novo vendedor adicionado.");
    }

    public static void removeVendedor(String cpf) throws SQLException {
        String str;
        str = "jdbc:mysql://localhost:3306/Opencine?user=root&password=root";
        Connection conn = DriverManager.getConnection(str);
        String sql = "delete from vendedor where cpf_vend = ?";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, cpf);
        p.execute();
    }

    public static ArrayList<Vendedor> getVendedores() throws SQLException {
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        String str;
        str = AutoBuild.connectToDB();
        Connection conn = DriverManager.getConnection(str);
        String sql = "select login_vend, senha_vend, cpf_vend, turno_vend, email_vend from vendedor";
        PreparedStatement p = conn.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        while (rs.next()) {
            Vendedor linha = new Vendedor(rs.getString(1), rs.getString(2).toCharArray(), rs.getString(4), rs.getString(5), rs.getString(3));
            //linha.setCpf(rs.getString("cpf_vend"));
            //linha.setEmail(rs.getString("email_vend"));
            //linha.setTurno(rs.getString("turno_vend"));
            vendedores.add(linha);
            System.out.println(linha.getCpf());
            System.out.println(linha.getEmail());
            System.out.println(linha.getTurno());
            System.out.println("\n");
        }
        return vendedores;
    }
}
