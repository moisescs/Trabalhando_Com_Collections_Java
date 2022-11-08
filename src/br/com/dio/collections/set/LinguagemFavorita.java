package br.com.dio.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavorita {
    public static void main(String[] args) {
        System.out.println("Ordem de inserção");
        Set<Linguagem> linguagem = new LinkedHashSet<>(){{
            add(new Linguagem("Java", 1991, "Ecplise"));
            add(new Linguagem("Python", 1989, "PyCham"));
            add(new Linguagem("C#", 2002, "Visual Studio"));
        }};
        System.out.println(linguagem);

//---------------------------------------------------------------------------------

        System.out.println("\nb) Ordem natural(nome)");
        Set<Linguagem> linguagem1 = new TreeSet<>(linguagem);
        System.out.println(linguagem1.toString());

    }
}


class Linguagem implements Comparable<Linguagem>{

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public Linguagem(String nome, int anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "Ano de Criação: " + getAnoDeCriacao() + "Ide: " + getIde() + "\n";
    }
    @Override
    public int compareTo(Linguagem l) {
        return this.getNome().compareTo(l.getNome());
    }

    public int compareToIde(Linguagem l) {
        return this.getIde().compareTo(l.getIde());
    }


}