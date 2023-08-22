package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        double numero1 = teclado.nextDouble();
        System.out.println("Segundo numero: ");
        double numero2 = teclado.nextDouble();
        System.out.println("Escolha a operação: soma, subtração, divisão, multiplicação, potenciação");
        teclado.nextLine();
        String operacao = teclado.nextLine();
        double resultado = 0;

        switch (operacao){
            case "soma":
                resultado = numero1 + numero2;
                break;
            case "subtração":
                resultado = numero1 - numero2;
                break;
            case "multiplicação":
                resultado = numero1 * numero2;
                break;
            case "divisão":
                resultado = numero1 / numero2;
                break;
            case "potenciação":
                resultado = Math.pow(numero1,numero2);
                break;
            default:
                System.out.println("Opereção inválida");
                break;
        }
        System.out.println("Resultado: "+resultado);
    }
}