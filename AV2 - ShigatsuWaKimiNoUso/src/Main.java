public class Main {
    public static void main(String[] args) {

        Competicao competicao = new Competicao();

        Instrumento inst1 = new Instrumento();
        inst1.setModelo("Antoni Marsale");
        inst1.setCor("Madeira");
        inst1.setAno(2008);

        Instrumento inst2 = new Instrumento();
        inst2.setModelo("Zion");
        inst2.setCor("Preto");
        inst2.setAno(2019);

        Instrumento inst3 = new Instrumento();
        inst3.setModelo("Toyvian");
        inst3.setCor("Branco");
        inst3.setAno(2000);

        Cellista cellista = new Cellista();
        cellista.setNome("Joaquim");
        cellista.setIdade(26);
        cellista.setMusica("Dança kuduro");
        cellista.setPontuacao(100);
        cellista.setSentado(true);
        cellista.instrumento = inst1;

        Violinista violinista = new Violinista();
        violinista.setNome("Kaori");
        violinista.setIdade(14);
        violinista.setMusica("Viva la vida");
        violinista.setPontuacao(100);
        violinista.setUsaEspaleira(true);
        violinista.setMarcaBreu("Pirastro Schwarz");
        violinista.instrumento = inst2;

        Pianista pianista = new Pianista();
        pianista.setNome("Arima");
        pianista.setIdade(14);
        pianista.setMusica("Jerry");
        pianista.setPontuacao(100);
        pianista.setAlturaBanco(45f);
        pianista.instrumento = inst3;

        competicao.addMusico(cellista);
        competicao.addMusico(violinista);
        competicao.addMusico(pianista);

        competicao.listarCompetidores();

    }
}
