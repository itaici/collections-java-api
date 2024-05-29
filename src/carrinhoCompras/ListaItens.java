package carrinhoCompras;

public class ListaItens {
      
	private String descricaoItem;

	public ListaItens(String descricaoItem) {
		super();
		this.descricaoItem = descricaoItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	@Override
	public String toString() {
		return descricaoItem + " ";
	}
	
}
