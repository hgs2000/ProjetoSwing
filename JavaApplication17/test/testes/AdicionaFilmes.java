package testes;

import Objetos.Filme;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AdicionaFilmes {

    static ArrayList<Filme> filmes = new ArrayList<>();

    public static void main(String[] args) {

        filmes.add(new Filme("Dredd",
                "The future America is an irradiated waste land. On its East Coast, running from Boston to Washington DC, lies Mega City One - a vast, "
                + "\nviolent metropolis where criminals rule the chaotic streets. The only force of order lies with the urban cops called \"Judges\" who possess "
                + "\nthe combined powers of judge, jury and instant executioner. Known and feared throughout the city, Dredd is the ultimate Judge, challenged "
                + "\nwith ridding the city of its latest scourge - a dangerous drug epidemic that has users of \"Slo-Mo\" experiencing reality at a fraction of "
                + "\nits normal speed. During a routine day on the job, Dredd is assigned to train and evaluate Cassandra Anderson, a rookie with powerful "
                + "\npsychic abilities thanks to a genetic mutation. A heinous crime calls them to a neighborhood where fellow Judges rarely dare to "
                + "\nventure - a 200 storey vertical slum controlled by prostitute turned drug lord Ma-Ma and her ruthless clan. When they capture "
                + "\none of the clan's inner circle, Ma-Ma overtakes the compound's ...",
                "Ação",
                2012));

        System.out.println("Nome:\n     " + filmes.get(0).getFilmeNome() + "\n");
        System.out.println("Sinopse:\n      " + filmes.get(0) + "\n");
        System.out.println("Gêneros do Filme:\n      " + filmes.get(0).getFilmeGeneros() + "\n");
        System.out.println("Ano:\n      " + filmes.get(0).getFilmeAno());

    }

}
