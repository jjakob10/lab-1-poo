public class FuncionarioTempoParcial extends Funcionario {
    private int nHorasSemanais;

    public FuncionarioTempoParcial(String nome, float salario, int nHorasSemanais) {
        super(nome, salario);
        this.nHorasSemanais = nHorasSemanais;

    }
    
    @Override
    public float getContribuicao() {
        return (float) 0.1 * getSalario();
    }

    public int getnHorasSemanais() {
        return nHorasSemanais;
    }

    public void setnHorasSemanais(int nHorasSemanais) {
        this.nHorasSemanais = nHorasSemanais;
    }

}
