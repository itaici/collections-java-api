package Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjunstoConvidados {
	
	private Set<Convidado> convidadoSet;

	public ConjunstoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvidado) {
		
		convidadoSet.add(new Convidado(nome, codigoConvidado));
		
	}

	public void removerConvidadoProCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		
		convidadoSet.remove(convidadoParaRemover);
	}
	
	
	public int  contarConvidados() {
	  return convidadoSet.size();	
	
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
		
	}
	
	
	public static void main(String[] args) {
		ConjunstoConvidados conjuntoConvidados = new ConjunstoConvidados();
		
		System.err.println("Existem : " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");
		
		conjuntoConvidados.adicionarConvidado("Primeiro convidado", 1);
		conjuntoConvidados.adicionarConvidado("Segundo convidado", 2);
		conjuntoConvidados.adicionarConvidado("Terceiro convidado", 2);
		
		
		System.err.println("Existem : " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoProCodigoConvite(2);
		
		System.err.println("Existem : " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");
		 
	}
}
