package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira as notas");
        System.out.println("NP1");
        float np1 = teclado.nextFloat();
        System.out.println("NP2");
        float np2 = teclado.nextFloat();

        float media = (np1 + np2)/2;

        System.out.println("Média final: "+(int)media);
    }
}