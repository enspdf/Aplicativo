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
public class Pitagoras {
    double resultado;
    double calculo;
    
    public double hipotenusa(double catetoa, double catetob){
        calculo= ((catetoa*catetoa)+(catetob*catetob));
        resultado= Math.sqrt(calculo);
        return resultado;
    }
    
    public double catetoa(double catetob, double hipotenusa){
//        calculo=hipotenusa*hipotenusa-catetob*catetob;
        resultado= Math.sqrt(hipotenusa*hipotenusa-catetob*catetob);
        return resultado;
    }
    
    public double catetob(double catetoa, double hipotenusa){
        calculo=((hipotenusa*hipotenusa)-(catetoa*catetoa));
        resultado=Math.sqrt(calculo);
        return resultado;
    }
    
}
