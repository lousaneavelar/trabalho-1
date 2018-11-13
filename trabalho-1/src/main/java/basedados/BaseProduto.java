package basedados;

import entidades.Fornecedor;
import entidades.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BaseProduto {
    
    public List<Produto> listaProdutos = new ArrayList<>();
    
    public List<Produto> carregaProdutos() {
        Fornecedor fornecedor1 = new Fornecedor("Teste", "Rua Teste", "121221", "RECORRENTE");
        Produto produto1 = new Produto("Presunto", 000001, fornecedor1, 10.00, 12.00, "Perecível", randonDate());
        Produto produto2 = new Produto("Mortadela", 000002, fornecedor1, 8.50, 9.55, "Perecível",randonDate());
        Produto produto3 = new Produto("Apresuntado", 000003, fornecedor1, 9.00, 11.50, "Não parecível", randonDate());
        Produto produto4 = new Produto("Salame", 000004, fornecedor1, 11.01, 15.40, "Não parecível",randonDate());
        Produto produto5 = new Produto("Sorvete", 000005, fornecedor1, 10.40, 15.00, "Perecível",randonDate());
        Produto produto6 = new Produto("Picolé", 000006, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        Produto produto7 = new Produto("Refrigerante", 000007, fornecedor1, 2.40, 4.00, "Não parecível",randonDate());
        Produto produto8 = new Produto("Suco", 200008, fornecedor1, 4.00, 7.00, "Não parecível",randonDate());
        Produto produto9 = new Produto("Leite", 500009, fornecedor1, 6.00, 9.00, "Perecível",randonDate());
        Produto produto10 = new Produto("Queijo", 000010, fornecedor1, 6.40, 8.00, "Perecível",randonDate());
        Produto produto11 = new Produto("Iorgute", 000011, fornecedor1, 2.00, 3.00, "Perecível",randonDate());
        Produto produto12 = new Produto("Requeijão", 000012, fornecedor1, 4.40, 6.00, "Não parecível",randonDate());
        Produto produto13 = new Produto("Manteiga", 000013, fornecedor1, 2.50, 3.90, "Não parecível",randonDate());
        Produto produto14 = new Produto("Biscoitos", 000014, fornecedor1, 1.50, 2.99, "Não parecível",randonDate());
        Produto produto15 = new Produto("Torta", 000015, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto16 = new Produto("Brigadeiro", 000016, fornecedor1, 1.00, 2.00, "Não parecível",randonDate());
        Produto produto17 = new Produto("Salgadinhos", 000017, fornecedor1, 3.50, 5.50, "Perecível",randonDate());
        Produto produto18 = new Produto("Croissant", 100018, fornecedor1, 2.50, 4.50, "Perecível",randonDate());
        Produto produto19 = new Produto("Leite com Nescau", 300019, fornecedor1, 1.50, 3.00, "Perecível",randonDate());
        Produto produto20 = new Produto("Café com Leite", 000020, fornecedor1, 1.50, 3.00, "Não parecível",randonDate());
        Produto produto21 = new Produto("Café Preto", 000021, fornecedor1, 0.99, 1.00, "Perecível",randonDate());
        Produto produto22 = new Produto("Pão Doce", 000022, fornecedor1, 1.99, 2.99, "Não parecível",randonDate());
        Produto produto23 = new Produto("Pão Fracês", 000023, fornecedor1, 1.99, 2.99, "Não parecível",randonDate());
        Produto produto24 = new Produto("Pão de Fôrma", 000024, fornecedor1, 1.99, 2.99, "Perecível",randonDate());
        Produto produto25 = new Produto("Pão de Massa Sovada", 000025, fornecedor1, 1.99, 2.99, "Não parecível",randonDate());
        Produto produto26 = new Produto("Pão Artezanal", 000026, fornecedor1, 1.99, 2.99, "Perecível",randonDate());
        Produto produto27 = new Produto("Pão sem Glútem", 000027, fornecedor1, 1.99, 2.99, "Não parecível",randonDate());
        Produto produto28 = new Produto("Chocolates", 100028, fornecedor1, 2.00, 4.00, "Não parecível",randonDate());
        Produto produto29 = new Produto("Sonho", 100029, fornecedor1, 2.00, 4.00, "Perecível",randonDate());
        Produto produto30 = new Produto("Quindim", 000030, fornecedor1, 1.90, 3.00, "Não parecível",randonDate());
        Produto produto31 = new Produto("Pudim", 000031, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto32 = new Produto("Pavé", 000032, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto33 = new Produto("Tortas Salgadas", 000033, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto34 = new Produto("Tortas Doces", 000034, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto35 = new Produto("Sanduíches", 000035, fornecedor1, 7.90, 10.00, "Não parecível",randonDate());
        Produto produto36 = new Produto("Cappuccino", 000036, fornecedor1, 3.00, 5.00, "Perecível",randonDate());
        Produto produto37 = new Produto("Balas", 000037, fornecedor1, 00.20, 00.50, "Perecível",randonDate());
        Produto produto38 = new Produto("Cocadas", 200038, fornecedor1, 00.50, 1.00, "Perecível",randonDate());
        Produto produto39 = new Produto("Chicletes", 100039, fornecedor1, 00.20, 00.50, "Perecível",randonDate());
        Produto produto40 = new Produto("Bolo sem Lactose", 000040, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto41 = new Produto("Bolo Fitness", 000041, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto42 = new Produto("Bolo com cobertura (contém lactose)", 000042, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto43 = new Produto("Bolo sem cobertura (contém lactose)", 000043, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto44 = new Produto("Cookies Integral", 000044, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        Produto produto45 = new Produto("Cookies", 000045, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto46 = new Produto("Chocolate Quente", 000046, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        Produto produto47 = new Produto("Mine Pizza", 000047, fornecedor1, 3.40, 5.00, "Perecível",randonDate());
        Produto produto48 = new Produto("Tapioca (Beiju)", 100048, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        Produto produto49 = new Produto("Cuscuz de Arroz", 100049, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        Produto produto50 = new Produto("Cuscuz de Milho", 000050, fornecedor1, 3.40, 5.00, "Não parecível",randonDate());
        
        this.listaProdutos.add(produto1);
        this.listaProdutos.add(produto2);
        this.listaProdutos.add(produto3);
        this.listaProdutos.add(produto4);
        this.listaProdutos.add(produto5);
        this.listaProdutos.add(produto6);
        this.listaProdutos.add(produto7);
        this.listaProdutos.add(produto8);
        this.listaProdutos.add(produto9);
        this.listaProdutos.add(produto10);
        this.listaProdutos.add(produto11);
        this.listaProdutos.add(produto12);
        this.listaProdutos.add(produto13);
        this.listaProdutos.add(produto14);
        this.listaProdutos.add(produto15);
        this.listaProdutos.add(produto16);
        this.listaProdutos.add(produto17);
        this.listaProdutos.add(produto18);
        this.listaProdutos.add(produto19);
        this.listaProdutos.add(produto20);
        this.listaProdutos.add(produto21);
        this.listaProdutos.add(produto22);
        this.listaProdutos.add(produto23);
        this.listaProdutos.add(produto24);
        this.listaProdutos.add(produto25);
        this.listaProdutos.add(produto26);
        this.listaProdutos.add(produto27);
        this.listaProdutos.add(produto28);
        this.listaProdutos.add(produto29);
        this.listaProdutos.add(produto30);
        this.listaProdutos.add(produto31);
        this.listaProdutos.add(produto32);
        this.listaProdutos.add(produto33);
        this.listaProdutos.add(produto34);
        this.listaProdutos.add(produto35);
        this.listaProdutos.add(produto36);
        this.listaProdutos.add(produto37);
        this.listaProdutos.add(produto38);
        this.listaProdutos.add(produto39);
        this.listaProdutos.add(produto40);
        this.listaProdutos.add(produto41);
        this.listaProdutos.add(produto42);
        this.listaProdutos.add(produto43);
        this.listaProdutos.add(produto44);
        this.listaProdutos.add(produto45);
        this.listaProdutos.add(produto46);
        this.listaProdutos.add(produto47);
        this.listaProdutos.add(produto48);
        this.listaProdutos.add(produto49);
        this.listaProdutos.add(produto50);
        
        return this.listaProdutos;
        
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
    public  Date randonDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2018, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return java.sql.Date.valueOf(randomBirthDate);
    }
    
    
    
}
