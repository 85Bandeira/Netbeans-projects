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
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private boolean destampada;
    private String cor;
    
    public Caneta(String m, String c, float p){   // Método construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.cor = "Azul";
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
            this.destampada = false;
    }        
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
