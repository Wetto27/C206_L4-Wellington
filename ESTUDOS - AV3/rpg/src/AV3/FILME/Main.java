package AV3.FILME;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto de Arquivo
        Arquivo arq = new Arquivo();

        // Criando uma estrutura para entrada de dados
        Scanner sc = new Scanner(System.in);

        // Controladora do menu
        boolean executando = true;

        // Criando um objeto de Filme
        Filme filme = new Filme();


        while(executando){
            // Menu de informações
            System.out.println("--- BEM VINDO AO MENU DE CADASTRO DE FILMES ---");
            System.out.println("1 - Cadastrar filmes");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Ordenar os filmes de A-Z");
            System.out.println("4 - Ordenar os filmes de Z-A");
            System.out.println("5 - Sair");

            int op = sc.nextInt();
            sc.nextLine();
            ArrayList<Filme> filmes = arq.lerArquivos();
            // Menu
            switch (op){
                case 1:
                    // Coletando as informações do funcionário
                    System.out.println("Nome: ");
                    filme.setNomeFilme(sc.nextLine());
                    System.out.println("Genero: ");
                    filme.setGeneroFilme(sc.nextLine());


                    try {
                        System.out.println("Duração(min): ");
                        filme.setDuracaoMin(sc.nextInt());
                        if(filme.getDuracaoMin()<=0) {
                            throw new DuracaoNegativaException();
                        }

                    }catch (Exception e ){
                        break; // Parando a execução de salvar os valores

                    }
                    // Escrevendo o veículo no arquivo
                    arq.escreverArquivo(filme);
                    break;
                case 2:
                    // Executar o método de leitura
                    System.out.println("INFORMAÇÕES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("NOME: "+filmes.get(i).getNomeFilme());
                        System.out.println("GENERO: "+filmes.get(i).getGeneroFilme());
                        System.out.println("DURAÇÃO: " + filmes.get(i).getDuracaoMin()+ " minutos");
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(filmes);
                    System.out.println("INFORMAÇÕES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("NOME: " + filmes.get(i).getNomeFilme());
                        System.out.println("GENERO:: " + filmes.get(i).getGeneroFilme());
                        System.out.println("DURAÇÃO: " + filmes.get(i).getDuracaoMin()+ " minutos");
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    // Executar o método de leitura
                    // Ordenando em ordem crescente de ano
                    Collections.sort(filmes);
                    // Ordenando em ordem decrescente
                    Collections.reverse(filmes);
                    System.out.println("INFORMAÇÕES DOS FILMES");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println("NOME: " + filmes.get(i).getNomeFilme());
                        System.out.println("GENERO:: " + filmes.get(i).getGeneroFilme());
                        System.out.println("DURAÇÃO: " + filmes.get(i).getDuracaoMin()+ " minutos");
                        System.out.println(" ");
                    }

                    break;
                case 5:
                    // Sair do menu
                    executando=false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
