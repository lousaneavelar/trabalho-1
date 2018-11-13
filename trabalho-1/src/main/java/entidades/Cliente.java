package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {
    
    List<Cliente> clientes = new ArrayList<>();
    
    public Cliente(){
    }
	
    public Cliente(String nome, String endereco, String cpf, String telefone) {
        super(nome, endereco, cpf, telefone);
    }

    public void imprimirCliente(Cliente cliente) {
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getTelefone());
    }
    
    public void menuCliente() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Menu Cliente *****");
        System.out.println("1- Listar clientes");
        System.out.println("2- Cadastrar cliente");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        if(opcao == 0) {
            Menu menu = new Menu();
            menu.menu();
            menuCliente();
        }
        if(opcao == 1) {
            listarClientes();
            menuCliente();
        }
        if(opcao == 2) {
            cadastrarCliente();
            menuCliente();
        }
    }
    
    public void listarClientes() {
        int contador = 0;
        if(clientes.isEmpty()){
            listaPreCadastrada();
        }
        for (Cliente c : clientes) {
            contador++;
            System.out.println(contador + " - " + 
                    "Nome: " + c.getNome() + " | " + 
                    "Endereço: " + c.getEndereco() + " | " +
                    "CPF: " + c.getCpf() + " | " + 
                    "Telefone: " + c.getTelefone());
        }
        System.out.println("");
    }
    
    public void listaPreCadastrada() {
        Cliente cliente = new Cliente("Antônio", "Rua dos Afazeres", "12199943089","6798881-99999");
        clientes.add(cliente);
    }
    
    public void cadastrarCliente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeCampo = entrada.nextLine();
        System.out.println("CPF: ");
        String cpfCampo = entrada.nextLine();
        System.out.println("Endereço: ");
        String enderecoCampo = entrada.nextLine();
        System.out.println("Telefone: ");
        String telefoneCampo = entrada.nextLine();
        
        Cliente cliente = new Cliente(nomeCampo, enderecoCampo, cpfCampo, telefoneCampo);
        clientes.add(cliente);
        
        System.out.println("");
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("");
    }

}
