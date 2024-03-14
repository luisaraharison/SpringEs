package Utility;

import java.util.List;

import Entiti.Studente;

public class RicercaStudente {
    public static Studente cercaStudentePerNome(List<Studente> listaStudenti, String nome) {
        for (Studente studente : listaStudenti) {
            if (studente.getNome().equals(nome)) {
                return studente;
            }
        }
        throw new IllegalArgumentException("Nessuno studente trovato con il nome: " + nome);
    }
}
