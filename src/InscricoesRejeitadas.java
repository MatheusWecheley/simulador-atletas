public class InscricoesRejeitadas {
    private String nomeAtleta;
    private String motivo;

    public InscricoesRejeitadas(String nomeAtleta, String motivo) {
        this.nomeAtleta = nomeAtleta;
        this.motivo = motivo;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
