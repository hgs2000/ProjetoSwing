package Objetos.Extended;

import Objetos.Filme;
import Objetos.Sala;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * Classe adaptada do site
 * http://www.linhadecodigo.com.br/artigo/3664/comboboxmodel-em-java.aspx
 *
 * @author André Pereira @ linhadecodigo.com.br
 */
public class ObjectComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object> {

    private ArrayList<Object> lista;
    private Object selectedObject;
    private static final int FIRSTINDEX = 0;
    private String c;

    public ObjectComboModel() {
        this.lista = new ArrayList<>();
    }

    public ObjectComboModel(Object[] lista, String classe) {
        this();
        this.lista.addAll(Arrays.asList(lista));
        this.c = classe;
        if (getSize() > 0) {
            setSelectedItem(this.lista.get(FIRSTINDEX));
        }
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getSelectedItem() {
        if (c.equals("Filme")) {
            return ((Filme) selectedObject).getFilmeNome();
        }
        if (c.equals("Sala")) {
            return ((Sala) selectedObject).getNome();
        }
        return selectedObject;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        switch (c) {
            case "Filme":
                selectedObject = ((Filme) anItem);
                break;
            case "Sala":
                selectedObject = ((Sala) anItem);
                break;
            default:
                selectedObject = (Object) anItem;
                break;
        }
    }

    public void addEstado(Object object) {
        lista.add(object);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(lista.get(getSize() - 1));
    }

    public void addListEstado(ArrayList<Object> objects) {
        int primeiraLinha = getSize();
        lista.addAll(objects);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha + objects.size());
        setSelectedItem(lista.get(getSize() - 1));
    }

    public void removeObject() {
        lista.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(lista.get(FIRSTINDEX));
    }

    public void clear() {
        lista.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }

}
