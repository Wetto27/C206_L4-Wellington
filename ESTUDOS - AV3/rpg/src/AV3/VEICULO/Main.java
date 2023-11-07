package AV3.VEICULO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto de Arquivo
        AV3.VEICULO.Arquivo arq = new AV3.VEICULO.Arquivo();

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Controladora do menu
        boolean executando = true;

        // Criando um objeto de Filme
        Veiculo veiculo = new Veiculo();

        int qtdRR = 0;
        int qtdBentley = 0;

        while (executando) {
            // Menu de informações
            System.out.println("--- BEM VINDO AO MENU DE CADASTRO DE VEICULOS ---");
            System.out.println("1 - Cadastrar veiculos");
            System.out.println("2 - Listar veiculos");
            System.out.println("3 - Ordenar os veículos em ordem decrescente de ano");
            System.out.println("4 - Mostrar a quantidade de veículos de cada marca disponíveis em estoque");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Veiculo> veiculos = arq.lerArquivos();
            // Menu
            switch (op) {
                case 1:
                    // Coletando as informações do funcionário
                    System.out.println("Modelo: ");
                    veiculo.setModelo(sc.nextLine());
                    System.out.println("Marca: ");
                    veiculo.setMarca(sc.nextLine());


                    try {
                        System.out.println("Ano: ");
                        veiculo.setAno(sc.nextInt());
                        if (veiculo.getAno() <= 1960 || veiculo.getAno() >= 2024) {
                            throw new ValorInvalidoException();
                        }
                        System.out.println("KM Rodados: ");
                        veiculo.setKmRodados(sc.nextDouble());
                        if (veiculo.getKmRodados() < 0) {
                            throw new ValorInvalidoException();
                        }
                        System.out.println("Potencia: ");
                        veiculo.motor.setPotencia(sc.nextDouble());
                        if (veiculo.motor.getPotencia() <= 0) {
                            throw new ValorInvalidoException();
                        }
                        System.out.println("NUMERO DE CILINDROS: ");
                        veiculo.motor.setNumCilindros(sc.nextInt());
                        if (veiculo.motor.getNumCilindros() <= 0) {
                            throw new ValorInvalidoException();
                        }

                    } catch (Exception e) {
                        break; // Parando a execução de salvar os valores
                    }
                    // Escrevendo o veículo no arquivo
                    arq.escreverArquivo(veiculo);
                    break;
                case 2:
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DOS VEICULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("MODELO: " + veiculos.get(i).getModelo());
                        System.out.println("MARCA: " + veiculos.get(i).getMarca());
                        System.out.println("ANO: " + veiculos.get(i).getAno());
                        System.out.println("KM RODADOS: " + veiculos.get(i).getKmRodados());
                        System.out.println("POTENCIA: " + veiculos.get(i).motor.getPotencia());
                        System.out.println("NUMERO DE CILINDROS: V" + veiculos.get(i).motor.getNumCilindros());
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(veiculos, Collections.reverseOrder());
                    System.out.println("INFORMAÇÕES DOS VEICULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        System.out.println("MODELO: " + veiculos.get(i).getModelo());
                        System.out.println("MARCA: " + veiculos.get(i).getMarca());
                        System.out.println("ANO: " + veiculos.get(i).getAno());
                        System.out.println("KM RODADOS: " + veiculos.get(i).getKmRodados());
                        System.out.println("POTENCIA: " + veiculos.get(i).motor.getPotencia());
                        System.out.println("NUMERO DE CILINDROS: V" + veiculos.get(i).motor.getNumCilindros());
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(veiculos);
                    // Ordenando em ordem decrescente
                    Collections.reverse(veiculos);
                    System.out.println("INFORMAÇÕES DOS VEICULOS");
                    for (int i = 0; i < veiculos.size(); i++) {
                        if (veiculos.get(i).getMarca().equals("Rolls-Royce")) {
                            qtdRR++;
                        }
                        else if(veiculos.get(i).getMarca().equals("Bentley")){
                            qtdBentley++;
                        }
                    }
                    System.out.println("Quantidade de Rolls-Royce disponiveis: "+qtdRR);
                    System.out.println("Quantidade de Bentley disponiveis: "+qtdBentley);

                    break;
                case 5:
                    // Sair do menu
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
