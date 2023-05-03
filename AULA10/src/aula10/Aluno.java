
package aula10;

public class Aluno extends Pessoa {
    private int matric;
    private String curso;
    
    public void cancelarMat(){
        System.out.println("A matrícula será cancelada");
    }

    public int getMatric() {
        return matric;
    }

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
}
