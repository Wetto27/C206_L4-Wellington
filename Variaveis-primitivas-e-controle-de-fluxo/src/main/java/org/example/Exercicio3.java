package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de combustivel em litros: ");
        double combustivel = teclado.nextDouble();
        System.out.println("Insira o tipo de combustível: Gasolina, Alcool");
        teclado.nextLine();
        String tipoCombustivel = teclado.nextLine();
        char opcao = tipoCombustivel.charAt(0);
        double precoLitro = 0;

        switch (opcao){
            case 'G':
                precoLitro = 4.90;
                if(combustivel <= 20) {
                    precoLitro *= (1 - 0.04);
                }
                else {
                    precoLitro *= (1 - 0.06);
                }
                break;
            case 'A':
                precoLitro = 6.00;
                if(combustivel <=20) {
                    precoLitro *= (1 - 0.03);
                }
                else {
                    precoLitro *= (1 - 0.05);
                }
                break;
            default:
                System.out.println("Entrada inválida");
                break;
        }
        double precoFinal = precoLitro * combustivel;

        System.out.println("Valor total: R$"+precoFinal);

    }
}