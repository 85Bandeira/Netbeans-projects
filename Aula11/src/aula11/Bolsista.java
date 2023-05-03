
package aula11;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Renovando a bolsa de " + this.nome); 
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return  bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + " bolsa = " + bolsa + '}';
    }
    
}
