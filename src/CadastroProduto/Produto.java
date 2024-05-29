package CadastroProduto;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
  private String nome;
  private long codigoProduto;
  private double preco;
  private int quatidade;
  
public Produto(String nome, long codigoProduto, double preco, int quatidade) {
	this.nome = nome;
	this.codigoProduto = codigoProduto;
	this.preco = preco;
	this.quatidade = quatidade;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public int getQuatidade() {
	return quatidade;
}

public void setQuatidade(int quatidade) {
	this.quatidade = quatidade;
}

public long getCodigoProduto() {
	return codigoProduto;
}

@Override
public String toString() {
	return "Produto [nome=" + nome + ", codigoProduto=" + codigoProduto + ", preco=" + preco + ", quatidade="
			+ quatidade + "]";
}

@Override
public int hashCode() {
	return Objects.hash(codigoProduto);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	return codigoProduto == other.codigoProduto;
}

@Override
public int compareTo(Produto p) {
	// TODO Auto-generated method stub
	return nome.compareToIgnoreCase(p.getNome());
}
  
}


class ComparatorProPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}

 