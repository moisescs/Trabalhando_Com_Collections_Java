package br.com.dio.collections.map;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

public class PopulacaoNordeste {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: "); 
        Map<String, Integer> populacao  = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao + "\n");

        //-----------------------------------------------------------------------

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        populacao.put("RN", 3534165);
        System.out.println(populacao + "\n");

         //-----------------------------------------------------------------------

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277: ");
        if (!populacao.containsKey("PB")) {
            populacao.put("PB", 4039277);
        }
        System.out.println(populacao + "\n");

         //-----------------------------------------------------------------------

        System.out.println("Exiba a população do estado PE");
        System.out.println(populacao.get("PE") + "\n");

         //-----------------------------------------------------------------------

        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacao1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(populacao1 + "\n");

         //-----------------------------------------------------------------------

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
        System.out.println(populacao2 + "\n");

         //-----------------------------------------------------------------------


        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Integer> iterator = populacao2.values().iterator();
        int soma= 0;
        while (iterator.hasNext()) {
             soma += iterator.next();           
        }
        System.out.println(soma + "\n");

        //-----------------------------------------------------------------------
        System.out.println("Exiba o estado com a maior e a menor população: ");
        Collection<Integer> populacaototal = populacao1.values();
        String maiorPopulacao = "", menorPopulacao = "";
        for (Map.Entry<String, Integer> entry  : populacao1.entrySet()) {
            if(entry.getValue().equals(Collections.max(populacaototal))) maiorPopulacao = entry.getKey();
            if(entry.getValue().equals(Collections.min(populacaototal))) menorPopulacao = entry.getKey();
        }
        System.out.println("Estado com maior população: " + maiorPopulacao);
        System.out.println("Estado com maior população: " + menorPopulacao);
         //-----------------------------------------------------------------------

        System.out.println("Exiba a média da população deste dicionário de estados: ");
        System.out.println(soma/populacao.size() + "\n");

         //-----------------------------------------------------------------------
        
        System.out.println("Remova os estados com a população menor que 4.000.000: ");

        Iterator<Integer> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()) {
            if(iterator1.next() < 4000000) iterator1.remove();
        }
        System.out.println(populacao);

        //-----------------------------------------------------------------------

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacao.clear();
        System.out.println(populacao);



    }
    
}    



