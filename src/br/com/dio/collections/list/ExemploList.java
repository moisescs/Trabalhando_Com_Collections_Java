package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * ExemploList
 */
public class ExemploList {
    public static void main(String[] args) {

        // List notas = new ArrayList<>();
        // List <Double> notas = new ArrayList<Double>();
        // ArrayList notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        
        /*List <Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Dessa forma não é possivel adionar/remover novos elementos;
        notas.add(10d);
        System.out.println(notas); */

        /* List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //Dessa forma não é possivel adionar/remover novos elementos;
        notas.add(10d);
        notas.remove(5d);
        System.out.println(notas); */

        // Criando uma lista de 7 notas;
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(5.0);
        notas.add(8.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        //Exibindo a posiçãoda nota 5
        System.out.println( "exibindo a posição da nota 5: " + notas.indexOf(5d) ); // retonar a posição do elemento;

        //Adionando na lista a nota 8.0 na posição 4
        notas.add(4, 8d);
        System.out.println(notas);

        // subistituindo a nota 5.0 por 6.0
        System.out.println(notas);
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //confira se nota foi substituida na lista
        System.out.println(notas.contains(5d)); // Retorna um bulean

        // imprimeir a lsita em ordem de inserção:
        for (Double nota : notas) {
            System.out.println(nota);
        }


        //exbir a terceira nota
        System.out.println(notas.get(2));

        //exibir a menor nota
        System.out.println("Exibir a menor nota:");
        System.out.println(Collections.min(notas));

        //exibir a Maior nota 
        System.out.println("Exibir a maior nota:");
        System.out.println(Collections.max(notas));

        //Exibir soma das notas e a media:
        System.out.println("Exibir a soma e média das notas:");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + soma/notas.size());

        System.out.println("Revovendo as notas menor que 7 e exibindo a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista");
        notas.clear();
        ;

    }

}