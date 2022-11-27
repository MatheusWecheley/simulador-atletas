package atletas;

public class Ginasta extends Atleta {

    @Override
    public Double competir() {
        Double result =
                1 + (getForca() * 0.6) + (getResistencia() * 0.6) + (getFolego() * 0.5 ) + (getFlexibilidade() * 1.0) - (getPeso() / 100 ) - (getNumeroLesoes() / 10);
        return result;

    }

    public String toString() {
        Double desempenho = competir();
        return "Atleta: [Nome=" + getNome() + ", Desempenho = " + desempenho + "] \n";
    }
}
