public class Pianista extends Musico implements Tempo, Tecnica {

    private float alturaBanco;

    @Override
    public void tocar(){
        System.out.println("O pianista " + nome + " esta tocando " + musica);
    }

    @Override
    public void tocarAcorde(){
        System.out.println("O pianista "+ nome + " tocou um acorde");
    }
    @Override
    public void mostraInfo(){
        System.out.println(" ");
        System.out.println("INFORMACOES DO PIANISTA");
        super.mostraInfo();
        System.out.println("Altura do banco: "+ this.alturaBanco+"cm");

    }

    public void errarPausa(){
        float pontuacao = getPontuacao();
        pontuacao = pontuacao-25;
        System.out.println("O pianista vai recomecar a musica");
        System.out.println("Pontuacao final: " + pontuacao);
    }

    public float getAlturaBanco() {
        return alturaBanco;
    }

    public void setAlturaBanco(float alturaBanco) {
        this.alturaBanco = alturaBanco;
    }
}
