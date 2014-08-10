/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
    
/**
 *
 * @author Sebastian-pc
 */
public class Paralelo {
    Double it;
    Double rt;
    
    public Double CalculoPar(double rt1, double rt2, double rt3, double vt){
        rt=(1/((1/rt1)+(1/rt2)+(1/rt3)));
        it=vt/rt;
        
        return it;
    }
}
