
package exercicio09;
public class Exercicio09 {
    public static void main(String[] args) {
     Pessoa [] p = new Pessoa [2];
     Livro [] l = new Livro [3];
     
     p[0] = new Pessoa("Thiago", 16, "M");
     p[1] = new Pessoa("Caio", 11, "M");
     
     l[0] = new Livro("Matemática","Pedro", 22, p[0]);
     l[1] = new Livro("Portugues", "José", 32, p[1]);
     l[2] = new Livro("Historia", "Ricardo", 45, p[0]);
     
     l[0].abrir();
     l[0].folhear(5);
     l[0].voltarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
        
        System.out.println(l[2].detalhes());
    }
    
}
