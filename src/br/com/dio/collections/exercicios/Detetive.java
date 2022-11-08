package br.com.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Detetive
 */
public class Detetive {

    public static void main(String[] args) {
        List<Depoimento> Depoimentos = new ArrayList<>(){{
            add(new Depoimento("1 - Telefonou para a Vitima? "));
            add(new Depoimento("2 - Esteve no local com a Vitima? "));
            add(new Depoimento("3 - Mora Perto da Vitima? "));
            add(new Depoimento("4 - Devia para a Vitima? "));
            add(new Depoimento("5 - Já tabalhou com a Vitima? "));
        }};

        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (Depoimento depoimento : Depoimentos) {
            System.out.println(depoimento.getPergunta());
            depoimento.setResposta(sc.nextLine());
            if (depoimento.getResposta().equalsIgnoreCase("SIM")) count++;
        }
        
        if (count == 5) System.out.println("Assassino!" + Depoimentos);
        else if (count == 3 || count == 4 )  System.out.println("Cúmplice!" + Depoimentos);
        if (count == 2)  System.out.println("Suspeito!" + Depoimentos);
        else System.out.println("Inocente! " + Depoimentos);


    }
}



class Depoimento {
    private String pergunta;
    private String resposta;
    
    public Depoimento(String pergunta){
        this.pergunta = pergunta;

    }
    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return "\n " + getPergunta() + "\n " + getResposta() + "\n ";
    }

}