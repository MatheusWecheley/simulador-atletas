package atletas;

import java.math.BigDecimal;

public class Halterofilista extends Atleta{

    public Double competir() {
        Double result = 1 + (getForca() * 1.0) + (getResistencia() * 0.6) + (getFolego() * 0.4 ) + (getFlexibilidade() * 0.3) - (getPeso() / 100 ) - (getNumeroLesoes() / 10);
        return result;
    }

    public String toString() {
        Double desempenho = competir();
        return "Atleta: [Nome=" + getNome() + ", Desempenho = " + desempenho + "] \n";
    }
}
