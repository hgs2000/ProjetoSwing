/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools.controles_filme;

import Objetos.Filme;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author dupla
 */
public class FilmeDAO {

    private static void start() throws IOException {
        arquivoFilmes = new File("./arquivo.xml");
        xs = new XStream();
        if (!arquivoFilmes.exists()) {
            arquivoFilmes.createNewFile();
        }
    }

    //Utilizado para salvar localmente
    private static File arquivoFilmes;
    private static XStream xs;

    /**
     * Utilização: carregar filmes do arquivo/banco de dados.
     *
     * @param c
     * @return lista de filmes salva
     */
    public static ArrayList<Filme> carregadorDeFilmes(Class c) {
        InputStream is;
        Reader rd;
        ArrayList<Filme> listaFilmes = null;
        try {
            start();
            is = new FileInputStream(arquivoFilmes);
            rd = new InputStreamReader(is, Charset.forName("UTF-8"));
            listaFilmes = (ArrayList<Filme>) xs.fromXML(rd);
        } catch (IOException ex) {
        }
        return listaFilmes;
    }
}
