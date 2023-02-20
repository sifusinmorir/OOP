/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

public class Circulo {
    private double radio;
    
    public Circulo(){
        radio = 5;
    }
    public Circulo(double datoRadio){
        radio = datoRadio; 
    }
     public void setRadio(double valor){
        radio = valor; 
    }
     public double getRadio(){
        return radio;
    }
    public double getArea(){
        return Math.PI*(radio*radio);
    }
    public double getPerimetro(){
        return Math.PI*(radio*2);
    }
}
