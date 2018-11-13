package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import static trabalho_1.trabalho_1.App.randonDate;

public class Venda {
    
    private Date dataVenda;
    private Funcionario vendedor;
    private String formaPagamento;
    private String parcelas;
    private Double valorFinal;
    private Cliente cliente;
    
    private List<Produto> produtos = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    
    public Venda(){
    }

    public Venda(Date dataVenda, Cliente cliente, Funcionario vendedor, String formaPagamento, String parcelas, List<Produto> produtos, Double valorFinal) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.produtos = produtos;
        this.valorFinal = valorFinal;
    }
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getParcelas() {
        return parcelas;
    }

    public void setParcelas(String parcelas) {
        this.parcelas = parcelas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void menuVenda() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Menu Vendas *****");
        System.out.println("1- Listar vendas");
        System.out.println("2- Registrar venda");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        if(opcao == 0) {
            Menu menu = new Menu();
            menu.menu();
            menuVenda();
        }
        if(opcao == 1) {
            listarVendas();
            menuVenda();
        }
        if(opcao == 2) {
            registrarVenda();
            menuVenda();
        }
    }
    
    public void listarVendas() throws ParseException {
        int contador = 0;
        if(vendas.isEmpty()){
            listaPreCadastrada();
        }
        for (Venda v : vendas) {
            contador++;
            System.out.println(contador + " - " + 
                    "Data venda: " + formatarData(v.getDataVenda()) + " | " + 
                    "Cliente: " + v.getCliente().getNome() + " | " +
                    "Vendedor: " + v.getVendedor().getNome() + " | " + 
                    "Forma pagamento: " + v.getFormaPagamento() + " | " +
                    "Valor Final: " + v.getValorFinal());
        }
        System.out.println("Lista de Produtos");
        for (Produto p : produtos) {
            contador++;
            System.out.println(contador + " - " + 
                    "Nome: " + p.getNome() + " | " + 
                    "Código: " + p.getCodigo() + " | " +
                    "Fornecedor: " + p.getNomeFornecedor() + " | " +
                    "Preço custo: " + p.getPrecoCusto() + " | " + 
                    "Preço final: " + p.getPrecoFinal() + " | " +
                    "Tipo Produto: " + p.getTipoProduto());
        }
        System.out.println("");
    }
    
    public void listaPreCadastrada() throws ParseException {
        Cliente cliente2 = new Cliente("Antônio", "Rua dos Afazeres", "12199943089","6798881-99999");
        Vendedor vendedor2 = new Vendedor("Antônio", "Rua dos Afazeres", "12199943089","6798881-99999", 1.500, "Vendedor", 100);
        Fornecedor fornecedor1 = new Fornecedor("Teste", "Rua Teste", "121221", "RECORRENTE");
        Produto produto = new Produto("Biscoito", 1, fornecedor1, 5.0, 7.0, "Parecível", randonDate());
        produtos.add(produto);
        Venda venda = new Venda(converterStringParaDate("25/10/2018"), cliente2, vendedor2, "Dinheiro", "1", produtos, 100.0);
        vendas.add(venda);
    }
    
    public void registrarVenda() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira os produtos: ");
        for (int i = 0; i < 20; i++) {
            Produto p = new Produto();
            System.out.println("Nome do produto: ");
            String produtoCampo = entrada.nextLine();
            p.setNome(produtoCampo);
            System.out.println("Valor:");
            Double precoFinal = entrada.nextDouble();
            p.setPrecoFinal(precoFinal);
            this.setValorFinal(getValorFinal() + precoFinal);
            produtos.add(p);
        }
        System.out.println("Data da venda:");
        String dataVendaCampo = entrada.next();
        System.out.println("Nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        this.cliente.setNome(nomeCliente);
        System.out.println("Vendedor: ");
        String vendedorVendaCampo = entrada.nextLine();
        this.vendedor.setNome(vendedorVendaCampo);
        selecionarTipoPagamento();
        Integer opcaoPagamento = entrada.nextInt();
        String formaPagamentoCampo = "";
        if(opcaoPagamento == 1) {
            formaPagamentoCampo = "Dinheiro";
        }
        if(opcaoPagamento == 2) {
            formaPagamentoCampo = "Débito";
        }
        String numeroParcelasCampo = "";
        if(opcaoPagamento == 3) {
            formaPagamentoCampo = "Crédito";
            System.out.println("Número de parcelas: ");
            numeroParcelasCampo = entrada.nextLine();
            this.setValorFinal(valorFinal + (valorFinal*0.02));
        }
        
        Venda venda = new Venda(converterStringParaDate(dataVendaCampo), cliente, vendedor, 
                formaPagamentoCampo, numeroParcelasCampo, produtos, valorFinal);
        
        vendas.add(venda);
        
        System.out.println("");
        System.out.println("Venda registrada com sucesso!");
        System.out.println("");
    }
    
    public void selecionarTipoPagamento(){
        System.out.println("Forma de pagamento:");
        System.out.println("1- Dinheiro");
        System.out.println("2- Débito");
        System.out.println("3- Crédito");
    }
    
    public Date converterStringParaDate(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formato.parse(data);
        return date;
    }
    
    public String formatarData(Date data) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        String dataFormatada = format.format(data);
        return dataFormatada;
    }
    
    
    
}
