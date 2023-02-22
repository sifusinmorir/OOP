/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package eva1_6_automovil;

/**
 *
 * @author invitado
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Tony", "Soprano", "777", 1999, "Sifu");
        
        System.out.println("Datos del auto:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Placas: " + auto1.getPlacas());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Dueño: " + auto1.getDueño());
        System.out.println("Adeudo: " + auto1.getAdeudo());
    }
}
