package br.com.dio.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{  // HashSet não mantem orderm de inseção.
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that", "comédia", 25));
        }};

        for (Serie serie : minhasSeries) System.out.println(serie.toString() + "\n");
//--------------------------------------------------------------------------------------

        System.out.println("--\tOrdem de Inserção\t--"); // LinkedHashSet matem a ordem de inserção;
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(minhasSeries);
        for (Serie serie : minhasSeries) System.out.println(serie.toString() + "\n");


//--------------------------------------------------------------------------------------
        System.out.println("--\tOrdem Natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
        for (Serie serie : minhasSeries3) System.out.println(serie.toString() + "\n");


//--------------------------------------------------------------------------------------

        System.out.println("--\tOrdem Nome/Genero/TempoEpisódio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries3);
        for (Serie serie : minhasSeries4) System.out.println(serie.toString() + "\n");



//--------------------------------------------------------------------------------------

        System.out.println("--\tOrdem Genero\t--");


//--------------------------------------------------------------------------------------

        System.out.println("--\tOrdem TempoEpisódio\t--");

    }
}


