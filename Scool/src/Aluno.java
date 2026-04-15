public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, int idade, String Matricula) {
        setNome(nome);
        setIdade(idade);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override

    public void apresentar() {
        System.out.printf("Sou o aluno %s, tenho %d anos, matrícula %s.", getNome(), getIdade(), getMatricula());
    }

}
