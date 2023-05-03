package aula12;
public class Aula12 {
    public static void main(String[] args) {
        
    Mamifero m1 = new Mamifero(); 
    Reptil r1 = new Reptil();
    Peixe p1 = new Peixe();
    Ave a1 = new Ave();
    Canguru c = new Canguru();
    Cachorro k = new Cachorro();
    Cobra j = new Cobra();
    Tartaruga t = new Tartaruga();
    GoldFish g = new GoldFish();
    Arara e = new Arara();
    
    c.locomover();
    k.locomover();
    c.emitirSom();
    k.emitirSom();
     
    /*m1.setPeso(8.35f);
    m1.setIdade(2);
    m1.setMembros(4);
    m1.setCorPelo("Marron");
    m1.locomover();
    m1.alimentar();
    m1.emitirSom();
    
    r1.locomover();
        System.out.println(m1.toString());*/
    }
}
