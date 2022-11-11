package br.com.dio.collections.stream;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

import br.com.dio.collections.map.Contato;

public class RefatoracaoOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 2222));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem Inserção\t--");
        Map<Integer, Contato> agendaOrdenadaPorIsercao = new LinkedHashMap<>(){{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 2222));
            put(3, new Contato("Jon", 1111));
        }};
        System.out.println(agendaOrdenadaPorIsercao);
        for (Map.Entry<Integer, Contato> entry: agendaOrdenadaPorIsercao.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem id\t--");
        Map<Integer, Contato> agendaOrdenadaPorId = new TreeMap<>(agenda);
        System.out.println(agendaOrdenadaPorIsercao);

        for (Map.Entry<Integer, Contato> entry : agendaOrdenadaPorId.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem número telefone\t--");
       
        //precisamos organizar os valores. Logo:
        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {

            @Override
            public int compare(Entry<Integer, Contato> cont1, Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        }); */

       /*  Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, Integer >() {

                @Override
                public Integer apply(Map.Entry<Integer, Contato> cont) {
                    return cont.getValue().getNumero();
                }
            
        })); */

        //Usando lambida
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
            cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n--\tOrdem nome contato\t--");
        /*Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, String>(){

                @Override
                public String apply(Entry<Integer, Contato> cont) {
                    return cont.getValue().getNome();
                }}));
        */
        
       // Usando lambida
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

    }
}
