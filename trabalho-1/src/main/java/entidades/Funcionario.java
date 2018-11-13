package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa {
	
    private double salarioBaseMensal;
    private String tipoFuncionario;
    
    List<Funcionario> funcionarios = new ArrayList<>();
    
    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, String telefone,
            double salarioBaseMensal, String tipoFuncionario) {
            super(nome, endereco, cpf, telefone);
            this.salarioBaseMensal = salarioBaseMensal;
            this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalarioBaseMensal() {
            return salarioBaseMensal;
    }

    public void setSalarioBaseMensal(double salarioBaseMensal) {
            this.salarioBaseMensal = salarioBaseMensal;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public void imprimirFuncinario(Funcionario funcionario) {
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getEndereco());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getTelefone());
        System.out.println(funcionario.getSalarioBaseMensal());
    }
    
    public void menuFuncionario() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Menu Funcionário *****");
        System.out.println("1- Listar funcionários");
        System.out.println("2- Cadastrar funcionário");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        if(opcao == 0) {
            Menu menu = new Menu();
            menu.menu();
            menuFuncionario();
        }
        if(opcao == 1) {
            listarFuncionarios();
            menuFuncionario();
        }
        if(opcao == 2) {
            cadastrarFuncionario();
            menuFuncionario();
        }
    }
    
    public void listarFuncionarios() {
        int contador = 0;
        if(funcionarios.isEmpty()){
            listaPreCadastrada();
        }
        for (Funcionario f : funcionarios) {
            contador++;
            System.out.println(contador + " - " + 
                    "Nome: " + f.getNome() + " | " + 
                    "Endereço: " + f.getEndereco() + " | " +
                    "CPF: " + f.getCpf() + " | " + 
                    "Telefone: " + f.getTelefone() + " | " +
                    "Salário Base: " + f.getSalarioBaseMensal() + " | " +
                    "Tipo Funcionário: " + f.getTipoFuncionario());
        }
        System.out.println("");
    }
    
    public void listaPreCadastrada() {
        Vendedor vendedor = new Vendedor("Antônio", "Rua dos Afazeres", "12199943089","6798881-99999", 1.500, "Vendedor", 100);
        funcionarios.add(vendedor);
    }
    
    public void cadastrarFuncionario() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeCampo = entrada.nextLine();
        System.out.println("CPF: ");
        String cpfCampo = entrada.nextLine();
        System.out.println("Endereço: ");
        String enderecoCampo = entrada.nextLine();
        System.out.println("Telefone: ");
        String telefoneCampo = entrada.nextLine();
//        System.out.println("Salário Base: ");
//        Double salarioBaseCampo = entrada.nextDouble();
        System.out.println("Tipo Funcionário: ");
        String tipoFuncionarioCampo = entrada.nextLine();
        
        if("Vendedor".equals(tipoFuncionarioCampo)) {
            System.out.println("Montante de vendas:");
            Integer montanteVendasCampo = entrada.nextInt();
            Vendedor vendedor = new Vendedor(nomeCampo, enderecoCampo, cpfCampo, telefoneCampo, 1, tipoFuncionarioCampo, montanteVendasCampo);
            funcionarios.add(vendedor);
        }
        
        if("Gerente".equals(tipoFuncionarioCampo)) {
            Gerente gerente = new Gerente(nomeCampo, enderecoCampo, cpfCampo, telefoneCampo, 1, tipoFuncionarioCampo);
            gerente.bonificacaoGerente(gerente);
            funcionarios.add(gerente);
        }
        
        if("Padeiro".equals(tipoFuncionarioCampo)) {
            Padeiro padeiro = new Padeiro(nomeCampo, enderecoCampo, cpfCampo, telefoneCampo, 1, tipoFuncionarioCampo);
            funcionarios.add(padeiro);
        }
        
        System.out.println("");
        System.out.println("Funcionário cadastrado com sucesso!");
        System.out.println("");
    }
    
}
