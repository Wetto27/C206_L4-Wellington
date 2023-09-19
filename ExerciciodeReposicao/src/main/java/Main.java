import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta c1 = new Conta();

        System.out.println("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Id do cliente: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("0- sair");
        System.out.println("1- depositar");
        System.out.println("2- sacar");
        System.out.println("3- extrato");


        boolean controle = true;

        while (controle) {
            int opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 0:
                    controle = false;
                    break;
                case 1:
                    System.out.println("valor a ser depositado: ");
                    int dep = sc.nextInt();
                    sc.nextLine();
                    c1.deposita(dep);
                    System.out.println("0- sair");
                    System.out.println("1- depositar");
                    System.out.println("2- sacar");
                    System.out.println("3- extrato");
                    break;
                case 2:
                    System.out.println("valor a ser sacado: ");
                    int sac = sc.nextInt();
                    sc.nextLine();
                    c1.saca(sac);
                    System.out.println("0- sair");
                    System.out.println("1- depositar");
                    System.out.println("2- sacar");
                    System.out.println("3- extrato");
                    break;
                case 3:
                    System.out.println("extrato: ");
                    Cliente cliente1 = new Cliente(nome, id);
                    c1.extrato();
                    System.out.println("0- sair");
                    System.out.println("1- depositar");
                    System.out.println("2- sacar");
                    System.out.println("3- extrato");
                    break;
                default:
                    System.out.println("opcao invalida!!!");
                    System.out.println("0- sair");
                    System.out.println("1- depositar");
                    System.out.println("2- sacar");
                    System.out.println("3- extrato");
                    break;
            }
        }


    }
}
