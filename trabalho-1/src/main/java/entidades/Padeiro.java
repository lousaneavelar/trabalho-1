package entidades;

public class Padeiro extends Funcionario {
    
    private Integer horaAdicionalNoturno;

    public Padeiro(String nome, String endereco, String cpf, String telefone, double salarioBaseMensal, String tipoFuncionario) {
            super(nome, endereco, cpf, telefone, salarioBaseMensal, tipoFuncionario);
    }

    public Integer getHoraAdicionalNoturno() {
        return horaAdicionalNoturno;
    }

    public void setHoraAdicionalNoturno(Integer horaAdicionalNoturno) {
        this.horaAdicionalNoturno = horaAdicionalNoturno;
    }
    
    public void bonificacaoPadeiro(Padeiro padeiro) {
        padeiro.setSalarioBaseMensal(padeiro.getSalarioBaseMensal() + 
                (padeiro.getHoraAdicionalNoturno()*(padeiro.getSalarioBaseMensal()*0.25)));
    }

}
