package Entiti;
import java.time.LocalDateTime;

public class Persona {
    private String nome;
    private String cognome;
    private LocalDateTime dataDiNascita;

    public Persona(String nome, String cognome, LocalDateTime dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }
     public String getNome() {
            return nome;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public String getCognome() {
            return cognome;
        }
    
        public void setCognome(String cognome) {
            this.cognome = cognome;
        }
    
        public LocalDateTime getDatadinascita() {
            return dataDiNascita;
        }
    
        public void setDatadiNascita(LocalDateTime dataDiNascita){       
            this.dataDiNascita = dataDiNascita;
        }

}

