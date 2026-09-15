/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filme;

/**
 *
 * @author adryan61389566
 */
public class SistemaFilmes {

    public static void main(String[] args) {

        Filme filme1 = new Filme("Interestelar", "Christopher Nolan", "Ficção científica", 2014, 169, 8.7);

        Filme filme2 = new Filme("Titanic", "James Cameron", "Romance", 1997, 195, 7.9);

        Filme filme3 = new Filme("Jurassic Park", "Steven Spielberg", "Aventura", 1993, 127, 8.2);

        filme1.exibirInformacoes();
        filme2.exibirInformacoes();
        filme3.exibirInformacoes();

        Filme filme4 = new Filme("Oppenheimer", "Christopher Nolan", "Drama", 2023, 180, 8.6);

        filme4.exibirInformacoes();

        // Alterando a nota
        filme4.nota = 9.0;

        System.out.println("Depois da alteração:");
        filme4.exibirInformacoes();
    }
}
