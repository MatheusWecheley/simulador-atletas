import atletas.Atleta;
import atletas.Ginasta;
import atletas.Halterofilista;
import atletas.Nadador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorJson {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public List<Atleta> lerArquivosGinastas() {
        List<Atleta> ginastas = new ArrayList<>();

        try {
            FileReader reader = new FileReader("ginastas.json");
            ginastas = gson.fromJson(reader, new TypeToken<ArrayList<Ginasta>>(){}.getType());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ginastas;
    }

    public List<Atleta> lerArquivosNadadores() {
        List<Atleta> nadadores = new ArrayList<>();

        try {
            FileReader reader = new FileReader("nadadores.json");
            nadadores = gson.fromJson(reader, new TypeToken<ArrayList<Nadador>>(){}.getType());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nadadores;
    }

    public List<Atleta> lerArquivosHalterofilista() {
        List<Atleta> halterofilista = new ArrayList<>();

        try {
            FileReader reader = new FileReader("halterofilistas.json");
            halterofilista = gson.fromJson(reader, new TypeToken<ArrayList<Nadador>>(){}.getType());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return halterofilista;
    }

    public void gravarResultado(Resultado resultado, String competicao) {
        try {
            FileWriter writer = new FileWriter("resultado-" + competicao + ".json");
            this.gson.toJson(resultado, writer);
            writer.close();
            } catch (Exception e) {
            System.out.println("Erro ao gravar arquivo");
            }
    }

    public void gravarListaInscricoesRejeitadas(ListaInscricoesRejeitadas lista, String modalidade) {
    try {
        FileWriter writer = new FileWriter("inscricoes-negadas-" + modalidade + ".json");
        this.gson.toJson(lista, writer);
        writer.close();
    } catch (java.io.IOException e) {
        System.out.println("Erro ao gravar arquivo");
    }
}
}


