package aula12;
public class Ave extends Animal{
    private String corPena;
     @Override
    public void locomover(){
        System.out.println("");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    public void fazerNinho(){
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" + "corPena = " + corPena + '}';
    }
    
}