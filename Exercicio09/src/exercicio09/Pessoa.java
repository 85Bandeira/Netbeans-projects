package exercicio09;

public class Pessoa{
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos
    public void fazerAniv(){
      this.idade++;
    }
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Método Construtor

    public Pessoa(String no, int id, String S) {
        this.nome = no;
        this.idade = id;
        this.sexo = S;
    }
}
