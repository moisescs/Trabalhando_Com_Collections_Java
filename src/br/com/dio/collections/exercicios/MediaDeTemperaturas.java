package br.com.dio.collections.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

/**
 * MediaDeTemperaturas
 */
public class MediaDeTemperaturas {
    public static void main(String[] args) {

        List<Temperatura> temperaturas = new ArrayList<>(){{
            add(new Temperatura(27.8, "1 - JANEIRO"));
            add(new Temperatura(39.0, "2 - FEVEREIRO"));
            add(new Temperatura(29.8, "3 - MARÇO"));
            add(new Temperatura(15.0, "4 - aBRIL"));
            add(new Temperatura(22.0, "5 - MAIO"));
            add(new Temperatura(29.0, "6 - JUNHO"));
    
        }};

        //Exibir soma das temperaturas e a media:
        Iterator<Temperatura> iterator = temperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next().getTemperatura();
            soma += next;
        }
        System.out.println("A média semestral da Temperaturas é: " + soma/6);

        //Exibir soma das temperaturas acima da média:");
        for (Temperatura temperatura : temperaturas) {
            if (temperatura.getTemperatura() > (soma/6)) System.out.println(temperatura.getMes()+ " " + temperatura.getTemperatura());;
        }
    }
}


class Temperatura {
    private Double temperatura;
    private String mes;

    public Temperatura (Double temperatura, String mes){
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
