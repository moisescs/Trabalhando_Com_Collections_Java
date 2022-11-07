package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ExemploOrdenacaoList
 * 
 */
public class ExemploOrdenacaoList {

    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("---\tOderm de Inserção\t ---");
        // Para imprimir os valores dos objetos é necessário implementar os ToString, caso contrário vai imprimir apenas um endereço de memória.
        System.out.println(meusGatos);

        System.out.println("---\tOderm Aleatória\t ---");
        // O Collections.shuffle(meusGatos) serve para miturar/ embaralhar os intens na lista;       
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOderm Natural\t ---");  
        Collections.sort(meusGatos);      
        System.out.println(meusGatos);

        System.out.println("---\tOderm Por Idade\t ---"); 
        // ComparatorIdade é a classe que implementa a inteface Comparator<Gato> onde tem a logica de comparação por idade;
        Collections.sort(meusGatos, new ComparatorIdade());
       // meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);


        System.out.println("---\tOderm Por Cor\t ---"); 
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("---\tOderm Por Cor/Idade/Nome\t ---"); 
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

        

    }

}

/**
 * InnerExemploOrdenacaoList
 */
class Gato implements Comparable<Gato> {

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Integer return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /**
     * @return String return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" + 
        "nome = " + nome + " " +
        "idade = " + idade + " " +
        "cor = " + cor + " " +
        "}" ;
    }



    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}