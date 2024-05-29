package MapAgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private  Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}
	
    public void adicionarContato(String nome, Integer telefone) {
          agendaContatosMap.put(nome, telefone);
	}
	

    public void removerContato(String nome) {
    	
    	if(!agendaContatosMap.isEmpty()) {
    		agendaContatosMap.remove(nome);
    	}
		
	}
    
   public void exibirContatos() {
	   System.out.println(agendaContatosMap);
	
    }
   
   public Integer pesquisarPorNome(String nome) {
	  Integer numeroPorNOme = null;
	  if(!agendaContatosMap.isEmpty()) {
		  numeroPorNOme = agendaContatosMap.get(nome);
	  }
	  return numeroPorNOme;
    }
    
   
   public static void main(String[] args) {
	  AgendaContatos agendaContatos = new AgendaContatos();
	  
	  agendaContatos.adicionarContato("Adair",    12345678);
	  agendaContatos.adicionarContato("Julio",    55512345);
	  agendaContatos.adicionarContato("Caio" ,    72859672);
	  agendaContatos.adicionarContato("Vladimir", 61528355);
	  agendaContatos.adicionarContato("Marcelo",  32957866);
	  

      agendaContatos.exibirContatos();
      
      
      agendaContatos.removerContato("Caio");

      agendaContatos.exibirContatos();

      System.out.println("o numero de é: " + agendaContatos.pesquisarPorNome("Adair"));
      
   }
}
