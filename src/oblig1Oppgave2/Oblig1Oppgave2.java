package oblig1Oppgave2;

import javax.swing.*;

public class Oblig1Oppgave2 {

    public static void main(String[] args) {
        //Les inn for vare 1
        String skrivNavn = JOptionPane.showInputDialog("Skriv inn navn: ");
        String skrivAntall = JOptionPane.showInputDialog("Skriv inn antall: ");
        String skrivPris = JOptionPane.showInputDialog("Skriv inn pris: ");
        int nyAntall;
        double nyPris;
        try {
            nyAntall = Integer.parseInt(skrivAntall);
        } catch (Exception e) {
            nyAntall = 0;
        }
        try {
            nyPris =  Double.parseDouble(skrivPris);
        } catch (Exception e) {
            nyPris = 0;
        }
        // Les inn for vare 2
        String skrivNavn2 = JOptionPane.showInputDialog("Skriv inn navn: ");
        String skrivAntall2 = JOptionPane.showInputDialog("Skriv inn antall: ");
        String skrivPris2 = JOptionPane.showInputDialog("Skriv inn pris: ");
        int nyAntall2;
        double nyPris2;

        try {
            nyAntall2 = Integer.parseInt(skrivAntall2);
        } catch (Exception e) {
            nyAntall2 = 0;
        }
        try {
            nyPris2 =  Double.parseDouble(skrivPris2);
        } catch (Exception e) {
            nyPris2 = 0;
        }
        //Opprett ny objekt
        Vare vare1 = new Vare(skrivNavn,nyAntall,nyPris);
        Vare vare2 = new Vare(skrivNavn2,nyAntall2,nyPris2);

        double totalPris = vare1.regneTotalPris() + vare2.regneTotalPris();

        System.out.println(vare1.getAntall() + " stykker med " + vare1.getNavn() + " for " + vare1.getPris() +
                " kr koster tilsammen " + vare1.regneTotalPris() + " kr.");
        System.out.println(vare2.getAntall() + " stykker med " + vare2.getNavn() + " for " + vare2.getPris() +
                " kr koster tilsammen " + vare2.regneTotalPris() + " kr.");

        System.out.println("Totalprisen ble : " + totalPris + " kr");
    }
}
