package Exercizi_17.Servizi;

public class ClientiLuce extends Cliente {
    private double kwh;

    public ClientiLuce(String nome, String cognome, double kwh) {
        super(nome, cognome);
        this.kwh = kwh;
    }

    public void calcola() {
        double costoKwh;
        if (kwh < 300) costoKwh = 0.25;
        else if (kwh < 700) costoKwh = 0.18;
        else costoKwh = 0.15;
        prezzoDaPagare = kwh * costoKwh;
    }
}
