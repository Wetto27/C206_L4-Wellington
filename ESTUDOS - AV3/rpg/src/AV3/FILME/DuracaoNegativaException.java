package AV3.FILME;

public class DuracaoNegativaException extends Exception {
    public DuracaoNegativaException() {
        System.out.println("Não é permitido cadastrar filmes com duração nula, ou menor que 0");
    }
}


