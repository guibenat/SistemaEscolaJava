public class Professor extends Pessoa{
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor(String nome, String disciplina){
        setNome(nome);
        this.disciplina = disciplina;
    }

    @Override

    public void apresentar(){
        System.out.printf("Sou o professor %s, leciono %s.", getNome(), getDisciplina());
    }
}
