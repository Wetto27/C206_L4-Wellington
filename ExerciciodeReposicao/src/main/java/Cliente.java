public class Cliente {
private String nome;
private int id;
private static int cont;

public Cliente(String nome, int id) {
    this.nome = nome;
    this.id = id;
    cont++;
    System.out.println("Nome: " + this.nome);
    System.out.println("Id: " + this.id);
}


}
