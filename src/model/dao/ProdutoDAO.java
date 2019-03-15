package model.dao;

import connection.ConnectionDB;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author NETS
 */
public class ProdutoDAO {

    public void create(Produto p) {

        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (NOME,DESCRICAO,PRECO_COMPRA,PRECO_VENDA,QUANTIDADE,DISPONIVEL)VALUES(?,?,?,?,?,?)");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setDouble(3, p.getPrecoCompra());
            stmt.setDouble(4, p.getPrecoVenda());
            stmt.setInt(5, p.getQuantidade());
            stmt.setBoolean(6, p.isFlagProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }

    }

    //Listar produtos 
    public ArrayList<Produto> read() {

        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setPrecoCompra(rs.getDouble("PRECO_COMPRA"));
                produto.setPrecoVenda(rs.getDouble("PRECO_VENDA"));
                produto.setQuantidade(rs.getInt("QUANTIDADE"));
                produto.setFlagProduto(rs.getBoolean("DISPONIVEL"));

                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public void update(Produto p) {

        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET NOME = ?, DESCRICAO = ?, PRECO_COMPRA = ?, PRECO_VENDA = ?, QUANTIDADE = ?, DISPONIVEL = ? WHERE id = ?");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setDouble(3, p.getPrecoCompra());
            stmt.setDouble(4, p.getPrecoVenda());
            stmt.setInt(5, p.getQuantidade());
            stmt.setBoolean(6, p.isFlagProduto());
            stmt.setInt(7, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }

    }

    public void delete(Produto p) {

        Connection con = ConnectionDB.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");

            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionDB.closeConnection(con, stmt);
        }

    }
}
