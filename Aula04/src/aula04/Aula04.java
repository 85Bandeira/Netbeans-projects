/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Miguel
 */
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Vermelha", 0.6f );
        c1.status();
        Caneta c2 = new Caneta ("CAD", "Preta", 0.7f);
        c2.status();
    }   
}
