import java.util.ArrayList;

public class ListaInscricoesRejeitadas {
    private int numeroInscricoesRejeitadas = 0;
   private ArrayList<InscricoesRejeitadas> inscricoesRejeitadas = new ArrayList<>();

     public void registrar(InscricoesRejeitadas inscricoes) {
         this.numeroInscricoesRejeitadas++;
         this.inscricoesRejeitadas.add(inscricoes);
     }

    public ArrayList<InscricoesRejeitadas> getInscricoesNegadas() {
        /* 16 */     return this.inscricoesRejeitadas;
        /*    */   }

    public void setInscricoesNegadas(ArrayList<InscricoesRejeitadas> inscricoesNegadas) {
         this.inscricoesRejeitadas = inscricoesNegadas;
     }

     public void setNumeroInscricoesRejeitadas(int numeroInscricoesNegadas) {
         this.numeroInscricoesRejeitadas = numeroInscricoesNegadas;
    }

    public int getNumeroInscricoesRejeitadas() {
        /* 28 */     return this.numeroInscricoesRejeitadas;
        /*    */   }
}
