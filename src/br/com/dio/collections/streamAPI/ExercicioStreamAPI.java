package br.com.dio.collections.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ExercicioStreamAPI {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
       //Forma 01:
       /* 
       numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
              System.out.println(s);               
            }
        });
         */

        //Forma 02:
        System.out.println("Froma 02 com Lambida");
        //numerosAleatorios.stream().forEach(s->System.out.println(s));
        //numerosAleatorios.forEach(s->System.out.println(s));q
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        //Imprime só 4 porque o set nâo aceita valores repetidos;
       // numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
         //Imprime todos os 5 porque o lis  aceita valores repetidos;
        numerosAleatorios.stream().limit(5).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream()
            .map(new Function<String,Integer>() {

                @Override
                public Integer apply(String s) {
                    return Integer.parseInt(s);
                }
                
            });

            numerosAleatorios.stream()
            .map(s -> Integer.parseInt(s));

            List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
            collectList.forEach(System.out::println);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
            
            List<Integer> listParesMiorQue2 =  numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer i) {
                    if(i %2 == 0 && i>2) return true;
                    return false;
                }   
            }).collect(Collectors.toList());

            numerosAleatorios.stream().map(Integer::parseInt).filter(i->(i %2 == 0 && i>2)).collect(Collectors.toList());

        System.out.println("Mostre a média dos números:");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(new DoubleConsumer() {

            @Override
            public void accept(double v) {
                
                System.out.println(v);
            }
            
        });

        //Forma 02
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Remova os valores impares:");
        List<Integer> numerosAleatoriosImpares = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosImpares.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if (i % 2 != 0) return true;
                return false;
            }
            
        });
        System.out.println(numerosAleatoriosImpares);

        numerosAleatoriosImpares.removeIf(i ->(i % 2 != 0));



        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);

        System.out.println("Retire os números repetidos da lista");
        List<Integer> numerosUnicos = numerosAleatorios.stream().map(Integer::parseInt).distinct().toList();
        System.out.println(numerosUnicos);

        System.out.println("Retirando os números repetidos da lista, quantos números ficam?");
        long countNemerosUnicos = numerosAleatorios.stream().distinct().count();
        System.out.println(countNemerosUnicos);

        System.out.println("Mostre o menor valor da lista: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        System.out.print("Mostre a soma dos numeros pares: ");

        int somaDosNumerosPares = numerosAleatorios.stream()
                                                    .mapToInt(Integer::parseInt)
                                                    .filter(i -> i % 2 == 0)
                                                    .sum();
        System.out.println(somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        numerosAleatorios.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream().collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);

    }
}