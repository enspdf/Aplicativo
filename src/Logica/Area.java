/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

/**
 *
 * @author 19
 */
public class Area {
    Double resultado;
    Double radio;
    
    public Double Calcular(double radio){
        resultado=(3.14159*radio*radio);
        return resultado;
    }
    
}
