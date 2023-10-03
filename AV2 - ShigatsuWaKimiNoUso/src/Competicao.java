public class Competicao {

    private Musico[] competidores = new Musico[4];

    //adicionando competidores
    public void addMusico(Musico musico){
        for (int i = 0; i < competidores.length; i++) {
            // conferindo se a posicao i ta vazia
            if(competidores[i] == null){
                competidores[i] = musico;
                break;
            }
        }
    }
    //listando competidores
    public void listarCompetidores(){
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] != null){
                if(competidores[i] instanceof Cellista){
                    Cellista auxCellista = (Cellista) competidores[i];
                    auxCellista.mostraInfo();
                    auxCellista.tocar();
                    auxCellista.desafinar();
                } else if (competidores[i] instanceof  Violinista) {
                    Violinista auxViolinista = (Violinista) competidores[i];
                    auxViolinista.mostraInfo();
                    auxViolinista.tocar();
                    auxViolinista.desafinar();
                }else{
                    Pianista auxPianista = (Pianista) competidores[i];
                    auxPianista.mostraInfo();
                    auxPianista.tocar();
                    auxPianista.tocarAcorde();
                    auxPianista.errarPausa();
                }
            }

        }
    }
}
