package br.com.dio.collections.set;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        // o  HashSet não guarda a ordem de inserção e não aceita valores duplicados
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        // no Tipo set não há indices para pegar valores por posição.
       
        System.out.println("Verificar se  um valor está no set: " + notas.contains(5d));

        System.out.println("Ëxiba a menor nota: " + Collections.min(notas)); 
        System.out.println("Ëxiba a Maior nota: " + Collections.max(notas));  
        
        System.out.println("Soma dos valores: ");   
        Iterator<Double> iterator = notas.iterator(); 
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);   


        System.out.println("Quantade de notas/elementos do set " + notas.size());

        System.out.println("Media da soma dos elementos do set " + soma / notas.size());

        System.out.println("Remover um elemnto do set: " + notas.remove(8.5) + notas.toString());

        System.out.println("Remover os eslementos menores que 7 e exibir da lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        // LinkedHashSet matem os valores da ordem se inserção, e não aceita valores duplicados
        System.out.println("axibir os valores na ordem informada: ");
        Set <Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);


        // TreeSet insere os valores em ordem crescente ou alfabetica;
        System.out.println("Exbir valores na ordem crescente:");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }

    
}
