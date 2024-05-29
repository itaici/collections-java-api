package AgendaContado;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}


	public void adicionarContato(String nome, int numeroContato) {
		contatoSet.add(new Contato(nome, numeroContato));
		
	}
	
	public void exibirContatos() {
		
		System.out.println(contatoSet);
		
	}

	
   public Set<Contato> pesquisaPorNome(String nome) {
	   Set<Contato> contatosPorNome = new HashSet<>();
	   
	   for(Contato c: contatoSet) {
		  if (c.getName().startsWith(nome)) {
			  contatosPorNome.add(c);
		  }
	   }
	   
	   return contatosPorNome;
	}
   
   public  Contato contatoAtualizado(String nome, int numero) {
	  Contato contatoAtulizado = null;
	  
	  for(Contato c: contatoSet) {
		  if (c.getName().equalsIgnoreCase(nome)) {
			  c.setNuemro(numero);
			  contatoAtulizado = c;
			  break;
		  }
		}
	  
	  return contatoAtulizado;
	  
	
   }   
   
   public static void main(String[] args) {
	  AgendaContatos agendaContatos = new AgendaContatos();
	  
	  agendaContatos.exibirContatos();
	  
	  agendaContatos.adicionarContato("Igor", 12345678);
	  agendaContatos.adicionarContato("Igor", 99912345);
	  agendaContatos.adicionarContato("Fernando", 55668877);
	  agendaContatos.adicionarContato("Gabriela", 12345678);
	  agendaContatos.adicionarContato("Gael", 93355223);
	  
	  agendaContatos.exibirContatos();
	   
	  System.err.println(agendaContatos.pesquisaPorNome("Ga")); 
	  
	  System.out.println("Contato atualizado: " + agendaContatos.contatoAtualizado("Gael",5551234));
	  
	  agendaContatos.exibirContatos();
   }
}
