package com.example.listapersonagem.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Personagem implements Serializable {

    //cria variaveis nome, altura e nascimento
    private String nome;
    private String altura;
    private String nascimento;
    //cria variavel id com valor de 0
    private int id = 0;

    public Personagem(String nome, String altura, String nascimento) {

        //colocando valores nas variaveis
        this.nome = nome;
        this.altura = altura;
        this.nascimento = nascimento;

    }

    public Personagem() {
    }

    //pegando os valores e sentando em cada variavel
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @NonNull
    @Override
    public String toString() {
        //retorna nome para aparecer na lista
        return nome;
    }

    //seta o valor da id
    public void setId(int id) {
        this.id = id;
    }

    //pega o valor da id
    public int getId() {
        return id;
    }

    // verifica o id se é valido, ou seja maior que 0
    public boolean IdValido(){
        return id>0;
    }
}
