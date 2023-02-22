/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_califas;

/**
 *
 * @author invitado
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resu1;
        resu1 = calif(-10);
        System.out.println(resu1);
    }
        public static String calif(double num){
            String resu = ""; 
            if(num >= 0 && num <= 100){
            if(num < 70) resu = "D";
            else if (num < 80) resu = "C";
            else if (num < 90) resu = "B";
            else resu = "A";
    }
            else resu = "Calificacion no valida";
            return resu;
   }         
}
