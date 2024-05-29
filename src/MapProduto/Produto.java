package MapProduto;

public class Produto {
	
	private  String name;
	private  Double preco;
    private  int quantidade;
	public Produto(String name, Double preco, int quantidade) {
		this.name = name;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getName() {
		return name;
	}
	public Double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
    
	
	
    
	

}
