package aula14;
public class Gafanhoto extends Pessoa {
   protected String login;
   protected int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
   
   public void viuMaisUm(){
       
   }
   

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n login = " 
                + login + "\n totAssistido = " + totAssistido + '}';
    }
   
}
