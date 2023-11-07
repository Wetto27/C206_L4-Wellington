package AV3.FILME;

public class Filme implements Comparable<Filme> {
    private String nomeFilme;
    private String generoFilme;
    private int duracaoMin;

    @Override
    public int compareTo(Filme film) {
        // Comparação com tipos literarais
        return this.nomeFilme.compareTo(film.nomeFilme);
    }
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
}
