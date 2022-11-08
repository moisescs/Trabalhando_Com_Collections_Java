package br.com.dio.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ArcoIres {
    public static void main(String[] args) {

        //a) Exiba todas as cores o arco-íris uma abaixo da outra;
        Set<String> cores = new LinkedHashSet<>(); ; // LinkedHashSet matem a ordem de inserção;
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        for (String cor : cores) {
            System.out.println(cor);
            
        }

        //b) A quantidade de cores que o arco-íris tem;
        System.out.println("--\tA quantidade de itens da Lista\t--"); 
        System.out.println("O Arco-ires tem " + cores.size() + " cores");

        //c) Exiba as cores em ordem alfabética;
        System.out.println("--\tOrdem de Natural(Alfabetica/Numerica)\t--"); 
        Set<String> cores1 = new TreeSet<>(cores);
        for (String cor : cores1) {
            System.out.println(cor);
        }
        //d) Exiba as cores na ordem inversa da que foi informada;

        System.out.println("--\tOrdem Inversa da Lista\t--"); 
        List<String> coresOrdemInversa = new ArrayList<>(cores);
        Collections.reverse(coresOrdemInversa);
        System.out.println(cores);    
        System.out.println(coresOrdemInversa);

        //e) Exiba todas as cores que começam com a letra ”v”;
        System.out.println("--\tItens que começam com V\t--"); 
        for (String cor : cores) {
            if(cor.startsWith("V")) System.out.println(cor);
        }

        //f) Remova todas as cores que não começam com a letra “v”;
        System.out.println("--\tRemovendo Itens que começam com V\t--"); 
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            if (iterator.next().startsWith("V")) iterator.remove();
        }
        System.out.println(cores);


        //g) Limpe o conjunto;
        System.out.println("--\tLimpando o conjunto\t--");
        cores.clear();
        System.out.println(cores);

        //h) Confira se o conjunto está vazio;
    }

    
}