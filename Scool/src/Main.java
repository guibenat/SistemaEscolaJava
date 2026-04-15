import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> cadastro = new ArrayList<>();

        cadastro.add(new Professor("Guilherme", "Back-end Java"));
        cadastro.add(new Diretor("Bruno", 10));
        cadastro.add(new Aluno("Benatte", 18, "Javinha"));

        for (Pessoa p : cadastro) {
            p.apresentar();
        }
    }
}