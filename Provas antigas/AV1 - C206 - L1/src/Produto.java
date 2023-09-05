public class Produto {

    int codigoSerie;
    String nome;
    String categoria;
    int quantidade;
    double valor;

    void mostrarInfos()
    {
        System.out.println("Cogigo serie: "+codigoSerie);
        System.out.println("nome: "+nome);
        System.out.println("categoria: "+categoria);
        System.out.println("quantidade: "+quantidade);
        System.out.println("valor: "+valor);
    }
}
