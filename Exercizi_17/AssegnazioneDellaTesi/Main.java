package Exercizi_17.AssegnazioneDellaTesi;

public class Main {
    public static void main(String[] args) {
        Assegnazioni sistema = new Assegnazioni();

        sistema.aggiungiTesi("Intelligenza Artificiale");
        sistema.aggiungiStudente("Mario Rossi", "Intelligenza Artificiale");
        sistema.aggiungiStudente("Luca Bianchi", "Big Data");
        sistema.aggiungiStudente("Giulia Verdi", "Machine Learning");

        System.out.println("Tesi disponibili: " + sistema.disponibili()); // Output: 1

        sistema.liberaTesi("Big Data");
        System.out.println("Tesi disponibili: " + sistema.disponibili()); // Output: 2

        sistema.laureato("Mario Rossi");
        System.out.println("Tesi disponibili: " + sistema.disponibili()); // Output: 2
    }
}
