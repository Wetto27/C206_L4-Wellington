public class Violinista extends Musico {

    private String marcaBreu;
    private boolean usaEspaleira;

    public void desafinar(){
        float pontuacao = getPontuacao();

        if(usaEspaleira == true){
            pontuacao = (float) (pontuacao - (pontuacao * 0.05));
        }
        else{
            pontuacao = (float) (pontuacao - (pontuacao * 0.10));
        }
        System.out.println("Pontuacao final: " + pontuacao);
    }

    @Override
    public void tocar(){
        System.out.println("O violinista " + nome + " esta tocando " + musica);
    }

    @Override
    public void mostraInfo(){
        System.out.println(" ");
        System.out.println("INFORMACOES DO VIOLINISTA");
        super.mostraInfo();
        System.out.println("Marca do Breu: " + marcaBreu);
        System.out.println("Usa espaleira: " + usaEspaleira);

    }


    public String getMarcaBreu() {
        return marcaBreu;
    }

    public void setMarcaBreu(String marcaBreu) {
        this.marcaBreu = marcaBreu;
    }

    public boolean isUsaEspaleira() {
        return usaEspaleira;
    }

    public void setUsaEspaleira(boolean usaEspaleira) {
        this.usaEspaleira = usaEspaleira;
    }
}
