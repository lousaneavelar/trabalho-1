package entidades;

public class Gerente extends Funcionario {
	
    public Gerente(String nome, String endereco, String cpf, String telefone, double salarioBaseMensal, String tipoFuncionario) {
            super(nome, endereco, cpf, telefone, salarioBaseMensal, tipoFuncionario);
    }

    public void bonificacaoGerente(Gerente gerente) {
        gerente.setSalarioBaseMensal(gerente.getSalarioBaseMensal() + (gerente.getSalarioBaseMensal()*0.2));
    }

}
