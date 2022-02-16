package oblig1Oppgave2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        setAntall(antall);
        setPris(pris);
    }
    //Getters og setters
    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public int getAntall(){
        return antall;
    }
    public void setAntall(int antall){
        if (antall > 0){
            this.antall = antall;
        } else {
            System.out.println("Feil. Antall må være større eller lik 1");
        }
    }
    public double getPris(){
        return pris;
    }
    public void setPris(double pris){
        if (pris > 0) {
            this.pris = pris;
        } else {
            System.out.println("Feil. Pris må være større eller lik 1");
        }
    }
    public double regneTotalPris(){
        return pris * antall;
    }
}
