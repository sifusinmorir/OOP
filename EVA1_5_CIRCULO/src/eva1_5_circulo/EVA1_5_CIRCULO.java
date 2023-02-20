/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author invitado
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circ1 = new Circulo();
        circ1.setRadio(10);
        System.out.println("AREA: "+circ1.getArea());
        System.out.println("PERIMETRO: "+circ1.getPerimetro());
    }  
}
