import Exceptions.ExceptionIdade;
import Exceptions.ExceptionLesoes;
import atletas.Atleta;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
public class Competicao {
    private List<Atleta> atletasInscritos = new ArrayList<>();
    ManipuladorJson manipuladorJson = new ManipuladorJson();

    public void registrar(Atleta atleta) {
        int idade = calcularIdade(atleta);

        if(atleta.getNumeroLesoes() > 10) {
            throw new ExceptionLesoes();
        }else if (idade < 18) {
            throw new ExceptionIdade("Atleta com idade menor que 18 anos!");
        } else if(idade >= 46) {
            throw new ExceptionIdade("Atleta com idade maior que o permitido (46)!");
        } else{
            atletasInscritos.add(atleta);
        }
    }
    public List<Atleta> getAtletasInscritos() {
        return atletasInscritos;
    }

    public int calcularIdade(Atleta atleta) {
        String[] diaMesAno = atleta.getDataNascimento().split("/");
        int dia = Integer.parseInt(diaMesAno[0]);
        int mes = Integer.parseInt(diaMesAno[1]);
        int ano = Integer.parseInt(diaMesAno[2]);
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        return idade;
      }
}
