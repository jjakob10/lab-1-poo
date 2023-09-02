public class FuncionarioTempoIntegral extends Funcionario {

    public FuncionarioTempoIntegral(String nome, float salario) {
        super(nome, salario);
    }

    @Override
    public float getContribuicao() {
        return (float)0.2 * getSalario();
    }
    
}
