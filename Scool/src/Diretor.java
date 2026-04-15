public class Diretor extends Pessoa{
    private int tempoCargo;

    public int getTempoCargo() {
        return tempoCargo;
    }

    public void setTempoCargo(int tempoCargo) {
        this.tempoCargo = tempoCargo;
    }

    public Diretor(String nome, int tempoCargo) {
        setNome(nome);
        this.tempoCargo = tempoCargo;
    }

    @Override

    public void apresentar(){
        System.out.printf("Sou o diretor %s, há %d anos na gestão.", getNome(), getTempoCargo());
    }
}
