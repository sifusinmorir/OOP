/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_calculos_geometricos;

/**
 *
 * @author invitado
 */
public class Geometria {
    //constantes:
    public static final double PI = 3.1416;//final para variables solo se
                                           //puede asignar el valor una vez 
    
    //perimetro de circulo
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2.0);
    }
    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
    public static double volumenCirculo(double radio){
        return (4.0 / 3.0) * (PI * (radio * radio * radio));
    }
    
}
