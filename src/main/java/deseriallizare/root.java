package deseriallizare;

import java.util.ArrayList;

public class root {
        String annoDiInizio;
        aula aula;
        String classe;
        String numeroFinestre;
        String specializzazione;
        ArrayList<element> studenti;

        public root(){}

        public String getAnnoDiInizio() {
                return annoDiInizio;
        }

        public void setAnnoDiInizio(String annoDiInizio) {
                this.annoDiInizio = annoDiInizio;
        }

        public aula getAula() {
                return aula;
        }

        public void setAula(aula aula) {
                this.aula = aula;
        }

        public String getClasse() {
                return classe;
        }

        public void setClasse(String classe) {
                this.classe = classe;
        }

        public String getNumeroFinestre() {
                return numeroFinestre;
        }

        public void setNumeroFinestre(String numeroFinestre) {
                this.numeroFinestre = numeroFinestre;
        }

        public String getSpecializzazione() {
                return specializzazione;
        }

        public void setSpecializzazione(String specializzazione) {
                this.specializzazione = specializzazione;
        }

        public ArrayList<element> getStudenti() {
                return studenti;
        }

        public void setStudenti(ArrayList<element> studenti) {
                this.studenti = studenti;
        }

}
