/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {
    
    
    public void menu() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Padarias Trem Bão *****");
        System.out.println("************ Menu ***********");
        System.out.println("1- Gestão de fornecedores");
        System.out.println("2- Gestão de produtos");
        System.out.println("3- Gestão de funcionários");
        System.out.println("4- Gestão de clientes");
        System.out.println("5- Gestão de cartão fidelidade");
        System.out.println("6- Gestão de vendas");
        System.out.println("7- Gestão de estoque");
        System.out.println("8- Gestão de impostos a pagar");
        System.out.println("9- Gestão de informações");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        opcaoSelecionada(opcao);
        
    }
    
    public void opcaoSelecionada(Integer opcao) {
        do {
            
            switch(opcao) {
                case 0:
                    System.exit(0);
                case 1:
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor.menuFornecedor();
                case 2:
                    Produto produto = new Produto();
                    try {
                        produto.menuProduto();
                    } catch (ParseException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                case 3:
                    Funcionario funcionario = new Funcionario();
                    funcionario.menuFuncionario();
                case 4:
                    Cliente cliente = new Cliente();
                    cliente.menuCliente();
                case 6:
                    Venda venda = new Venda();
                try {
                    venda.menuVenda();
                } catch (ParseException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
        } while (opcao != 0);
    }
    
    
}
