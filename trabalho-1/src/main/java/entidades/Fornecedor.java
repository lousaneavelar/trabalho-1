package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fornecedor {
	
    private String nome;
    private String endereco;
    private String cnpj;
    private String tipoFornecedor;
    
    List<Fornecedor> fornecedores = new ArrayList<>();
    
    public Fornecedor(){
        
    }

    public Fornecedor(String nome, String endereco, String cnpj, String tipoFornecedor) {
            this.nome = nome;
            this.endereco = endereco;
            this.cnpj = cnpj;
            this.tipoFornecedor = tipoFornecedor;
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public String getEndereco() {
            return endereco;
    }

    public void setEndereco(String endereco) {
            this.endereco = endereco;
    }

    public String getCnpj() {
            return cnpj;
    }

    public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public void imprimirFornecedor(Fornecedor fornecedor) {
        System.out.println(fornecedor.getNome());
        System.out.println(fornecedor.getEndereco());
        System.out.println(fornecedor.getCnpj());
        System.out.println(fornecedor.getTipoFornecedor());
    }
    
    public void menuFornecedor() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Menu Fornecedor *****");
        System.out.println("1- Listar fornecedores");
        System.out.println("2- Cadastrar fornecedor");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        if(opcao == 0) {
            Menu menu = new Menu();
            menu.menu();
            menuFornecedor();
        }
        if(opcao == 1) {
            listarFornecedores();
            menuFornecedor();
        }
        if(opcao == 2) {
            cadastrarFornecedor();
            menuFornecedor();
        }
    }
    
    public void listarFornecedores() {
        int contador = 0;
        if(fornecedores.isEmpty()){
            listaPreCadastrada();
        }
        for (Fornecedor f : fornecedores) {
            contador++;
            System.out.println(contador + " - " + 
                    "Nome: " + f.getNome() + " | " + 
                    "CNPJ: " + f.getCnpj());
        }
        System.out.println("");
    }
    
    public void listaPreCadastrada() {
        Fornecedor fornecedor1 = new Fornecedor("Teste", "Rua Teste", "121221", "RECORRENTE");
        fornecedores.add(fornecedor1);
    }
    
    public void cadastrarFornecedor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeCampo = entrada.nextLine();
        System.out.println("CNPJ: ");
        String cnpjCampo = entrada.nextLine();
        System.out.println("Endereço: ");
        String enderecoCampo = entrada.nextLine();
        System.out.println("Tipo Fornecedor: 1- Recorrente 2- Ocasional");
        Integer tipoFornecedorCampo = entrada.nextInt();
        
        if(tipoFornecedorCampo == 1) {
            setTipoFornecedor("Recorrente");
        } else if (tipoFornecedorCampo == 2){
            setTipoFornecedor("Ocasional");
        } else {
            System.out.println("Favor digitar um valor válido.");
            tipoFornecedorCampo = entrada.nextInt();
        }
        
        Fornecedor fornecedorAdicionado = new Fornecedor(nomeCampo, enderecoCampo, cnpjCampo, tipoFornecedor);
        fornecedores.add(fornecedorAdicionado);
        System.out.println("");
        System.out.println("Fornecedor cadastrado com sucesso!");
        System.out.println("");
    }
    
    public void selecionarTipoFornecedor(){
        System.out.println("**** Tipo Fornecedor");
        System.out.println("1- Recorrentes");
        System.out.println("2- Ocasionais");
        System.out.println("");
    }
        
}
