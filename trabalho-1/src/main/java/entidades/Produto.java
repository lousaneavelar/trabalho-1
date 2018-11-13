package entidades;

import basedados.BaseProduto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static trabalho_1.trabalho_1.App.randonDate;

public class Produto {
	
    private String nome;
    private Integer codigo;
    private Fornecedor fornecedor;
    private double precoCusto;
    private double precoFinal;
    private Date dataValidade;
    private String tipoProduto;
    
    List<Produto> produtos = new ArrayList<>();
    
    public Produto() {
        
    }

    public Produto(String nome, Integer codigo, Fornecedor fornecedor, double precoCusto, double precoFinal, String tipoProduto, Date dataValidade) {
            this.nome = nome;
            this.codigo = codigo;
            this.fornecedor = fornecedor;
            this.precoCusto = precoCusto;
            this.precoFinal = precoFinal;
            this.tipoProduto = tipoProduto;
            this.dataValidade = dataValidade;
    }

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Fornecedor getFornecedor() {
            return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
            this.fornecedor = fornecedor;
    }

    public double getPrecoCusto() {
            return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
            this.precoCusto = precoCusto;
    }

    public double getPrecoFinal() {
            return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
            this.precoFinal = precoFinal;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNomeFornecedor() {
        return fornecedor.getNome();
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    public String getDataValidadeFormatada() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(dataValidade);
    }

    public void imprimirProduto(Produto produto) {
        System.out.println(produto.getNome());
        System.out.println(produto.getCodigo());
        System.out.println(produto.getFornecedor().getNome());
        System.out.println(produto.getPrecoCusto());
        System.out.println(produto.getPrecoFinal());
        System.out.println(produto.getDataValidadeFormatada());
    }
    
    public void menuProduto() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("***** Menu Produto *****");
        System.out.println("1- Listar produtos");
        System.out.println("2- Cadastrar produto");
        System.out.println("0- Sair");
        System.out.println("");
        
        Integer opcao = entrada.nextInt();
        
        if(opcao == 0) {
            Menu menu = new Menu();
            menu.menu();
            menuProduto();
        }
        if(opcao == 1) {
            listarProdutos();
            menuProduto();
        }
        if(opcao == 2) {
            cadastrarProduto();
            menuProduto();
        }
    }
    
    public void listarProdutos() {
        int contador = 0;
        if(produtos.isEmpty()) {
            listaPreCadastrada();
        }
        for (Produto p : produtos) {
            contador++;
            System.out.println(contador + " - " + 
                    "Nome: " + p.getNome() + " | " + 
                    "Código: " + p.getCodigo() + " | " +
                    "Fornecedor: " + p.getNomeFornecedor() + " | " +
                    "Preço custo: " + p.getPrecoCusto() + " | " + 
                    "Preço final: " + p.getPrecoFinal() + " | " +
                    "Tipo Produto: " + p.getTipoProduto() + " | " +
                    "Data Validade: " + p.getTipoProduto());
        }
        System.out.println("");
    }
    
    public void listaPreCadastrada() {
        Fornecedor fornecedor1 = new Fornecedor("Teste", "Rua Teste", "121221", "RECORRENTE");
        Produto produto = new Produto("Biscoito", 1, fornecedor1, 5.0, 7.0, "Parecível", randonDate());
        
        produtos.add(produto);
        
        BaseProduto baseProduto = new BaseProduto();
        produtos = baseProduto.carregaProdutos();
    }
    
    public void cadastrarProduto() throws ParseException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        String nomeCampo = entrada.nextLine();
        System.out.println("Código: ");
        Integer codigoCampo = entrada.nextInt();
        while (validaCodigoProduto(codigoCampo)) {
            System.out.println("O código do produto deve conter 6 dígitos! Digite Novamente.");
            codigoCampo = entrada.nextInt();
        }
        System.out.println("Atenção! Favor consultar a lista de fornecedores "
                + "antes de preencher o campo. Caso não exista fornecedores"
                + "cadastrados, basta cadastrar um novo.");
        String fornecedorCampo = entrada.nextLine();
        Fornecedor f = new Fornecedor();
        f.setNome(fornecedorCampo);
        fornecedor = buscaFornecedor(fornecedorCampo);
        System.out.println("Preço de custo:");
        Double precoDeCustoCampo = entrada.nextDouble();
        System.out.println("Preço Final:");
        Double precoFinalCampo = entrada.nextDouble();
        selecionarTipoProduto();
        Integer opcaoTipoProduto = entrada.nextInt();
        if(opcaoTipoProduto == 1){
            System.out.println("Data de validade:");
            String dataValidadeCampo = entrada.next();
            dataValidade = converterStringParaDate(dataValidadeCampo);
        }
        String tipoProdutoCampo = entrada.nextLine();
        
        Produto produto = new Produto(nomeCampo, codigoCampo, f, precoDeCustoCampo, precoFinalCampo, tipoProdutoCampo, dataValidade);
        
        produtos.add(produto);
        System.out.println("");
        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("");
    }
    
    public void selecionarTipoProduto(){
        System.out.println("Tipo Fornecedor:");
        System.out.println("1- Perecível");
        System.out.println("2- Não perecível");
        System.out.println("");
    }
    
    public double descontoProduto() {
        if(fornecedor.getTipoFornecedor().equals("RECORRENTE")){
            this.precoCusto = this.precoCusto - 0.05;
        }
        return this.precoCusto;
    }

    public boolean validaCodigoProduto(Integer codigo) {
        String codigoConvertido = codigo.toString();
        if(codigoConvertido.length() != 6) {
            return true;
        }
        return false;
    }
    
    public Fornecedor buscaFornecedor(String nomeFornecedor) {
        Fornecedor forn = new Fornecedor();
        for (Fornecedor f : forn.fornecedores) {
            if(nomeFornecedor.equals(f.getNome())) {
                return f;
            }
        }
        return null;
    }
    
    public Date converterStringParaDate(String data) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formato.parse(data);
        return date;
    }
        
}
