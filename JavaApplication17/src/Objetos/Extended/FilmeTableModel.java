package Objetos.Extended;

import Objetos.Filme;
import Objetos.FilmeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * Modelo baseado no código realizado pelo autor na página
 * http://www.botecodigital.info/java/criando-um-model-para-um-jtable-com-abstracttablemodel/
 *
 * @author Rodrigo Aramburu @botecodigital.info
 */
public class FilmeTableModel extends AbstractTableModel {

    private final ArrayList<Filme> filmes;
    private final String[] colunas;

    public FilmeTableModel() throws SQLException {
        this.colunas = new String[]{"Posicao", "Nome do Filme", "Descrição", "Gênero", "Ano do Filme"};
        filmes = FilmeDAO.getFilmes();
    }

    public void addRow(Filme f) {
        this.filmes.add(f);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int num) {
        return this.colunas[num];
    }

    @Override
    public int getRowCount() {
        return filmes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return "" + (linha + 1);
            case 1:
                return filmes.get(linha).getFilmeNome();
            case 2:
                return filmes.get(linha).getFilmeSinopse();
            case 3:
                return filmes.get(linha).getFilmeGeneros();
            case 4:
                return filmes.get(linha).getFilmeAno();
            default:
                return null;
        }
    }

    public void removeRow(int linha) {
        this.filmes.remove(linha);
        this.fireTableDataChanged();
    }

    public Filme get(int linha) {
        return this.filmes.get(linha);
    }

    public void updateTable() {
        this.fireTableDataChanged();
    }

}
