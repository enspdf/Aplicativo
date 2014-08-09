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
    int resultado;
    int calculo;
    
    public int hipotenusa(int catetoa, int catetob){
        calculo=((catetoa*catetoa)+(catetob*catetob));
        resultado=(int) Math.sqrt(calculo);
        return resultado;
    }
    
    public int catetoa(int catetob, int hipotenusa){
        calculo=((hipotenusa*hipotenusa)-(catetob*catetob));
        resultado=(int) Math.sqrt(calculo);
        return resultado;
    }
    
    public int catetob(int catetoa, int hipotenusa){
        calculo=((hipotenusa*hipotenusa)-(catetoa*catetoa));
        resultado=(int) Math.sqrt(calculo);
        return resultado;
    }
    
}
