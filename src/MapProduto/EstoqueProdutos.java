package MapProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();
		
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	
	public void exibirProduto() {
		System.out.println(estoqueProdutoMap);
	}
	
	public Double caçluarValorTotalEstoque() {
		Double valorTotalEstoque = 0d;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p: estoqueProdutoMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade(); 
			}
		}
		
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		Double maiorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p: estoqueProdutoMap.values()) {
				if (p.getPreco() > maiorPreco) {
					produtoMaisCaro = p;
					maiorPreco = p.getPreco();
				}
			}
		}
		
		return produtoMaisCaro;
	}

	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		Double menorPreco = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p: estoqueProdutoMap.values()) {
				if (p.getPreco() < menorPreco || produtoMaisBarato == null) {
					produtoMaisBarato = p;
					menorPreco = p.getPreco();
				}
			}
		}
		
		return produtoMaisBarato;
	}	
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaisCaro = null;
		Double maiorPrecoQuantidade = Double.MIN_VALUE;
		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto p: estoqueProdutoMap.values()) {
				if (p.getPreco() * p.getQuantidade() > maiorPrecoQuantidade) {
					produtoMaisCaro = p;
					maiorPrecoQuantidade = p.getPreco() * p.getQuantidade();
				}
			}
		}
		
		return produtoMaisCaro;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.exibirProduto();
		
		estoqueProdutos.adicionarProduto(1, "Acucar", 10, 3.5);
		estoqueProdutos.adicionarProduto(2, "Sal", 100, 1.25);
		estoqueProdutos.adicionarProduto(3, "Arroz", 50, 23.99);
		estoqueProdutos.adicionarProduto(4, "Feijao", 250, 5.65);
		
		estoqueProdutos.exibirProduto();
		
		
		System.out.println("Valor Total do esteoque R$ " + estoqueProdutos.caçluarValorTotalEstoque());
		System.out.println("Produto mais caro " + estoqueProdutos.obterProdutoMaisCaro());
		System.out.println("Produto mais barato " + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("Produto mais valioso " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
	}
}
