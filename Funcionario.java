public abstract class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }

    public abstract float getContribuicao();
}
