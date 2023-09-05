public class Supermercado {

    String nome;
    String cnpj;
    String endereco;
    String numTelefone;

    Produto[] produtos = new Produto[31];

    void addProduto(Produto p) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                produtos[i] = p;
                break;
            }
        }
    }

    void mostrarMaisCaroBarato() {

        // variaveis para auxiliar na demonstracao das informacoes do produto mais caro e do mais barato
        int contMaisCaro = 0;
        int contMaisBarato = 0;
        double valorAux = 0;
        double valorAux2 = 999999999;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].valor > valorAux) {
                    valorAux = produtos[i].valor;
                    contMaisCaro = i;
                }
                else if (produtos[i].valor < valorAux2) {
                    valorAux2 = produtos[i].valor;
                    contMaisBarato = i;
                }
            }
        }
        System.out.println("Produto mais caro");
        produtos[contMaisCaro].mostrarInfos();
        System.out.println(" ");
        System.out.println("Produto mais barato");
        produtos[contMaisBarato].mostrarInfos();
    }

    void contarCategorias() {
        int contHigiene = 0;
        int contAlimenticios = 0;
        int contUtensilios = 0;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                if (produtos[i].categoria.equalsIgnoreCase("higiene")) {
                    contHigiene++;
                } else if (produtos[i].categoria.equalsIgnoreCase("alimentícios") || produtos[i].categoria.equalsIgnoreCase("alimenticios")) {
                    contAlimenticios++;
                } else if (produtos[i].categoria.equalsIgnoreCase("utensílios") || produtos[i].categoria.equalsIgnoreCase("utensilios")) {
                    contUtensilios++;
                }
            }
        }
        System.out.println("Produtos de higiene: "+contHigiene);
        System.out.println("Produtos de utensílios: "+contUtensilios);
        System.out.println("Produtos de alimenticios: "+contAlimenticios);
    }

    void mostraInfo() {
        System.out.println("Nome: "+nome);
        System.out.println("CNPJ: "+cnpj);
        System.out.println("Endereco: "+endereco);
        System.out.println("Telefone: "+numTelefone);
        System.out.println(" ");
        System.out.println("Informações dos Produtos: ");
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null){
                produtos[i].mostrarInfos();
                System.out.println(" ");
            }

        }
    }

}
