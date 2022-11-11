package br.com.dio.collections.map;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class JogoDeDados {
    public static void main(String[] args) {
      
    System.out.println("Lance o dado 100 vezes e armazene.");
    int rodada = 100;
    List<Integer> valores = new ArrayList<>();
    Random numero = new Random();

    while(rodada > 0){
        valores.add(numero.nextInt(6)+ 1);
        rodada--;
    }
    System.out.println(valores.toString());

    //-------------------------------------------------------------------

    Map<Integer, Integer> lancamentos = new HashMap<>();
    for(Integer valor: valores){
        if (lancamentos.containsKey(valor)) {
            lancamentos.put(valor, (lancamentos.get(valor) + 1));
        }else lancamentos.put(valor, 1);
    }
    System.out.println("\nValor " + " Quant. de vezes");
    for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
        System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
    }
}
    
}