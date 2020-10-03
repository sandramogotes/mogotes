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
public class cilindro {
    
    private double h,r;

    public cilindro(double h, double r) {
        this.h = h;
        this.r = r;
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

    public String calcular() {
        return "Area Lateral (Al)="+(2*Math.PI*h*r)+"\n Area Total (At)= "+(2*Math.PI*(h+r))+"\n Volumen (v)="+(Math.PI*(r*r));
    }
}
