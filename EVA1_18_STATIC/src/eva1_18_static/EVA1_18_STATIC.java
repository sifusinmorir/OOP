/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_static;

/**
 *
 * @author invitado
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        obj.mensaje();
        Prueba.mensajeEstatico();
        System.out.println("PI "+Math.PI);
    }
    
}

class Prueba{
    public void mensaje(){
    System.out.println("Hola!!!");//solo al crear objetos
    }
    public static void mensajeEstatico(){
    System.out.println("Hola (Estatatico) !!!");//dirrectamente de la clase 
    }
}

class Otra{

}