/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author UNISANGIL
 */
public class piramide {
  private double h, Pb, Ap, Ab, Al;

    public piramide(double h, double Pb, double Ap, double Ab, double Al) {
        this.h = h;
        this.Pb = Pb;
        this.Ap = Ap;
        this.Ab = Ab;
        this.Al = Al;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getPb() {
        return Pb;
    }

    public void setPb(double Pb) {
        this.Pb = Pb;
    }

    public double getAp() {
        return Ap;
    }

    public void setAp(double Ap) {
        this.Ap = Ap;
    }

    public double getAb() {
        return Ab;
    }

    public void setAb(double Ab) {
        this.Ab = Ab;
    }

    public double getAl() {
        return Al;
    }

    public void setAl(double Al) {
        this.Al = Al;
    }

    public String calcular() {
        return "Area lateral (Al)= "+(Pb*Ap)/2 + "\n Area Total (At)= "+(Al+Ab)+"\n Volumen (v)= "+(Ab*h)/3;  
    }  
}
