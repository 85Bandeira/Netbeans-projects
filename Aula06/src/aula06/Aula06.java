/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Miguel
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
     c.ligar();
     c.maisVolume();
     c.maisVolume();
     c.ligarMudo();
     c.play();
     c.maisVolume();
     c.abrirMenu();
    }
    
}
