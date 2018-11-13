package entidades;

public class Vendedor extends Funcionario {

    private Integer montanteVendas;

    private Integer totalVendasMensal;

    public Vendedor(String nome, String endereco, String cpf, String telefone, double salarioBaseMensal, 
            String tipoFuncionario, Integer montanteVendas) {
            super(nome, endereco, cpf, telefone, salarioBaseMensal, tipoFuncionario);
            this.montanteVendas = montanteVendas;
    }

    public int getMontanteVendas() {
            return montanteVendas;
    }

    public void setMontanteVendas(int montanteVendas) {
            this.montanteVendas = montanteVendas;
    }

    public Integer getTotalVendasMensal() {
        return totalVendasMensal;
    }

    public void setTotalVendasMensal(Integer totalVendasMensal) {
        this.totalVendasMensal = totalVendasMensal;
    }
    
    public void bonificacaoVendedor(Vendedor vendedor) {
        if(vendedor.getTotalVendasMensal() > vendedor.getMontanteVendas()) {
            vendedor.setSalarioBaseMensal(vendedor.getSalarioBaseMensal()+(vendedor.getSalarioBaseMensal()*0.1));
        }
    }
	
}
