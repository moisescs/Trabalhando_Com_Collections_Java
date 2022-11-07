package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(meusGatos);

        System.out.println("---\tOderm Aleatória\t ---");        
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOderm Natural\t ---"); 
        Collections.sort(meusGatos);      
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