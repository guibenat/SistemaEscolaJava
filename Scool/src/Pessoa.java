abstract class Pessoa {
    private String nome;
    private int idade;

    // GET  /  SETTERS
    public int getIdade (){
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void apresentar();
}
