package aula13;
public class Aula13 {
    public static void main(String[] args) {
        Mamifero x = new Mamifero();
      
        x.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir(11, 45);
        c.reagir(19, 00);
    }
    
}
