package oblig1Oppgave1;

import javax.swing.*;

class SirkelElementer{

    public static double diameter(double radius){
        double diameter = radius * 2;
        return diameter;
    }
    public static double omkrets(double r){
        double omkrets = 2 * r *Math.PI;
        return omkrets;
    }
    public static double areal(double rad){
        double areal = Math.PI*Math.pow(rad,2);
        return areal;
    }
}

public class Sirkel {
    public static void main(String[] args) {
        String innRadius = JOptionPane.showInputDialog("Radius til sirkelen: ");
        double r = Double.parseDouble(innRadius);
        double diameter = SirkelElementer.diameter(r);
        double omkrets = SirkelElementer.omkrets(r);
        double areal = SirkelElementer.areal(r);
        System.out.printf("Arealet av sirkelen med radius %.2f er %.2f\n",r,areal);
        System.out.printf("Omkretsen av sirkelen med radius %.2f er %.2f\n",r,omkrets);
        System.out.printf("Diameteren til sirkelen er med radius %.2f er %.2f\n",r,diameter);

    }
}
