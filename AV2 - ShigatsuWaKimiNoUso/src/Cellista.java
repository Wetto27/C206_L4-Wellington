public class Cellista extends Musico {

    private boolean sentado;

    @Override
    public void tocar() {
        System.out.println("O cellista " + nome + " esta tocando " + musica);
    }

    @Override
    public void mostraInfo() {
        System.out.println(" ");
        System.out.println("INFORMACOES DO CELLISTA");
        super.mostraInfo();
        if (sentado == true)
            System.out.println("O cellista esta sentado");
        else
            System.out.println("O cellista esta em pé");
    }

    public void desafinar() {
        float pontuacao = getPontuacao();

        pontuacao = (float) (pontuacao - (pontuacao * 0.05));
        System.out.println("Pontuacao final: " + pontuacao);
    }

    public boolean isSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }
}
