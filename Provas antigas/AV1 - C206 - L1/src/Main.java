import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado();
        supermercado.nome = "Supermercado Prova";
        supermercado.cnpj = "01.234.567/0001-89";
        supermercado.endereco = "Rua do Supermercado";
        supermercado.numTelefone = "35 99966-6777";

        boolean controle = true;

        while (controle){
            System.out.println("Oque voce deseja fazer?");
            System.out.println("1 - Adicionar produtos");
            System.out.println("2 - Mostrar as informações do supermercado e de seus produtos");
            System.out.println("3 - Mostrar  a  quantidade  de  produtos  de  cada  categoria  cadastrados  no sistema");
            System.out.println("4 - Mostrar as informações do produto mais caro e do mais barato em estoque");
            System.out.println("5 - Sair");

            Produto produto = new Produto();
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Código de série: ");
                    produto.codigoSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome do produto: ");
                    produto.nome = sc.nextLine();
                    System.out.println("Categoria: Alimentícios - Utensílios - Higiene");
                    produto.categoria = sc.nextLine();
                    System.out.println("Quantidade: ");
                    produto.quantidade = sc.nextInt();
                    System.out.println("Valor: ");
                    produto.valor = sc.nextDouble();
                    supermercado.addProduto(produto);
                    break;
                case 2:
                    System.out.println("Informações do supermercado: ");
                    supermercado.mostraInfo();
                    break;
                case 3:
                    System.out.println("Quantidade de produtos de cada categoria: ");
                    supermercado.contarCategorias();
                    break;
                case 4:
                    System.out.println("Informações do produto mais caro e do mais barato em estoque: ");
                    supermercado.mostrarMaisCaroBarato();
                    break;
                case 5:
                    controle = false;
                    break;
            }
        }

    }
}
