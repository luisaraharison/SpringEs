package Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Entiti.Studente;
import Entiti.TitoloDiStudio;

public class StudenteService {
    private List<Entiti.Studente> listaStudenti;

    public StudenteService() {
        this.listaStudenti = new ArrayList<>();
    }

    public void aggiungiStudente(String nome, String cognome, LocalDateTime dataDiNascita, TitoloDiStudio titoloDiStudio) {
        Studente studente = new Studente(nome, cognome, dataDiNascita, titoloDiStudio);
        listaStudenti.add(studente);
    }

     public void modificaStudente(String nome, String cognome, LocalDateTime dataDiNascita, TitoloDiStudio titoloDiStudio, int indice) {
        if (indice >= 0 && indice < listaStudenti.size()) {
            Studente studente = listaStudenti.get(indice);
            studente.setNome(nome);
            studente.setCognome(cognome);
            studente.setDatadiNascita(dataDiNascita);
            studente.setTitoloDiStudio(titoloDiStudio);
        } else {
            System.out.println("Indice non valido");
        }
    }

    public void eliminaStudente(int indice) {
        if (indice >= 0 && indice < listaStudenti.size()) {
            listaStudenti.remove(indice);
        } else {
            System.out.println("Indice non valido");
        }
    }

    public List<Studente> filtraStudenti(String nome) {
        List<Studente> studentiFiltrati = new ArrayList<>();
        for (Studente studente : listaStudenti) {
            if (studente.getNome().equalsIgnoreCase(nome)) {
                studentiFiltrati.add(studente);
            }
        }
        return studentiFiltrati;
    }
}
 




