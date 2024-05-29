package CadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();

	}
	
	
	public void adicionarProduto(long codigo, String nome, double preco, int quantidae) {
		produtoSet.add(new Produto(nome, codigo, preco, quantidae));
		
	}
	
	
	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> produtoPorNome = new TreeSet<Produto>(produtoSet);
	  return produtoPorNome;
	}
	
	
	public Set<Produto> exibirProdutoPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorProPreco());
		produtoPorPreco.addAll(produtoSet);
	  
	  return produtoPorPreco;
	}
	
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProduto = new CadastroProdutos();
		
		cadastroProduto.adicionarProduto(1, "PAO", 1.00, 10);
		cadastroProduto.adicionarProduto(3, "Coca", 10.00, 100);
		cadastroProduto.adicionarProduto(55, "Acucar", 5.00, 2500);
		cadastroProduto.adicionarProduto(1, "Bolacha", 2.99, 9350);
		cadastroProduto.adicionarProduto(150, "Queijo", 30.00, 120);
		
		
		System.out.println(cadastroProduto.produtoSet);
		
		System.err.println(cadastroProduto.exibirProdutoPorNome());
		
		System.err.println(cadastroProduto.exibirProdutoPorPreco());
		
		
	}
}
