/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filme;

/**
 *
 * @author adryan61389566
 */
public class Filme {

    String titulo;
    String diretor;
    String genero;
    int anoLancamento;
    int duracao;
    double nota;

    public Filme(String titulo, String diretor, String genero, int anoLancamento, int duracao, double nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.nota = nota;
    }

    public int calcularIdade() {
        return 2026 - anoLancamento;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Nota: " + nota);
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("-----------------------------");
    }
}