import atletas.Atleta;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private DesempenhoAtletas atletaCampeao;
    private int numAtletasParticipantes;
    private List<DesempenhoAtletas> desempenho = new ArrayList<>();

    public DesempenhoAtletas campeao(Competicao comp) {
        List<Atleta> atletaList = comp.getAtletasInscritos();
        setNumAtletasParticipantes(comp.getAtletasInscritos().size());
        Double resultado = 0.0;
        for (Atleta atleta : atletaList) {
            verificarDesempenho(atleta.getNome(), atleta.competir());
        }

        for(DesempenhoAtletas atletas : desempenho) {
            if(atletas.getDesempenhos() > resultado) {
                resultado = atletas.getDesempenhos();
                setAtletaCampeao(atletas);
            }
        }
        return getAtletaCampeao();
    }

    private void verificarDesempenho(String nomeAtleta, Double desempenhoAtletas) {
        DesempenhoAtletas desemp = new DesempenhoAtletas();
        desemp.setNomeAtleta(nomeAtleta);
        desemp.setDesempenhos(desempenhoAtletas);
        desempenho.add(desemp);
    }

    public DesempenhoAtletas getAtletaCampeao() {
        return atletaCampeao;
    }

    public void setAtletaCampeao(DesempenhoAtletas atletaCampeao) {
        this.atletaCampeao = atletaCampeao;
    }

    public int getNumAtletasParticipantes() {
        return numAtletasParticipantes;
    }

    public void setNumAtletasParticipantes(int numAtletasParticipantes) {
        this.numAtletasParticipantes = numAtletasParticipantes;
    }

    public List<DesempenhoAtletas> getDesempenho() {
        return desempenho;
    }
}
