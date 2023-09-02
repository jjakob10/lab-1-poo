import java.util.HashSet;
import java.util.Set;

public class Departamento {
    private String nome;
    private Set<Funcionario> funcionarios = new HashSet<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Funcionario> getFuncionarios() {
        return new HashSet<Funcionario>(this.funcionarios);
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
