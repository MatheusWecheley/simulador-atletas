import Exceptions.ExceptionIdade;
import Exceptions.ExceptionLesoes;
import atletas.Atleta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static ManipuladorJson manipuladorJson = new ManipuladorJson();

    public static void main(String[] args) {

        List<Atleta> ginastas = manipuladorJson.lerArquivosGinastas();
        List<Atleta> nadadores = manipuladorJson.lerArquivosNadadores();
        List<Atleta> halterofilistas = manipuladorJson.lerArquivosHalterofilista();
        System.out.println("Iniciando simulação!");
        System.out.println("Ginastica: ");
        simularCompeticao(ginastas, "ginastica");
        System.out.println("=======================================================================================");
        System.out.println("Natação: ");
        simularCompeticao(nadadores, "natação");
        System.out.println("=======================================================================================");
        System.out.println("Halterofilistas: ");
        simularCompeticao(halterofilistas, "halterofilistas");
        System.out.println("=======================================================================================");
        System.out.println("Simulação finalizada");

    }

    private static void simularCompeticao(List<Atleta> atletas, String modalidade) {
        ListaInscricoesRejeitadas inscricoesRejeitadas = new ListaInscricoesRejeitadas();

            Competicao comp = new Competicao();
            for (Atleta atleta : atletas) {
                try {
                    comp.registrar(atleta);
                    Resultado resultado = new Resultado();
                    resultado.campeao(comp);
                    manipuladorJson.gravarResultado(resultado, modalidade);
                } catch (ExceptionLesoes exceptionLesoes) {
                    inscricoesRejeitadas.registrar(new InscricoesRejeitadas(atleta.getNome(), "Atleta com muitas lesões!"));
                } catch (ExceptionIdade exceptionIdade) {
                    inscricoesRejeitadas.registrar(new InscricoesRejeitadas(atleta.getNome(), exceptionIdade.getMessage()));
                }
            }
        System.out.println(comp.getAtletasInscritos());
        manipuladorJson.gravarListaInscricoesRejeitadas(inscricoesRejeitadas, modalidade);
    }
}