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
public class cono {
 
    private double h,r,g;

    public cono(double h, double r, double g) {
        this.h = h;
        this.r = r;
        this.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    public String calcular() {
       return "Area Lateral (Al)="+(Math.PI*h*g)+"\n Area Total (At)= "+(Math.PI*r*(g+r))+"\n Volumen (v)="+((Math.PI*(r*r)*h)/3);
    }
      
}
