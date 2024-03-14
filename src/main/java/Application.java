import Entiti.Studente;
import Service.StudenteService;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        StudenteService studenteService = new StudenteService();

        List<Studente> studentiFiltrati = studenteService.filtraStudenti("Luisa");
        if (studentiFiltrati.isEmpty()) {
            System.out.println("Nessuno studente trovato");
        } else {
            for (Studente s : studentiFiltrati) {
                System.out.println(s.getNome() + " " + s.getCognome());
            }
        }
    }
}

