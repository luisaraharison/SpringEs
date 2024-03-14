package Entiti;
import java.time.LocalDateTime;

public class Studente extends Persona {
    private TitoloDiStudio titoloDiStudio;

    public Studente(String nome, String cognome, LocalDateTime dataDiNascita, TitoloDiStudio titoloDiStudio) {
        super(nome, cognome, dataDiNascita);
        this.titoloDiStudio = titoloDiStudio;
    }

    public TitoloDiStudio getTitoloDiStudio() {
        return titoloDiStudio;
    }

    public void setTitoloDiStudio(TitoloDiStudio titoloDiStudio) {
        this.titoloDiStudio = titoloDiStudio;
}
}
