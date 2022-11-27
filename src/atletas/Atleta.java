package atletas;

public abstract class Atleta {
    private String nome;
    private String dataNascimento;
    private double peso;
    private double flexibilidade;
    private double resistencia;
    private double folego;
    private double forca;
    private int numeroLesoes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getFlexibilidade() {
        return flexibilidade;
    }

    public void setFlexibilidade(double flexibilidade) {
        this.flexibilidade = flexibilidade;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getFolego() {
        return folego;
    }

    public void setFolego(double folego) {
        this.folego = folego;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public int getNumeroLesoes() {
        return numeroLesoes;
    }

    public void setNumeroLesoes(int numeroLesoes) {
        this.numeroLesoes = numeroLesoes;
    }

    public abstract Double competir();
}
