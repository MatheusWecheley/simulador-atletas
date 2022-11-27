import java.math.BigDecimal;

public class DesempenhoAtletas {
    private String nomeAtleta;
    private Double desempenhos;

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public Double getDesempenhos() {
        return desempenhos;
    }

    public void setDesempenhos(Double desempenhos) {
        this.desempenhos = desempenhos;
    }

    public String toString() {
        return "Atleta: [nome=" + getNomeAtleta() + ", desempenhos = " + getDesempenhos()+ "] \n";
    }
}
