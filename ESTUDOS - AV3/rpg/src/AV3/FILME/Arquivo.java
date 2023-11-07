package AV3.FILME;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escreverArquivo(Filme filme){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do meu arquivo
            os = new FileOutputStream("Filmes.txt",true); // Arquivo

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Efetivamente escrevendo no arquivo
            bw.write("--- Filme ---\n"); // Flag
            bw.write(filme.getNomeFilme()+"\n");
            bw.write(filme.getGeneroFilme()+"\n");
            bw.write(filme.getDuracaoMin()+"\n");



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public ArrayList<Filme> lerArquivos(){
        // Criando array list que armazena os veículos encontrados no arquivo
        ArrayList<Filme> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try{
            is = new FileInputStream("Filmes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se já estamos na estrutura de um funcionário
                if(linhaLer.contains("--- Filme ---")){


                    // Criando um objeto auxiliar de Veículo
                    Filme auxFilme= new Filme();
                    auxFilme.setNomeFilme(br.readLine());
                    auxFilme.setGeneroFilme(br.readLine());
                    auxFilme.setDuracaoMin(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionário ao arrayList, para informar que encontrei o veículo
                    encontreiNoArquivo.add(auxFilme);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch (Exception e){

        }
        return encontreiNoArquivo;
    }

}
