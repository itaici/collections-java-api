package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class carrinhoCompras {
	
	private List<ListaItens> carrinhoCompras;

	public carrinhoCompras() {
		this.carrinhoCompras = new ArrayList<ListaItens>();
	}

	public void adicinarItem(String decricao) {
          carrinhoCompras.add(new ListaItens(decricao));
	
	}
	

	public void removerItem(String descricao) {
		List<ListaItens> itemRemocao = new ArrayList<ListaItens>();
		
		
		for (ListaItens i : carrinhoCompras) {
			if (i.getDescricaoItem().equalsIgnoreCase(descricao)) {
				itemRemocao.add(i);
			}
		}
	
		carrinhoCompras.removeAll(itemRemocao);
		
	}
	
	
	public int numeroTotalItens() {
		return carrinhoCompras.size();
		
	}
	
	public void itensCarrinhoCompras() {
		System.err.println("Itens lista :" + carrinhoCompras);
	}

	
	public static void main(String[] args) {
		carrinhoCompras carrinhoCompras = new carrinhoCompras();
		
		System.err.println("Quantidade lista carrinho : " + carrinhoCompras.numeroTotalItens());

		carrinhoCompras.adicinarItem("Acucar");
		carrinhoCompras.adicinarItem("Fejao");
		carrinhoCompras.adicinarItem("Arroz");
		
		System.err.println("Quantidade lista carrinho : " + carrinhoCompras.numeroTotalItens());

		carrinhoCompras.removerItem("Acucar");
		
		System.err.println("Quantidade lista carrinho : " + carrinhoCompras.numeroTotalItens());

		carrinhoCompras.itensCarrinhoCompras();		
		
	}
}

