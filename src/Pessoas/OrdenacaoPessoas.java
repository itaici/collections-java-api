package Pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
   private List<Pessoa> pessoaList;

public OrdenacaoPessoas() {
	this.pessoaList = new ArrayList<>();
}
   

public void adicionmarPessoas(String nome, int idade, double altura) {
     pessoaList.add(new Pessoa(nome, idade, altura));
	
}
   

public List<Pessoa> ordernarPorIdade() {
   List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);	
   Collections.sort(pessoasPorIdade);
   return pessoasPorIdade;
}

public List<Pessoa> ordernarPorAltura() {
	   List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);	
	   Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
	   return pessoasPorAltura;
	}



public static void main(String[] args) {
	OrdenacaoPessoas ordernarPessoas = new OrdenacaoPessoas();
	
	ordernarPessoas.adicionmarPessoas("Nome 1", 20, 1.56);
	ordernarPessoas.adicionmarPessoas("Nome 2", 45, 1.80);
	ordernarPessoas.adicionmarPessoas("Nome 3", 30, 1.74);
	ordernarPessoas.adicionmarPessoas("Nome 4", 25, 1.70);
	ordernarPessoas.adicionmarPessoas("Nome 5", 17, 1.56);
	
	System.out.println(ordernarPessoas.ordernarPorAltura());
	System.out.println(ordernarPessoas.ordernarPorIdade());
	
	
	}
}
