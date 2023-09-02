import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String nome;
    private Set<Departamento> departamentos = new HashSet<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Set<Departamento> getDepartamentos() {
        return new HashSet<Departamento>(this.departamentos);
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

}
