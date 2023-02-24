/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Area circulo: "+calcular_area(5.0));
        System.out.println("Area triangulo: "+calcular_area(5.0, 6.0));
        System.out.println("Area trapeio: "+calcular_area(5.0, 6.0, 7.0));
    }
    
    public static double calcular_area(double radio){
    return (radio*radio) * Math.PI;
    }
    public static double calcular_area(double base, double altura){
    return (base * altura) / 2.0;
    }
    public static double calcular_area(double baseM,double basem, double altura){
    return (altura * (baseM + basem)) / 2.0;
    }
}
