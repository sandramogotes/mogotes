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
public class cubo {
    private double a;

    public cubo(double a) {
        this.a = a;
    }

    public cubo() {
        
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String calcular() {
        return "Area Lateral (Al)="+(4*(a*a))+"\n Area Total (At)= "+(6*(a*a))+"\n Volumen (v)="+(a*a*a);
    }

    
    
}
