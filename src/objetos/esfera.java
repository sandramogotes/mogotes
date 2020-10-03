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
public class esfera {
  private double r;

    public esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String calcular() {
       return "Area (A)="+(4*Math.PI*(r*r))+"\n Volumen (v)="+((4*Math.PI*(r*r*r))/3);
    }
    
}
  

