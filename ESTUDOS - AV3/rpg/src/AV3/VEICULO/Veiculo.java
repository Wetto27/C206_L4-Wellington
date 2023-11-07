package AV3.VEICULO;

import AV3.FILME.Filme;

public class Veiculo implements Comparable<Veiculo> {
    private String marca;
    private String modelo;
    private int ano;
    private double kmRodados;
    Motor motor;

    public Veiculo() {
        motor = new Motor();
    }

    @Override
    public int compareTo(Veiculo veic) {
        // Comparação com tipos literarais
        return Integer.compare(this.ano,veic.ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public void mostrarIndos(){

    }

}
