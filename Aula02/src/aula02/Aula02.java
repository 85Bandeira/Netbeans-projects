/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Miguel
 */
public class Aula02 {

  
    public static void main(String[] args) {
        // TODO code application logic here
   
        Caneta c1 = new Caneta();
         c1.modelo = "Bic";
         c1.cor = "Azul";
         c1.ponta = 0.5f;      
         c1.carga = 75;
         c1.tampar();
         c1.status();
         c1.rabiscar();
         
         Caneta c2 = new Caneta();
         c2.modelo = "Hostnet";
         c2.cor = "Preta";
         c2.destampar();
         c2.status();
         c2.rabiscar();
    }
}
