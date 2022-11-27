package atletas;

import java.math.BigDecimal;

public class Nadador extends Atleta{

    public Double competir() {
        Double result = 1 + (getForca() * 0.5) + (getResistencia() * 0.6) + (getFolego() * 1.0 ) + (getFlexibilidade() * 0.3) - (getPeso() / 100 ) - (getNumeroLesoes() / 10);
        return result;
    }

    public String toString() {
        Double desempenho = competir();
        return "Atleta: [Nome=" + getNome() + ", Desempenho = " + desempenho + "]\n";
    }
}
